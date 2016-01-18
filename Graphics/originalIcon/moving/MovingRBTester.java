package originalIcon.moving;

import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class MovingRBTester{
    public static void main(String [] cheese){
        //MovingGraphicRB2 theGraphic = new MovingGraphicRB2(300, 300, 600, 600);
        MovingGraphic theGraphic = new MovingGraphic(300, 300, 600, 600);        
        
        JFrame frame = new JFrame("Moving Graphic");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(1000, 1000);       
        frame.getContentPane().add(theGraphic);
        frame.setVisible(true);
        frame.setLocation(50,50);
        frame.setSize(1000, 1000);       
        theGraphic.run();
    }
}