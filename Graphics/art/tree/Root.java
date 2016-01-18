package art.tree;

import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class Root{
    public static void main(String [] theory){
        Tree theTree = new Tree();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(1000, 1000);       
        frame.getContentPane().add(theTree);
        frame.setVisible(true);
        frame.setLocation(100,100);
        frame.setSize(1050, 1050);       
        theTree.grow();
    }
}