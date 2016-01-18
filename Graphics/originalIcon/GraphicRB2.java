package originalIcon;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class GraphicRB2 extends JPanel{
    int r;
    int g;
    int b;
    int x;
    int y;
    int width;
    int height;

    public GraphicRB2(int aX, int aY, int aWidth, int aHeight){
        x = aX;
        y = aY;
        width = aWidth;
        height = aHeight;
        paintImmediately(x - (width/2), y - (height/2), width, height);
    }

    public void paint(Graphics gr){
        int r = 0;
        int g = 0;
        int b = 0;
        gr.setColor(new Color(r,g,b));
        gr.fillRect(x - (width/2), y - (height/2), width, height);
        topFin(gr);
        bottomFin(gr);
        leftFin(gr);
        rightFin(gr);
        colorWheel(gr);
    }   

    void checkColors(){
        if(r > 255)
            r = 255;
        if(r < 0)
            r = 0;
        if(g > 255)
            g = 255;
        if(g < 0)
            g = 0;
        if(b > 255)
            b = 255;
        if(b < 0)
            b = 0;
    }    

    void topFin(Graphics gr){
        r = 0;
        g = 0;
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
            gr.drawLine(x+(width/10), a, x2, y-(height/2));
        }
    }

    void bottomFin(Graphics gr){
        r = 0;
        g = 0;
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
            gr.drawLine(x-(width/10), a, x2, y+(height/2));
        }
    }

    void leftFin(Graphics gr){
        b = 255;
        g = 0;
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
            int x1 = (int)(x-((a/255.0)*((3*width)/10)));
            int y1 = (int)(y-((height)/10.0));          
            int x2 = (int)(x-((3*width)/10.0));
            int y2 = (int)((y-((height)/10.0))+((a/255.0)*((3*height)/10.0)));   
            b--;
            r++;
            checkColors();
            gr.setColor(new Color(r, g, b));
            gr.drawLine(x1, y1, x2, y2);
        }
        gr.setColor(new Color(0,0,0));
        for(int a = x; a >= (x-(width/2)); a--){            
            int y2 = (y-(height/10)) + (int)((3*height/20.0) * ((double)(x-a)/(double)x));
            gr.drawLine(a, y-(height/10), x-(width/2), y2);
        }
    }

    void rightFin(Graphics gr){
        b = 255;
        g = 0;
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
            gr.drawLine(a, y+(height/10), x+(width/2), y2);
        }
    }

    void colorWheel(Graphics gr){
        for(int a = 0; a <= 255; a++){
            b = a;
            r = 255-a;
            g = 0;
            checkColors();
            gr.setColor(new Color(r,g,b));
            int x1 = (int)((a/255.0) * (width/10)) + (x-(width/10));
            int y1 = (int)((a/255.0) * (height/10) + (y-(height/10)));
            //System.out.println(x1 + "    " + y1 + "    " + (width - (x1*2)) + "     " + (height - (y1*2)));
            gr.fillOval(x1, y1, width - (x1*2), height - (y1*2));
        }
           
    }
}