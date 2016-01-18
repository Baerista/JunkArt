package art.ballPit; 

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class Ball{    
    int x;
    int y;
    int size;
    Color c;

    public Ball(int xx, int yy, int ss, Color cc){
        x=xx;
        y=yy;
        size=ss;
        c=cc;
    }
    
    public void move(int xx, int yy, double percentage){
        if(x < xx){
            x = (x + (int)((double)(xx-x) * (percentage/100.0)));
        }else{
            x = (x - (int)((double)(x-xx) * (percentage/100.0)));
        }
        
        if(y < yy){
            y = (y + (int)((double)(yy-y) * (percentage/100.0)));
        }else{
            y = (y - (int)((double)(y-yy) * (percentage/100.0)));
        }
    }  
    
    public void paint(Graphics gr){
        gr.setColor(c);
        gr.fillOval(x-(size/2), y-(size/2), size, size);
    }  
}
