package snek;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class Segment{
    int x;
    int y;
    int size;
    int direction;
    int speed;
    Graphics gr;
    int directionAngle;

    public Segment(int anX, int anY, int aSize, int aSpeed){
        x = anX;
        y = anY;
        size = aSize;
        speed = aSpeed;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int[] getHitbox(){
        int [] theHitbox = {x - (size/2), y - (size/2), x + (size/2), y + (size/2)};
        return theHitbox;
    }

    public void move(int x2, int y2){
        x = x2;
        y = y2;
    }

    public void paint(Color theColor){
        //for(int a = size; a > (size/2); a--){
        gr.setColor(theColor);
        gr.fillOval(x - (size/2), y - (size/2), size, size);
        //}
    }
}
