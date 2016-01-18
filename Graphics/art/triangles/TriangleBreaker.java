package art.triangles;

import art.lines.*;

import javax.swing.*;
//import java.awt.event.*;
//import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class TriangleBreaker extends JPanel{
    int width;
    int height;

    double percentage;

    Fragment theFrag;
    
    //ArrayList<Fragment> theFrags;

    public TriangleBreaker(){
        percentage = 0;
        width = 1000;
        height = 1000;

        xyPair point = new xyPair(500,500);        
        //theFrag = new Fragment(point, 270.0, 300);
        
        Gradient G = new Gradient(new Clr(255,255,255),new Clr(255,255,255));
                
        /*theFrags = new ArrayList<Fragment>();
        theFrags.add(new ColoredFragment(point, 90.0, 300, G));*/
        
        /*Triangle T = new Triangle(point, 90.0, 50.0, 300.0);
        theFrag = new ColoredFragment(T.getPoints(), T.getPoints(), 90.0, G);*/
        
        theFrag = new ColoredFragment(point, 90.0, 300, G);
        
        /*xyPair points [] = {new xyPair(500, 300), new xyPair(400, 700), new xyPair(600, 700)};    
        theFrag = new Fragment(points, 0, 0, 270);*/
        
    }

    public TriangleBreaker(int width, int height){
        this.width = width;
        this.height = height;
        percentage = 0;
    }

    public void run(){
        int cap = 8;//breaks between 9 and 10
        int current = 0;
        double offset = 0.0;
        
        while(current < cap){
            paintImmediately(0, 0, width, height);
            
            try{
                Thread.sleep(800);
            }catch(InterruptedException e){
            }   
            
            /*for(int a = 0; a < theFrags.size(); a++){
                
            }*/
            
            theFrag.createFragments();
            
            offset+=.08;
            current++;
            System.out.println(current + " current. " + cap + " cap."); 
            percentage = 0.0;
            
            for(percentage = 0.0; percentage <= 1.0; percentage += offset){
                if(percentage > 1.0){
                    percentage = 1.0;
                }
                paintImmediately(0, 0, width, height);
                try{
                    Thread.sleep(40);
                }catch(InterruptedException e){
                }  
            }          
        }
    }   

    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0,0,width,height);
        //System.out.println("Printing the screen");
        
        /*for(int a = 0; a < theFrags.size(); a++){
            theFrags.get(a).paint(g,percentage);
        }*/
        theFrag.paint(g, percentage);
    }
}