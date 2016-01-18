package lineWorld;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class Line{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    private int r;
    private int g;
    private int b;

    public Line(int anX, int anY, int anAngle, int anLength, int anR, int anG, int anB){
        x1 = anX;        
        y1 = anY;
        
        x2 = (int)(anLength * Math.cos(Math.toRadians(anAngle))) + x1;
        y2 = (int)(anLength * Math.sin(Math.toRadians(anAngle))) + y1;
        
        r = anR;
        g = anG;
        b = anB;        
    }
    

    public boolean paint(Graphics gr, int fade){
        gr.setColor(new Color(r,g,b));
        //gr.drawLine(x1,y1,x2,y2); 
        gr.drawLine(x1-1,y1,x2,y2);
        gr.drawLine(x1+1,y1,x2,y2);
        gr.drawLine(x1,y1-1,x2,y2);
        gr.drawLine(x1,y1+1,x2,y2);
        r-=fade;
        g-=fade;
        b-=fade;        
        if(r < 0)
        r = 0;
        if(g < 0)
        g = 0;
        if(b < 0)
        b = 0;        
        if((r + g + b) == 0)
        return false;
        return true;
    }   
}
