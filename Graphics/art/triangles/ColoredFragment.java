package art.triangles;

import art.lines.*;
import java.awt.*;

public class ColoredFragment extends Fragment{
    Gradient G;

    public ColoredFragment(xyPair center, double angle, double distance, Gradient Gr){
        super(center,angle,distance);
        G = Gr;
    }

    public ColoredFragment(xyPair[] startPoints, xyPair[] endPoints, double angle, Gradient Gr){
        super(startPoints,endPoints,angle);
        G = Gr;
    }

    public ColoredFragment(xyPair[] startPoints, double angle, double distance, double orientation, Gradient Gr){
        super(startPoints,angle,distance,orientation);
        G = Gr;
    }
    
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
            
            int offset = 25;
            int doubleOffset = offset * 2;

            thePoints[0] = p4;
            thePoints[1] = cp1;
            thePoints[2] = cp3;
            nextFrags[0] = new ColoredFragment(thePoints, angle + 90.0, center1.getLength() / 1.5, angle, new Gradient(G.c2, new Clr(G.c2.r, G.c2.g - offset, G.c2.b - offset)));

            thePoints[0] = cp1;
            thePoints[1] = p5;
            thePoints[2] = cp2;
            nextFrags[1] = new ColoredFragment(thePoints, angle + 210.0, center2.getLength() / 1.5, angle/* + 120*/, new Gradient(G.c2, new Clr(G.c2.r -offset, G.c2.g, G.c2.b - offset)));

            thePoints[0] = cp3;
            thePoints[1] = cp2;
            thePoints[2] = p6;
            nextFrags[2] = new ColoredFragment(thePoints, angle + 330.0, center3.getLength() / 1.5, angle /*+ 240*/, new Gradient(G.c2, new Clr(G.c2.r -offset, G.c2.g - offset, G.c2.b)));

            thePoints[0] = cp3;
            thePoints[1] = cp1;
            thePoints[2] = cp2;
            nextFrags[3] = new ColoredFragment(thePoints, thePoints, this.angle + 300.0, new Gradient(G.c2, new Clr(G.c1.r-doubleOffset, G.c1.g-doubleOffset, G.c1.b-doubleOffset)));
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
            
            Clr C = G.getColor(percentage);
            
            g.setColor(new Color(C.r,C.g,C.b));
            g.fillPolygon(xPoints,yPoints,3);
        }
    }
}
