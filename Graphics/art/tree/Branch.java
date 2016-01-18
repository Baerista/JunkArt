package art.tree;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class Branch{
    boolean isGrown;

    int angle;
    int length;
    int width;

    int r;
    int g;

    int x;
    int y;

    ArrayList<Branch> branches;

    public Branch(){
        angle = -90;
        length = 90;
        width = 70;

        r = 80;
        g = 70;   

        x = 500;
        y = 1000;

        branches = new ArrayList<Branch>();

        isGrown = false;
    }

    public Branch(
    int sA, int sL, int sW, 
    int sR, int sG, 
    int sX, int sY){
        angle = sA;
        length = sL;
        width = sW;

        r = sR;
        g = sG;     

        x = sX;
        y = sY;

        branches = new ArrayList<Branch>();

        isGrown = false;
    }

    public void grow(int step){
        //System.out.println(step);
        if(step <= 0){
            return;
        }else{
            int newAngle = (int)(Math.random() * 10) + 15;
            int newLength = (length - (length/8));
            int newWidth = (width - width/10);

            int newR = r - ((int)(Math.random() * 5) + 1);
            int newG = g + ((int)(Math.random() * 10) + 5);

            int newX = (int)(length * Math.cos(Math.toRadians(angle))) + x;
            int newY = (int)(length * Math.sin(Math.toRadians(angle))) + y;

            if(newR < 0){
                newR = 0;
            }
            if(newG > 240){
                newG = 240;
            }
            branches.add(new Branch(angle + newAngle, newLength, newWidth, newR, newG, newX, newY));
            branches.get(0).grow(step - 1);

            branches.add(new Branch(angle - newAngle, newLength, newWidth, newR, newG, newX, newY));
            branches.get(1).grow(step - 1);

            /*if(step < 10){
            branches.add(new Branch(angle + 180, newLength, newWidth, newR, newG, newX, newY));
            branches.get(2).grow(step-2);
            }*/

        }

    }

    public void grow(){
        if(isGrown == false){
            int newAngle = (int)(Math.random() * 10) + 15;
            int newLength = (length - (length/8));
            int newWidth = (width - width/10);

            int newR = r - ((int)(Math.random() * 5) + 1);
            int newG = g + ((int)(Math.random() * 10) + 5);

            int newX = (int)(length * Math.cos(Math.toRadians(angle))) + x;
            int newY = (int)(length * Math.sin(Math.toRadians(angle))) + y;

            if(newR < 0){
                newR = 0;
            }
            if(newG > 240){
                newG = 240;
            }

            branches.add(new Branch(angle + newAngle, newLength, newWidth, newR, newG, newX, newY));

            branches.add(new Branch(angle - newAngle, newLength, newWidth, newR, newG, newX, newY));
            
            isGrown = true;
        }else{
            branches.get(0).grow();

            branches.get(1).grow();
        }
    }

    public void paint(Graphics gr){
        for(int a = 0; a < width; a++){
            int rr = r + (int)(Math.random() * 20); 
            int gg = g + (int)(Math.random() * 10);
            int b = (int)(Math.random() * 50);
            gr.setColor(new Color(rr, gg, b));

            int x1 = (int)((a - (width/2)) * Math.cos(Math.toRadians(angle + 90))) + x;
            int y1 = (int)((a - (width/2)) * Math.sin(Math.toRadians(angle + 90))) + y;
            int x2 = (int)(length * Math.cos(Math.toRadians(angle))) + x1;
            int y2 = (int)(length * Math.sin(Math.toRadians(angle))) + y1; 
            gr.drawLine(x1, y1, x2, y2);
            gr.drawLine(x1 + 1, y1 + 1, x2, y2);
            gr.drawLine(x1 - 1, y1 + 1, x2, y2);
            gr.drawLine(x1 + 1, y1 - 1, x2, y2);
            gr.drawLine(x1 - 1, y1 - 1, x2, y2);

        }
        /*try{
        Thread.sleep(100);
        }catch(InterruptedException e){
        }*/

        //this.grow(
        for(int a = 0; a < branches.size(); a++){
            branches.get(a).paint(gr);
        }
    }  
}
