package art.triangles;

//import java.util.*;
//import java.io.*;
import java.awt.*;
import javax.swing.*;

public class Launcher{
    public Launcher(){

    }

    public static void main(String [] cheese){
        TriangleBreaker theBreaker = new TriangleBreaker();
        
        JFrame frame = new JFrame("Breakdown of a Triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(1000, 1000);       
        frame.getContentPane().add(theBreaker);
        frame.setVisible(true);
        frame.setLocation(50,50);
        frame.setSize(1000, 1000); 

        theBreaker.run();
    }
}