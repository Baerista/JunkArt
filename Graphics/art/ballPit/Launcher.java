package art.ballPit; 

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class Launcher{    
    public static void main(String [] arg){
        BallPit thePit = new BallPit(1000);
        
        JFrame frame = new JFrame("balls");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(1008, 1034);
        
        frame.setLocation(0,0);
        
        frame.addMouseListener(thePit);
        frame.getContentPane().add(thePit);
        
        frame.setVisible(true);
        
        thePit.play();
    }
}