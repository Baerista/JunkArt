package snek;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class SnakeWorld extends JPanel implements KeyListener{
    char c;
    boolean gameOver;

    int xMin;
    int yMin;
    int xMax;
    int yMax;

    int length;
    
    Snake snake1;
    //Snake snake2;
    //Snake snake3;
    //Snake snake4;
    
    ArrayList<Food> theFood;

    public SnakeWorld(int [] theBounds){
        xMin = theBounds[0];
        yMin = theBounds[1];
        xMax = theBounds[2];
        yMax = theBounds[3];
        
        //gameover = false;
        
        //theFood = {
        
        //bounds, color, x, y, angle
        snake1 = new Snake(theBounds, new Color(255,0,0), new Color(230,0,0), 350, 350, 0);
    }

    public void run(){
        /*while(!gameOver){ 
            for(int a = 0; a < theGroups.size(); a++){
                snake1.step();
            }

            paintImmediately(xMin, yMin, xMax, yMax);
            try{
                Thread.sleep(20);
            }catch(InterruptedException e){
            }             
        }   */     
    } 

    public void paint(Graphics gr){
       /* gr.setColor(new Color(0,0,0));
        gr.fillRect(xMin, yMin, xMax, yMax);

        for(int a = 0; a < theGroups.size(); a++){
            theGroups.get(a).paint(gr);
        }*/
    }  

    public void keyPressed(KeyEvent e) {
        c = e.getKeyChar();
    }

    public void keyTyped(KeyEvent e) {
        c = e.getKeyChar();
    }

    public void keyReleased(KeyEvent e){
        c = e.getKeyChar();

        /*if(c == 'q'){    
            for(int a = 0; a < theGroups.size(); a++){
                theGroups.get(a).setFade(theGroups.get(a).fade - 1);  
                System.out.println("Fade " + (a+1) + " = " + theGroups.get(a).fade);
            }
        }

        if(c == 'a'){
            for(int a = 0; a < theGroups.size(); a++){
                theGroups.get(a).setFade(theGroups.get(a).fade + 1);
                System.out.println("Fade " + (a+1) + " = " + theGroups.get(a).fade);
            }
        }

        if(c == 'w'){
            for(int a = 0; a < theGroups.size(); a++){
                theGroups.get(a).setAngle(theGroups.get(a).turnAngle + 5);
                System.out.println("Angle " + (a+1) + " = " + theGroups.get(a).turnAngle);
            }
        }

        if(c == 's'){ 
            for(int a = 0; a < theGroups.size(); a++){
                theGroups.get(a).setAngle(theGroups.get(a).turnAngle - 5);
                System.out.println("Angle " + (a+1) + " = " + theGroups.get(a).turnAngle);
            }
        }

        if(c == 'e'){
            for(int a = 0; a < theGroups.size(); a++){
                theGroups.get(a).setLength(theGroups.get(a). length + 2);
                System.out.println("Length " + (a+1) + " = " + theGroups.get(a).length);
            }
        }

        if(c == 'd'){
            for(int a = 0; a < theGroups.size(); a++){
                theGroups.get(a).setLength(theGroups.get(a). length - 2);
                System.out.println("Length " + (a+1) + " = " + theGroups.get(a).length);
            }
        }     */
    }
}
