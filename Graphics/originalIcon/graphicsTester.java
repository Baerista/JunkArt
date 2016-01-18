package originalIcon;

import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class graphicsTester{
    public static void main(String [] cheese){
        Scanner sc = new Scanner(System.in);
        System.out.println("X:");
        int x = sc.nextInt();
        System.out.println("Y:");
        int y = sc.nextInt();
        System.out.println("Width:");
        int width = sc.nextInt();
        System.out.println("Height:");
        int height = sc.nextInt(); 
        
        Graphic1 theGraph = new Graphic1(x, y, width, height);
        JFrame frame = new JFrame("Graphic01");
        
        //GraphicRB theGraph = new GraphicRB(x, y, width, height);
        //JFrame frame = new JFrame("GraphicRB");  
        
        //GraphicRB2 theGraph = new GraphicRB2(x, y, width, height);
        //JFrame frame = new JFrame("GraphicRB2");         

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(600, 600);       
        frame.getContentPane().add(theGraph);
        frame.setVisible(true);
        frame.setLocation(50,50);
        frame.setSize(650, 650);       
        //theGraph.paint();
    }
}