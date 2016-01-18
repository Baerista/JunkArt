package lineWorld;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class LineGroup{
    ArrayList<Line> line1 = new ArrayList<Line>();
    ArrayList<Line> line2 = new ArrayList<Line>();
    ArrayList<Line> line3 = new ArrayList<Line>();
    int [] theColors;

    int xMin;
    int yMin;
    int xMax;
    int yMax;

    int x;
    int y;
    int length;
    int line1angle;
    int line2angle;
    int line3angle; 

    int objectAngle;
    boolean clockwise;
    int directionChange;
    int turnAngle;
    int fade;

    public LineGroup(int [] bounds, int someTurn, int someLength, int someFade, int [] someColors){
        xMin = bounds[0];
        yMin = bounds[1];
        xMax = bounds[2];
        yMax = bounds[3];

        length = someLength;
        turnAngle = someTurn;
        fade = someFade;

        theColors = someColors;

        x = (int)((Math.random() * ((xMax - length) - (xMin + length))) + (xMin + length));
        y = (int)((Math.random() * ((yMax - length) - (yMin + length))) + (yMin + length));
        line1angle = 0;
        line2angle = 120;
        line3angle = 240;

        objectAngle = (int)(Math.random() * 360);
        clockwise = true;
        directionChange = 0;
    }
    
    public LineGroup(int [] bounds, int someTurn, int someLength, int someFade){
        xMin = bounds[0];
        yMin = bounds[1];
        xMax = bounds[2];
        yMax = bounds[3];

        length = someLength;
        turnAngle = someTurn;
        fade = someFade;

        int [] a = {(int)(Math.random() * 256),(int)(Math.random() * 256),(int)(Math.random() * 256),(int)(Math.random() * 256),(int)(Math.random() * 256),(int)(Math.random() * 256),(int)(Math.random() * 256),(int)(Math.random() * 256),(int)(Math.random() * 256)};
        theColors = a;

        x = (int)((Math.random() * ((xMax - length) - (xMin + length))) + (xMin + length));
        y = (int)((Math.random() * ((yMax - length) - (yMin + length))) + (yMin + length));
        line1angle = 0;
        line2angle = 120;
        line3angle = 240;

        objectAngle = (int)(Math.random() * 360);
        clockwise = true;
        directionChange = 0;
    }
    
    public void setFade(int newFade){
        fade = newFade;        
        if(fade < 0){
            fade = 0;
        }
    }
    
    public void setAngle(int newAngle){
        turnAngle = newAngle;
        /*if(turnAngle < 0){
            turnAngle = 0;
        }*/
    }
    
    public void setLength(int newLength){
        length = newLength;
        if(length < 0){
            length = 0;
        }
    }

    public void step(){
        line1.add(new Line(x, y, line1angle, length, theColors[0], theColors[1], theColors[2]));
        line2.add(new Line(x, y, line2angle, length, theColors[3], theColors[4], theColors[5]));
        line3.add(new Line(x, y, line3angle, length, theColors[6], theColors[7], theColors[8]));

        checkEm();
    } 

    public void checkEm(){
        if(x + length + 10 > xMax){
            objectAngle = (int)(Math.random() * 90) + 135;
            clockwise = !clockwise;
        }
        if((x - length) - 10 < xMin){
            objectAngle = (int)(Math.random() * 90) - 45;
            clockwise = !clockwise;
        }
        if(y + length + 10 > yMax){
            objectAngle = (int)(Math.random() * 90) + 225;
            clockwise = !clockwise;
        }
        if((y - length) - 10 < yMin){
            objectAngle = (int)(Math.random() * 90) + 45;
            clockwise = !clockwise;
        }

        if(clockwise){
            objectAngle+=(int)(Math.random() * 5) + 2;
            line1angle-=turnAngle;
            line2angle-=turnAngle;
            line3angle-=turnAngle;

        }else{
            objectAngle-=(int)(Math.random() * 5) + 2;
            line1angle+=turnAngle;
            line2angle+=turnAngle;
            line3angle+=turnAngle;

        }
        x+= (int)(10 * Math.cos(Math.toRadians(objectAngle)));
        y+= (int)(10 * Math.sin(Math.toRadians(objectAngle)));
        if((int)(Math.random() * 6) - 3 > 0)
        directionChange++;
        if(directionChange > 10){
            clockwise = !clockwise;            
            directionChange = 0;
        }
    }

    public void paint(Graphics gr){
        for(int a = 0; a < line1.size(); a++){
            if(!line1.get(a).paint(gr, fade)){
                line1.remove(a);
            }
        }
        for(int a = 0; a < line2.size(); a++){
            if(!line2.get(a).paint(gr, fade)){
                line2.remove(a);
            }
        }
        for(int a = 0; a < line3.size(); a++){
            if(!line3.get(a).paint(gr, fade)){
                line3.remove(a);
            }                    
        }
    }  
}
