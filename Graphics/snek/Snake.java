package snek;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class Snake{
    ArrayList<Segment> theSegments = new ArrayList<Segment>();

    int [] theColors;

    int xMin;
    int yMin;
    int xMax;
    int yMax;

    int x;
    int y;
    int size;
    int speed;

    int objectAngle;
    
    Color color1; 
    Color color2;

    public Snake(int [] bounds, Color aColor1, Color aColor2, int anX, int anY, int anAngle){
        xMin = bounds[0];
        yMin = bounds[1];
        xMax = bounds[2];
        yMax = bounds[3];     

        color1 = aColor1;
        color2 = aColor2;        

        x = anX;
        y = anY;    
        size = 10;
        speed = 5;
        objectAngle = anAngle;
    }    
    
    public void turnLeft(int turn){
        objectAngle-=turn;
    }
    
    public void turnRight(int turn){
        objectAngle+=turn;
    }
    
    public void addSegment(){
        theSegments.add(new Segment(theSegments.get(theSegments.size() - 1).getX(), theSegments.get(theSegments.size() - 1).getY(), size, speed));
    }

    public void step(){
        for(int a = theSegments.size() - 1; a > 0; a++){
            theSegments.get(a).move(theSegments.get(a - 1).getX(),theSegments.get(a - 1).getY());
        }
        x+= (int)(speed * Math.cos(Math.toRadians(objectAngle)));
        y+= (int)(speed * Math.sin(Math.toRadians(objectAngle)));
        theSegments.get(0).move(x,y);
    } 

    /*public void checkEm(){
        if(
                
    }*/

    public void paint(Graphics gr){
        for(int a = theSegments.size() - 1; a >= 0; a--){
            if((a%2)==0){
                theSegments.get(a).paint(color1);
            }else{
                theSegments.get(a).paint(color2);
            }
        }
    }  
}
