package art.tree;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class Tree extends JPanel{
    Branch trunk;

    public Tree(){
        trunk = new Branch();
        //trunk.grow(14); // no more than 16!
    }

    public void grow(){
        while(true){
            trunk.grow();
            /*if(increasing){
            b++;
            if(b==255)
            increasing = false;
            }else{
            b--;
            if(b==0)
            increasing=true;
            }*/

            paintImmediately(0, 0, 1000, 1000);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
            }
        }
    }   

    public void paint(Graphics gr){
        for(int a = 0; a < 1000; a++){
            
            int b = (int)(((1000.0 - a)/1000.0) * 255);
            
            int r = (int)((a/1000.0) * 255);
            
            int g = (int)(Math.random() * 30);

            gr.setColor(new Color(r,g,b));
            gr.drawLine(0, a, 1000, a);
        }

        /*try{
        Thread.sleep(100);
        }catch(InterruptedException e){
        }*/
        trunk.paint(gr);
    }   

}
