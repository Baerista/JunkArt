package snek;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class Food{
    int x;
    int y;
    int size;
    int direction;
    int speed;
    Graphics gr;

    public Food(int anX, int anY, int aDirection){
        x = anX;
        y = anY;
        size = 16;
        speed = 5;
        direction = aDirection;
    }

    public void move(){
        x = (int)(speed * Math.cos(Math.toRadians(direction))) + x;
        y = (int)(speed * Math.sin(Math.toRadians(direction))) + y;
    }
    
    
    
    public void paint(){
        for(int a = size; a > (size/2); a-=2){
            gr.setColor(new Color(a,a,a));
            gr.fillOval(x - (size/2), y - (size/2), size, size);
        }
    }
}
