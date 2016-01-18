package art.ballPit; 

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class BallPit extends JPanel implements MouseListener{
    int size;

    ArrayList<Ball> theBalls;

    public BallPit(int startSize){
        size = startSize;// default is 500

        theBalls = new ArrayList<Ball>();

        boolean isRandom = false;// add a randomizer for generating balls

        int numBalls = size/50;
        int ballSize = size/5;
        int ballShrink = size/100;

        int rStart = 10;
        int gStart = 0;
        int bStart = 50;

        int rMod = 5;
        int gMod = 20;
        int bMod = 10;

        for(int a = 0; a < numBalls; a++){
            int r = rStart + (a * rMod);
            int g = gStart + (a * gMod); //(int)(Math.random() * 256);
            int b = bStart + (a * bMod);

            if(r>255)
                r=255;
            if(r<0)
                r=0;
            if(g>255)
                g=255;
            if(g<0)
                g=0;
            if(b>255)
                b=255;
            if(b<0)
                b=0;

            Color c = new Color(r, g, b);

            theBalls.add(new Ball(size/2, size/2, ballSize - (ballShrink * a), c));
        }
    }

    public void play(){
        /*while(true){
            /*try {
            Thread.sleep(100);
            }catch(InterruptedException e){
            }
            paintImmediately(0,0,1000,1000);
        }*/    
        paintImmediately(0,0,size,size);
    }

    public void mouseClicked(MouseEvent e){
    }

    public void mouseEntered(MouseEvent e){
        /*int x = e.getX()-4;
        int y = e.getY()-30;
        System.out.println("X coord: " + x + ", Y coord: " + y);     
        
        for(int a = 0; a < theBalls.size(); a++){
            theBalls.get(a).move(x,y, 100.0 * (double)((double)(a+1)/(double)(theBalls.size())));
        }

        this.repaint();*/
    }

    public void mouseExited(MouseEvent e) {
        /*int x = e.getX()-4;
        int y = e.getY()-30;
        System.out.println("X coord: " + x + ", Y coord: " + y);     
        
        for(int a = 0; a < theBalls.size(); a++){
            theBalls.get(a).move(x,y, 100.0 * (double)((double)(a+1)/(double)(theBalls.size())));
        }

        this.repaint();*/
    }

    public void mousePressed(MouseEvent e) {
        int x = e.getX()-4;
        int y = e.getY()-30;
        System.out.println("X coord: " + x + ", Y coord: " + y);     
        
        for(int a = 0; a < theBalls.size(); a++){
            theBalls.get(a).move(x,y, 100.0 * (double)((double)(a+1)/(double)(theBalls.size())));
        }

        this.repaint();
    }

    public void mouseReleased(MouseEvent e) {
        /*int x = e.getX()-4;
        int y = e.getY()-30;
        System.out.println("X coord: " + x + ", Y coord: " + y);     
        
        for(int a = 0; a < theBalls.size(); a++){
            theBalls.get(a).move(x,y, 100.0 * (double)((double)(a+1)/(double)(theBalls.size())));
        }

        this.repaint();*/
    }

    public void paint(Graphics g){
        //g.setColor(Color.BLACK);
        //g.fillRect(0,0,size,size);
        
        for(int a = 0; a < theBalls.size(); a++){
            theBalls.get(a).paint(g);
        }
    }
}