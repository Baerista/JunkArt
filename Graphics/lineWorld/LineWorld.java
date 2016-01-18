package lineWorld;


import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class LineWorld extends JPanel implements KeyListener{
    ArrayList<LineGroup> theGroups;

    char c;

    int xMin;
    int yMin;
    int xMax;
    int yMax;

    int length;    

    public LineWorld(int [] theBounds, ArrayList<LineGroup> someGroups){
        xMin = theBounds[0];
        yMin = theBounds[1];
        xMax = theBounds[2];
        yMax = theBounds[3];

        theGroups = someGroups;
    }

    public void run(){
        while(true){ 
            for(int a = 0; a < theGroups.size(); a++){
                theGroups.get(a).step();
            }

            paintImmediately(xMin, yMin, xMax, yMax);
            try{
                Thread.sleep(20);
            }catch(InterruptedException e){
            }             
        }
    } 

    public void paint(Graphics gr){
        gr.setColor(new Color(0,0,0));
        gr.fillRect(xMin, yMin, xMax, yMax);

        for(int a = 0; a < theGroups.size(); a++){
            theGroups.get(a).paint(gr);
        }
    }  

    public void keyPressed(KeyEvent e) {
        c = e.getKeyChar();
    }

    public void keyTyped(KeyEvent e) {
        c = e.getKeyChar();
    }

    public void keyReleased(KeyEvent e){
        c = e.getKeyChar();

        if(c == 'q'){    
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
                theGroups.get(a).setAngle(theGroups.get(a).turnAngle + 1);
                System.out.println("Angle " + (a+1) + " = " + theGroups.get(a).turnAngle);
            }
        }

        if(c == 's'){ 
            for(int a = 0; a < theGroups.size(); a++){
                theGroups.get(a).setAngle(theGroups.get(a).turnAngle - 1);
                System.out.println("Angle " + (a+1) + " = " + theGroups.get(a).turnAngle);
            }
        }

        if(c == 'e'){
            for(int a = 0; a < theGroups.size(); a++){
                theGroups.get(a).setLength(theGroups.get(a). length + 1);
                System.out.println("Length " + (a+1) + " = " + theGroups.get(a).length);
            }
        }

        if(c == 'd'){
            for(int a = 0; a < theGroups.size(); a++){
                theGroups.get(a).setLength(theGroups.get(a). length - 1);
                System.out.println("Length " + (a+1) + " = " + theGroups.get(a).length);
            }
        }     
    }
}
