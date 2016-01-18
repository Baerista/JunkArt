import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class Tester{
    public static void main(String [] cheese){
        RGB thePlot = new RGB();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(255*3, 255*3);       
        frame.getContentPane().add(thePlot);
        frame.setVisible(true);
        frame.setLocation(10,10);
        frame.setSize(255*3, 255*3);       
        thePlot.run();
    }
}