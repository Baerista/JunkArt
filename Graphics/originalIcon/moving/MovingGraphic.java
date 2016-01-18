package originalIcon.moving;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class MovingGraphic extends JPanel{    
    int r;
    int g;
    int b;

    boolean isGreening;

    int x;
    boolean movingRight;    
    int y;
    boolean movingDown;    
    int width;
    boolean gettingThinner;    
    int height;
    boolean shrinking;

    public MovingGraphic(int aX, int aY, int aWidth, int aHeight){
        r = 0;
        g = 0;
        b = 0;
        x = aX;
        y = aY;
        width = aWidth;
        height = aHeight;

        isGreening = true;

        movingRight = true;
        movingDown = true;
        gettingThinner = true;
        shrinking = true;
    }

    public void run(){
        while(true){
            if(isGreening){
                g++;
            }else{
                g--;
            }
            if(movingRight){
                x+=3;
            }else{
                x-=3;
            }
            if(movingDown){
                y+=5;
            }else{
                y-=5;
            }
            if(gettingThinner){
                width-=7;
            }else{
                width+=7;
            }
            if(shrinking){
                height-=2;
            }else{
                height+=2;
            }
            checkPos();

            paintImmediately(0, 0, 1000, 1000);
            try{
                Thread.sleep(150);
            }catch(InterruptedException e){
            }             
        }
    }   

    public void checkPos(){
        if(x < 400){
            x = 400;
            movingRight = true;
        }
        if(x > 500){
            x = 500;
            movingRight = false;
        }
        if(y < 400){
            y = 400;
            movingDown = true;
        }
        if(y > 500){
            y = 500;
            movingDown = false;
        }
        if(width < 50){
            width = 50;
            gettingThinner = false;
        }
        if(width > 700){
            width = 700;
            gettingThinner = true;
        }
        if(height < 50){
            height = 50;
            shrinking = false;
        }
        if(height > 700){
            height = 700;
            shrinking = true;
        }
    }

    public void paint(Graphics gr){
        gr.setColor(new Color(0,0,0));
        gr.fillRect(0, 0, 900, 900);
        colorWheel(gr);
        topFin(gr);
        bottomFin(gr);
        leftFin(gr);
        rightFin(gr);        
    }   

    void checkColors(){
        if(r > 255)
            r = 255;
        if(r < 0)
            r = 0;
        if(g > 255){
            isGreening = false;
            g = 255;
        }
        if(g < 0){
            isGreening = true;
            g = 0;
        }
        if(b > 255)
            b = 255;
        if(b < 0)
            b = 0;
    }    

    void topFin(Graphics gr){
        r = 0;
        b = 255;        
        for(int a = 0; a <= 255; a++){
            int x1 = (int)(x-(width/20.0)) ;
            int y1 = (int)(y-(height/2)+(int)((a/255.0)*(height/5.0)));
            int x2 = (int)((x-(width/20.0))-((a/255.0)*((3*width)/20.0)));
            int y2 = (int)(y-((3*height)/10.0));
            r++;
            b--;
            checkColors();
            gr.setColor(new Color(r, g, b));
            gr.drawLine(x1, y1, x2, y2);
            gr.drawLine(x1, y1, x + (int)(width/10.0), y1);
        }
        b = 255;
        r = 0;
        for(int a = 0; a <=255; a++){
            int x1 = x + (int)(width/10.0);
            int y1 = (int)(y-((6*height)/20.0)+(((255-a)/255.0)*((6*height)/20.0)));            
            int x2 = ((int)(x+(width/10.0))-(int)(((6*width)/20.0)*(a/255.0)));
            int y2 = (int)(y-((3*height)/10.0));
            b--;
            r++;            
            checkColors();
            gr.setColor(new Color(r, g, b));
            gr.drawLine(x1, y1, x2, y2);
        } 
        gr.setColor(new Color(0,0,0));
        for(int a = y; a >= (y-(height/2)); a--){            
            int x2 = (x+(width/10))-(int)((3*width/20.0)*((double)(y-a)/(double)y));
            gr.drawLine(x+(width/10)+1, a, x2+1, y-(height/2));
        }
    }

    void bottomFin(Graphics gr){
        r = 0;
        b = 255;        
        for(int a = 0; a <= 255; a++){
            int x1 = (int)(x+(width/20.0));
            int y1 = (int)((y+(height/2.0))-((height/5.0)*(a/255.0)));
            int x2 = (int)((x + (width/20.0)))+(int)(((3*width)/20.0)*(a/255.0));
            int y2 = (int)((y+(height/2.0))-(height/5.0));
            b--;     
            r++;
            checkColors();
            gr.setColor(new Color(r, g, b));
            gr.drawLine(x1, y1, x2, y2);
            gr.drawLine(x1, y1, x1 - (int)((3.0 * width) / 20.0), y1);
        }       
        b=255;
        r=0;
        for(int a = 0; a <=255; a++){
            int x1 = (int)(x-(width/10.0));
            int y2 = (int)((y+(height/2))-(height/5));
            int y1 = (int)(y2-(((3*height)/10.0)*((255 - a)/255.0)));        
            int x2 = (int)(x1+(((3*width)/10.0)*(a/255.0)));
            r++;
            b--;
            checkColors();
            gr.setColor(new Color(r, g, b));
            gr.drawLine(x1, y1, x2, y2);
        }
        gr.setColor(new Color(0,0,0));
        for(int a = y; a <= (y+(height/2)); a++){            
            int x2 = (x-(width/10))-(int)((3*width/20.0)*((double)(y-a)/(double)y));
            gr.drawLine(x-(width/10) - 2, a, x2 - 2, y+(height/2));
        }
    }

    void leftFin(Graphics gr){
        b = 255;
        r = 0;        
        for(int a = 0; a <= 255; a++){
            int x1 = (int)((x-(width/2.0))+((width/5.0)*(a/255.0)));
            int y1 = (int)(y+(height/20.0));
            int x2 = (int)((x-(width/2.0))+(width/5.0));
            int y2 = (int)((y+(height/20.0))+(((3*height)/20.0)*(a/255.0)));
            r++;
            b--;
            checkColors();
            gr.setColor(new Color(r, g, b));
            gr.drawLine(x1, y1, x2, y2);
            gr.drawLine(x1, y1, x1, y1 - (int)((3.0 * height) / 20));
        }
        b = 255;
        r = 0;
        for(int a = 0; a <=255; a++){
            int x1 = (int)(x-((a/255.0)*((3.0*width)/10.0)));
            int y1 = (int)(y-((height)/10.0));          
            int x2 = (int)(x-((3.0*width)/10.0));
            int y2 = (int)((y-((height)/10.0))+((a/255.0)*((3.0*height)/10.0)));   
            b--;
            r++;
            checkColors();
            gr.setColor(new Color(r, g, b));
            gr.drawLine(x1, y1, x2, y2);
        }
        gr.setColor(new Color(0,0,0));
        for(int a = x; a >= (x-(width/2)); a--){            
            int y2 = (y-(height/10)) + (int)((3*height/20.0) * ((double)(x-a)/(double)x));
            gr.drawLine(a - 1, y-(height/10) - 2, x-(width/2) - 2, y2);
        }
    }

    void rightFin(Graphics gr){
        b = 255;
        r = 0;        
        for(int a = 0; a <= 255; a++){
            int x1 = (int)((x+(width/2.0))-((width/5.0)*(a/255.0)));
            int y1 = (int)(y-(height/20.0));
            int x2 = (int)((x+(width/2.0))-(width/5.0));
            int y2 = (int)((y-(height/20.0))-(((3*height)/20.0)*(a/255.0)));
            b--;  
            r++;
            checkColors();
            gr.setColor(new Color(r, g, b));
            gr.drawLine(x1, y1, x2, y2);
            gr.drawLine(x1, y1, x1, y1 + (int)((3.0 * height) / 20));
        }
        r = 0;
        b = 255;
        for(int a = 0; a <=255; a++){
            int x1 = (int)(x+((a/255.0)*((3*width)/10)));
            int y1 = (int)(y+((height)/10.0));          
            int x2 = (int)(x+((3*width)/10.0));
            int y2 = (int)((y+((height)/10.0))-((a/255.0)*((3*height)/10.0)));   
            r++;    
            b--;
            checkColors();
            gr.setColor(new Color(r, g, b));
            gr.drawLine(x1, y1, x2, y2);
        }
        gr.setColor(new Color(0,0,0));
        for(int a = x; a <= (x+(width/2)); a++){            
            int y2 = (y+(height/10))+(int)((3*height/20.0)*((double)(x-a)/(double)x));
            gr.drawLine(a, y+(height/10) + 1, x+(width/2), y2 + 1);
        }
    }

    void colorWheel(Graphics gr){
        gr.setColor(Color.BLACK);
        gr.fillOval(x - (width/10), y - (height/10), width/5, height/5);
        for(int theta = 225; theta <= 315; theta++){
            int deltaX = (int)((width/10) * Math.cos(Math.toRadians(theta)));
            int deltaY = (int)((height/10) * Math.sin(Math.toRadians(theta)));
            r = (int)(255*((theta - 225)/90.0));
            b = 255 - ((int)(255*((theta - 225)/90.0)));
            checkColors();
            gr.setColor(new Color(r, g, b));
            gr.drawLine(x, y, x + deltaX, y + deltaY);
        }
        for(int theta = 135; theta <= 225; theta++){
            int deltaX = (int)((width/10) * Math.cos(Math.toRadians(theta)));
            int deltaY = (int)((height/10) * Math.sin(Math.toRadians(theta)));
            r = 255 - ((int)(255 *((theta - 135)/90.0)));
            b = (int)(255 *((theta - 135)/90.0));
            checkColors();
            gr.setColor(new Color(r, g, b));
            gr.drawLine(x, y, x + deltaX, y + deltaY);
        }
        for(int theta = 45; theta <= 135; theta++){
            int deltaX = (int)((width/10) * Math.cos(Math.toRadians(theta)));
            int deltaY = (int)((height/10) * Math.sin(Math.toRadians(theta)));
            r = (int)(255 *((theta - 45)/90.0));
            b = 255 - (int)(255 *((theta - 45)/90.0));
            checkColors();
            gr.setColor(new Color(r, g, b));
            gr.drawLine(x, y, x + deltaX, y + deltaY);
        }
        for(int theta = 315; theta <= 360; theta++){
            int deltaX = (int)((width/10) * Math.cos(Math.toRadians(theta)));
            int deltaY = (int)((height/10) * Math.sin(Math.toRadians(theta)));
            r = 255 - (int)((255/2)*((theta-315)/45.0));
            b = (int)((255/2)*((theta-315)/45.0));
            checkColors();
            gr.setColor(new Color(r, g, b));
            gr.drawLine(x, y, x + deltaX, y + deltaY);
        }
        for(int theta = 0; theta <= 45; theta++){
            int deltaX = (int)((width/10) * Math.cos(Math.toRadians(theta)));
            int deltaY = (int)((height/10) * Math.sin(Math.toRadians(theta)));
            r = (255/2) - (int)((255/2)*((theta)/45.0));
            b = (255/2) + (int)((255/2)*((theta)/45.0));
            checkColors();
            gr.setColor(new Color(r, g, b));
            gr.drawLine(x, y, x + deltaX, y + deltaY);
        }        
        gr.setColor(new Color(0,0,0));
        gr.fillOval(x - (width/50), y - (height/50), width / 25, height / 25);
    }
}