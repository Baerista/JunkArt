import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class RGB extends JPanel{    
    int b;
    boolean increasing;
    public RGB(){
        b = 0;
        increasing = true;
    }
    
    public void run(){
        while(true){
            if(increasing){
                b++;
                if(b==255)
                increasing = false;
            }else{
                b--;
                if(b==0)
                increasing=true;
            }
            
            paintImmediately(0, 0, 1000, 1000);
            /*try{
                Thread.sleep(0);
            }catch(InterruptedException e){
            }         */    
        }
    }   
    
    public void paint(Graphics gr){
        for(int r = 0; r <= 255; r++){
            for(int g = 0; g <= 255; g++){
                gr.setColor(new Color(r,g,b));
                gr.fillRect(r * 3, g * 3,3,3);
            }
        }
    }   
}