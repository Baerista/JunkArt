package CompMath;

//package CompMath;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Graphicstron extends JPanel implements ActionListener{

    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b10;
    private Button b11;
    private Button b12;
    private Button b13;
    private Button b14;
    private Button b15;
    private Button b16;
    private Button b17;
    private Button b18;
    private Button b19;
    private Button b20;
    private Button b21;
    private Button b22;
    private Button b23;
    private Button b24;
    private Button b25;
    private Button b26;
    private Button b27;
    private Button b28;
    
    private Button coverButton;
    private Button coverButton2;

    
    private TextField  amountTextField;
    private TextField  firstIndexTextField;
    private TextField  secondIndexTextField;
    
    private Painter p;
    int command;


    public Graphicstron(){
        setLayout(null);
        
        p = new Painter();
        command = -1;
        
        int width = 96;
        int height = 42;
        int x = 892;
        int y = 0;
        
        /*
        amountTextField = new TextField(20);
        amountTextField.addActionListener(this);
        amountTextField.setBounds(100, 300, width, height);
        add(amountTextField);
        
        firstIndexTextField = new TextField(20);
        firstIndexTextField.addActionListener(this);
        firstIndexTextField.setBounds(250, 300, width, height);
        add(firstIndexTextField);
        
        secondIndexTextField = new TextField(20);
        secondIndexTextField.addActionListener(this);
        secondIndexTextField.setBounds(400, 300, width, height);
        add(secondIndexTextField);
        */
        /////////Buttons
        
        b1 = new Button("Vertical Lines");
        b1.setBounds(x - width * 2, y + height * 0, width, height);
        b1.setActionCommand("0");
        add(b1);
        b1.addActionListener(this);
        
        b2 = new Button("Horizontal Lines");
        b2.setBounds(x - width * 2, y + height * 1, width, height);
        b2.setActionCommand("1");
        add(b2);
        b2.addActionListener(this);
        
        b3 = new Button("Line Grid");
        b3.setBounds(x - width * 2, y + height * 2, width, height);
        b3.setActionCommand("2");
        add(b3);
        b3.addActionListener(this);
        
        b4 = new Button("Box Grid");
        b4.setBounds(x - width * 2, y + height * 3, width, height);
        b4.setActionCommand("3");
        add(b4);
        b4.addActionListener(this);
        
        b5 = new Button("Corner Web");
        b5.setBounds(x - width * 2, y + height * 4, width, height);
        b5.setActionCommand("4");
        add(b5);
        b5.addActionListener(this);
        
        b6 = new Button("Dream Catcher");
        b6.setBounds(x - width * 2, y + height * 5, width, height);
        b6.setActionCommand("5");
        add(b6);
        b6.addActionListener(this);
        
        b7 = new Button("Bow Tie");
        b7.setBounds(x - width * 2, y + height * 6, width, height);
        b7.setActionCommand("6");
        add(b7);
        b7.addActionListener(this);
        
        b8 = new Button("CrissCross");
        b8.setBounds(x - width * 2, y + height * 7, width, height);
        b8.setActionCommand("7");
        add(b8);
        b8.addActionListener(this);
        
        b9 = new Button("Tubular");
        b9.setBounds(x - width * 2, y + height * 8, width, height);
        b9.setActionCommand("8");
        add(b9);
        b9.addActionListener(this);
        
        b10 = new Button("Spiral Stair");
        b10.setBounds(x - width * 2, y + height * 9, width, height);
        b10.setActionCommand("9");
        add(b10);
        b10.addActionListener(this);
        
                
        b11 = new Button("Bulls Eye");
        b11.setBounds(x - width * 2, y + height * 10, width, height);
        b11.setActionCommand("10");
        add(b11);
        b11.addActionListener(this);
        
                
        b12 = new Button("Bump");
        b12.setBounds(x - width * 2, y + height * 11, width, height);
        b12.setActionCommand("11");
        add(b12);
        b12.addActionListener(this);
        
                
        b13 = new Button("%%Snow Flake");
        b13.setBounds(x - width * 2, y + height * 12, width, height);
        b13.setActionCommand("12");
        add(b13);
        b13.addActionListener(this);
        
                
        b14 = new Button("%%%Snow Fall");
        b14.setBounds(x - width * 2, y + height * 13, width, height);
        b14.setActionCommand("13");
        add(b14);
        b14.addActionListener(this);
     
        
        b15 = new Button("Red Range");
        b15.setBounds(x - width, y + height * 0, width, height);
        b15.setActionCommand("14");
        add(b15);
        b15.addActionListener(this);
        
        b16 = new Button("Shade Range");
        b16.setBounds(x - width, y + height * 1, width, height);
        b16.setActionCommand("15");
        add(b16);
        b16.addActionListener(this);
        
        b17 = new Button("Color Chart");
        b17.setBounds(x - width, y + height * 2, width, height);
        b17.setActionCommand("16");
        add(b17);
        b17.addActionListener(this);
        
        b18 = new Button("Tubular2");
        b18.setBounds(x - width, y + height * 3, width, height);
        b18.setActionCommand("17");
        add(b18);
        b18.addActionListener(this);
        
        b19 = new Button("Brick Wall");
        b19.setBounds(x - width, y + height * 4, width, height);
        b19.setActionCommand("18");
        add(b19);
        b19.addActionListener(this);
        
        b20 = new Button("Paper Stack");
        b20.setBounds(x - width, y + height * 5, width, height);
        b20.setActionCommand("19");
        add(b20);
        b20.addActionListener(this);
        
        b21 = new Button("Suprise");
        b21.setBounds(x - width, y + height * 6, width, height);
        b21.setActionCommand("20");
        add(b21);
        b21.addActionListener(this);
        
        b22 = new Button("%%Patch Work");
        b22.setBounds(x - width, y + height * 7, width, height);
        b22.setActionCommand("21");
        add(b22);
        b22.addActionListener(this);
        
        b23 = new Button("%%%Chains");
        b23.setBounds(x - width, y + height * 8, width, height);
        b23.setActionCommand("22");
        add(b23);
        b23.addActionListener(this);
        
        b24 = new Button("%Wall Paper 70s");
        b24.setBounds(x - width, y + height * 9, width, height);
        b24.setActionCommand("23");
        add(b24);
        b24.addActionListener(this);
        
                
        b25 = new Button("%%Tiled Floor");
        b25.setBounds(x - width, y + height * 10, width, height);
        b25.setActionCommand("24");
        add(b25);
        b25.addActionListener(this);
        
                
        b26 = new Button("%%%Spiral");
        b26.setBounds(x - width, y + height * 11, width, height);
        b26.setActionCommand("25");
        add(b26);
        b26.addActionListener(this);
        
                
        b27 = new Button("%%%Sin Curve");
        b27.setBounds(x - width, y + height * 12, width, height);
        b27.setActionCommand("26");
        add(b27);
        b27.addActionListener(this);
        
                
        b28 = new Button("%%%Tubular3");
        b28.setBounds(x - width, y + height * 13, width, height);
        b28.setActionCommand("27");
        add(b28);
        b28.addActionListener(this);
        
        coverButton = new Button("");
        coverButton.setBounds(x - width*2, y, width*10, 800);
        coverButton.setActionCommand("cover");
        add(coverButton);
        coverButton.addActionListener(this);
        
        coverButton2 = new Button("");
        coverButton2.setBounds(0, 700, 800, 800);
        coverButton2.setActionCommand("cover2");
        add(coverButton2);
        coverButton2.addActionListener(this);

    }
    
    public void actionPerformed (ActionEvent event){
        
        String action = event.getActionCommand();
        
        if("0".equals(action)){
            command = 0;
        }else if("1".equals(action)){
            command = 1;  
        }else if("2".equals(action)){
            command = 2;  
        }else if("3".equals(action)){
            command = 3;  
        }else if("4".equals(action)){
            command = 4;  
        }else if("5".equals(action)){
            command = 5;  
        }else if("6".equals(action)){
            command = 6;  
        }else if("7".equals(action)){
            command = 7;  
        }else if("8".equals(action)){
            command = 8;  
        }else if("9".equals(action)){
            command = 9;  
        }else if("10".equals(action)){
            command = 10;  
        }else if("11".equals(action)){
            command = 11;  
        }else if("12".equals(action)){
            command = 12;  
        }else if("13".equals(action)){
            command = 13;  
        }else if("14".equals(action)){
            command = 14;  
        }else if("15".equals(action)){
            command = 15;  
        }else if("16".equals(action)){
            command = 16;  
        }else if("17".equals(action)){
            command = 17;  
        }else if("18".equals(action)){
            command = 18;  
        }else if("19".equals(action)){
            command = 19;  
        }else if("20".equals(action)){
            command = 20;  
        }else if("21".equals(action)){
            command = 21;  
        }else if("22".equals(action)){
            command = 22;  
        }else if("23".equals(action)){
            command = 23;  
        }else if("24".equals(action)){
            command = 24;  
        }else if("25".equals(action)){
            command = 25;  
        }else if("26".equals(action)){
            command = 26;  
        }else if("27".equals(action)){
            command = 27;  
        }else if("28".equals(action)){
            command = 28;  
        }
        
        repaint();
    }
    
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 1000, 1000);
        g.setColor(Color.WHITE);

        /*
        g.drawString("Value", 100, 299);
        g.drawString("Index #1", 250, 299);
        g.drawString("Index #2", 400, 299);
        */
        
        if(command == 0){
		  		p.paintVeritcalLines(g);
        }else if(command == 1){
            p.paintHorizontalLines(g);
        }else if(command == 2){
            p.paintLineGrid(g);
        }else if(command == 3){
            p.paintBoxGrid(g);
        }else if(command == 4){
            p.paintCornerWeb(g);
        }else if(command == 5){
            p.paintDreamCatcher(g);
        }else if(command == 6){
            p.paintBowTie(g);
        }else if(command == 7){
            p.paintCrissCross(g);
        }else if(command == 8){
            p.paintTubular(g);
        }else if(command == 9){
            p.paintStair(g);
        }else if(command == 10){
            p.paintBullsEye(g);
        }else if(command == 11){
            p.paintBump(g);
        }else if(command == 12){
            p.paintSnowFlake(g);
        }else if(command == 13){
            p.paintSnowFall(g);
        }else if(command == 14){
            p.paintRedRange(g);
        }else if(command == 15){
            p.paintShadeRange(g);
        }else if(command == 16){
            p.paintColorChart(g);
        }else if(command == 17){
            p.paintTubular2(g);
        }else if(command == 18){
            p.paintBrickWall(g);
        }else if(command == 19){
            p.paintPaperStack(g);
        }else if(command == 20){
            p.paintSuprise(g);
        }else if(command == 21){
            p.paintPatchWork(g);
        }else if(command == 22){
            p.paintChains(g);
        }else if(command == 23){
            p.paintWallPaper70s(g);
        }else if(command == 24){
            p.paintTiledFloor(g);
        }else if(command == 25){
            p.paintSpiral(g);
        }else if(command == 26){
            p.paintSinCurve(g);
        }else if(command == 27){
            p.paintTubular3(g);
        }
        
    }
    
    
    public static void main(String [] arg){
        JFrame frame;
        
        frame = new JFrame("Graphics Intro Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(900, 700);
        frame.setLocation(0,0);
        
        Graphicstron gMan = new Graphicstron();

        frame.getContentPane().add(gMan);
        frame.setVisible(true);
    }
}
