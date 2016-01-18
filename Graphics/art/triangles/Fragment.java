package art.triangles;

import art.lines.*;

//import javax.swing.*;
//import java.awt.event.*;
//import java.awt.Dimension;
import java.awt.*;
//import java.util.*;

public class Fragment extends Triangle{
    boolean broken;
    double angle;

    xyPair p4;
    xyPair p5;
    xyPair p6;

    Fragment [] nextFrags;

    public Fragment(xyPair center, double angle, double distance){
        super(center,angle,distance);

        p4 = p1;
        p5 = p2;
        p6 = p3;

        broken = false;
        this.angle = angle;

        nextFrags = new Fragment[4];
    }

    public Fragment(xyPair[] startPoints, xyPair[] endxyPairs, double angle){
        super(startPoints);

        if(endxyPairs.length < 3){
            throw new RuntimeException("not enough points there, fuckwad");
        }else{            
            p4 = endxyPairs[0];
            p5 = endxyPairs[1];
            p6 = endxyPairs[2];
        }

        broken = false;
        this.angle = angle;

        nextFrags = new Fragment[4];
    }

    public Fragment(xyPair[] startPoints, double angle, double distance, double orientation){
        super(startPoints);

        p4 = new xyPair(p1, angle, distance);
        p5 = new xyPair(p2, angle, distance);
        p6 = new xyPair(p3, angle, distance);

        broken = false;
        this.angle = orientation;

        nextFrags = new Fragment[4];
    }

    /*
    .........p4
    ............
    ......cp3...cp1
    ................
    ...p6....cp2....p5

     */
    void createFragments(){
        if(broken){
            for(int a = 0; a < 4; a++){
                nextFrags[a].createFragments();
            }
        }else{
            broken = true;

            Line side1 = new Line(p4,p5);
            Line side2 = new Line(p5,p6);
            Line side3 = new Line(p6,p4);

            xyPair cp1 = side1.getHalfway();
            xyPair cp2 = side2.getHalfway();
            xyPair cp3 = side3.getHalfway();

            Line center1 = new Line(cp3, cp1);
            Line center2 = new Line(cp1, cp2);
            Line center3 = new Line(cp2, cp3);

            xyPair [] thePoints = new xyPair[3];

            thePoints[0] = p4;
            thePoints[1] = cp1;
            thePoints[2] = cp3;
            nextFrags[0] = new Fragment(thePoints, this.angle + 150.0, center1.getLength() / 1.5, angle);

            thePoints[0] = cp1;
            thePoints[1] = p5;
            thePoints[2] = cp2;
            nextFrags[1] = new Fragment(thePoints, this.angle + 150.0, center2.getLength() / 1.5, angle /*+ /*120.0*/);

            thePoints[0] = cp3;
            thePoints[1] = cp2;
            thePoints[2] = p6;
            nextFrags[2] = new Fragment(thePoints, this.angle + 150.0, center3.getLength() / 1.5, angle/* + 240.0*/);

            thePoints[0] = cp2;
            thePoints[1] = cp3;
            thePoints[2] = cp1;
            nextFrags[3] = new Fragment(thePoints, thePoints, this.angle + 180.0);
        }
    }

    void paint(Graphics g, double percentage){
        if(broken){
            for(int a = 0; a < 4; a++){
                nextFrags[a].paint(g, percentage);
            }
        }else{
            int [] xPoints = new int[3];
            int [] yPoints = new int[3];
            
            xyPair xy1 = new Line(p1,p4).getPoint(percentage);
            xyPair xy2 = new Line(p2,p5).getPoint(percentage);
            xyPair xy3 = new Line(p3,p6).getPoint(percentage);
            
            xPoints[0] = (int)xy1.x;
            xPoints[1] = (int)xy2.x;
            xPoints[2] = (int)xy3.x;
            
            yPoints[0] = (int)xy1.y;
            yPoints[1] = (int)xy2.y;
            yPoints[2] = (int)xy3.y;
                                   
            //System.out.println("Printing the Triangle");
            g.setColor(Color.WHITE);
            g.fillPolygon(xPoints,yPoints,3);
        }
    }
}
