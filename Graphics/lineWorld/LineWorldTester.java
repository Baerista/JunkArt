package lineWorld;

import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class LineWorldTester{
    public static void main(String [] cheese){
        int [] bounds = {0, 0, 700, 700};

        ArrayList<LineGroup> theGroups = new ArrayList<LineGroup>();
        ArrayList<LineGroupCC> theCCGroups = new ArrayList<LineGroupCC>();

        /*int angle = (int)(Math.random() * 30) + 1;
        int length = (int)(Math.random() * 30) + 1;
        int fade = (int)(Math.random() * 10);*/

        int angle = 10;
        int length = 30;
        int fade = 5;

        //Colors
        /*int [] colors1 = {255,0,0,200,0,0,145,0,0};//RED
        int [] colors2 = {0,255,0,0,200,0,0,145,0};//BLUE
        int [] colors3 = {0,0,255,0,0,200,0,0,145};//GREEN
        int [] colors4 = {255,255,0,200,200,0,145,145,0};//PURPLE
        int [] colors5 = {255,0,255,200,0,200,145,0,145};//YELLOW
        int [] colors6 = {0,255,255,0,200,200,0,145,145};//TEAL
        int [] colors7 = {255,255,255,200,200,200,145,145,145};//WHITE

        //RGB
        int [] colors9 = {255,0,0,0,255,0,0,0,255};

        //WhiteLine
        int [] colors10 = {0,0,0, 0,0,0, 250,250,250};//WHITE, SINGLE LINE

        /*theGroups.add(new LineGroup(bounds, angle, length, fade, colors1));
        theGroups.add(new LineGroup(bounds, angle, length, fade, colors2));
        theGroups.add(new LineGroup(bounds, angle, length, fade, colors3));
        /*theGroups.add(new LineGroup(bounds, angle, length, fade, colors4));
        theGroups.add(new LineGroup(bounds, angle, length, fade, colors5));
        theGroups.add(new LineGroup(bounds, angle, length, fade, colors6));
        theGroups.add(new LineGroup(bounds, angle, length, fade, colors7));*/

        for(int a = 0; a < 10; a++){

            theGroups.add(new LineGroup(bounds, angle, length, fade));

        }

        //DISPLAYING VARIOUS SIZES, ETC
        /*theGroups.add(new LineGroup(bounds, (int)(Math.random() * 25) + 5, (int)(Math.random() * 25) + 5, (int)(Math.random() * 5) + 1, colors9));
        theGroups.add(new LineGroup(bounds, (int)(Math.random() * 25) + 5, (int)(Math.random() * 25) + 5, (int)(Math.random() * 5) + 1, colors9));
        theGroups.add(new LineGroup(bounds, (int)(Math.random() * 25) + 5, (int)(Math.random() * 25) + 5, (int)(Math.random() * 5) + 1, colors9));
        theGroups.add(new LineGroup(bounds, (int)(Math.random() * 25) + 5, (int)(Math.random() * 25) + 5, (int)(Math.random() * 5) + 1, colors9));*/

        LineWorld World1 = new LineWorld(bounds, theGroups); 
        JFrame frame = new JFrame("Line World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(720, 710);  
        frame.addKeyListener(World1);

        frame.getContentPane().add(World1);

        frame.setVisible(true);
        frame.setLocation(20,10);
        frame.setSize(720, 710);

        World1.run();
    }
}