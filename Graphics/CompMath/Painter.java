package CompMath;


import java.awt.*;

public class Painter{
    public void paintVeritcalLines(Graphics g){
        for(int x = 0; x <= 700; x+=5){
            g.drawLine(x, 0, x, 700);
        }        
    }
    
    public void paintHorizontalLines(Graphics g){
        for(int x = 0; x <= 700; x+=5){
            g.drawLine(0, x, 700, x);
        }
    }
     
    public void paintLineGrid(Graphics g){
        paintVeritcalLines(g);
        paintHorizontalLines(g);
    }
    
    public void paintBoxGrid(Graphics g){
        g.setColor(Color.WHITE);
        int x = 0;
        int y = 0;        
        while(x <= 700){
            x+=50;
            y = 0;
            while(y <= 700){
                y+=50;
                g.drawRect(x - 30, y - 30, 25, 25);                
            }
        }
    }
    
    public void paintCornerWeb(Graphics g){
        for(int x = 700; x >= 0; x-=10){
             g.drawLine(x, 0, 0, 700 - x);        
        }
    }
    
    public void paintDreamCatcher(Graphics g){
        for(int x = 700; x >= 350; x-=5){
            g.drawLine(x, 350, 350, (700 + 350) - x);        
        }        
        for(int y = 0; y <= 350; y+=5){
            g.drawLine(y, 350, 350, 350 + y);        
        }        
        for(int z = 0; z <= 350; z+=5){
             g.drawLine(z, 350, 350, 350 - z);        
        }        
        for(int n = 700; n >= 350; n-=5){
             g.drawLine(n, 350, 350, n - 350);        
        }
    }
    
    public void paintBowTie(Graphics g){
        for(int a = 0; a < 700; a+=10){
            g.drawLine(0, a, 250, (a / 10) + 315);
        }        
        for(int b = 0; b < 700; b+=10){
            g.drawLine(250, (b / 10) + 315, 300, (b / 5) + 280);
        }        
        for(int c = 0; c < 700; c+=10){
            g.drawLine(300, (c / 5) + 280, 400, (c / 5) + 280);
        }        
        for(int d = 0; d < 700; d+=10){
            g.drawLine(400, (d / 5) + 280, 450, (d / 10) + 315);
        }        
        for(int e = 0; e < 700; e+=10){
            g.drawLine(450, (e / 10) + 315, 700, e);
        } 
    }
    
    public void paintCrissCross(Graphics g){
        for( int a = 0; a < 1400; a+=20){
            g.drawLine(a - 700, 0, a, 700); 
        }        
        for( int b = 1400; b > 0; b-=20){
            g.drawLine(b, 0, b - 700, 700); 
        }
    }
    
    public void paintTubular(Graphics g){
        for(int theta = 0; theta < 360; theta+=10){
            int deltax = (int)(500 * Math.cos(Math.toRadians(theta)));
            int deltay = (int)(500 * Math.sin(Math.toRadians(theta)));
            g.drawLine(350, 350, 350 + deltax, 350 + deltay);
        }
    }
    
    public void paintStair(Graphics g){
        for(int theta = 0; theta < 360; theta+=5){
            int deltax = (int)(500 * Math.cos(Math.toRadians(theta)));
            int deltay = (int)(500 * Math.sin(Math.toRadians(theta)));
            g.setColor(new Color(255 - ((2 * theta) / 3), 255 - ((2 * theta) / 3), 255 - ((2 * theta) / 3)));
            g.drawLine(350, 350, 350 + deltax, 350 + deltay);
        }  
        g.setColor(Color.BLACK);
        g.fillOval(300,300,100,100);
    }
    
    public void paintBullsEye(Graphics g){
        for(int a = 300; a > 0; a-=30){
            g.setColor(Color.BLACK);
            g.fillOval(350 - a, 350 - a, a * 2, a * 2);
            
            g.setColor(Color.RED);
            g.fillOval(350 - (a - 10), 350 - (a - 10), (a - 10) * 2, (a - 10) * 2);
        }
    }
    
    public void paintBump(Graphics g){
        for(int a = 255; a >= 0; a--){
            g.setColor(new Color(255 - a, 0, 0));
            g.fillOval(350 - a, 350 - a, a * 2, a * 2);
        }
    }
 
    public void paintSnowFlake(Graphics g){//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        for(int theta = 0; theta < 1440; theta++){
            int deltax = (int)(50 * Math.cos(Math.toRadians(theta/4)));
            int deltay = (int)(50 * Math.sin(Math.toRadians(theta/4)));
            g.setColor(new Color(255 - ((theta / 2) / 3), 0, 255 - ((theta / 2) / 3)));
            g.drawLine(350, 350, 350 + deltax, 350 + deltay);
        }  
        //g.setColor(Color.BLACK);
        //g.fillOval(325,325,50,50);
    }
    
    public void paintSnowFall(Graphics g){//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
    }
    
    public void paintRedRange(Graphics g){
        for(int x = 0; x <= 510; x+=1){
             g.setColor( new Color(x/2, 0, 0));  
             g.drawLine(x, 0, 700, x);
        }        
        for(int x = 0; x <= 510; x+=1){
             g.setColor( new Color(x/2, 0, 0));  
             g.drawLine(x, 190, x, 700);
        }
    }
    
    public void paintShadeRange(Graphics g){
      for(int x = 0; x <= 510; x+=1){
          g.setColor( new Color(x/2, x/2, x/2));  
          g.drawLine(x, 0, x, x);
        }  
    }
    
    public void paintColorChart(Graphics g){
        for(int a = 0; a <= 255; a++){
            for(int b = 255; b >= 0; b--){
                g.setColor(new Color(a, b, 0));
                g.fillRect(a + 255, b + 255, 1, 1);
            }
        }        
        for(int a = 0; a <= 255; a++){
            for(int b = 0; b <= 255; b++){
                g.setColor(new Color(0, b, 255 - a));
                g.fillRect(a, b + 255, 1, 1);
            }
        }        
        for(int a = 255; a >= 0; a--){
            for(int b = 255; b >= 0; b--){
                g.setColor(new Color(255 - b, 0, 255 - a));
                g.fillRect(a, b, 1, 1);
            }
        }        
        for(int x = 0; x <= 255; x++){
            for(int y = 255; y >= 0; y--){
                if((x + y) <= 255){
                    g.setColor(new Color(255 - y, x, x));
                    g.fillRect(x + 255, y, 1, 1);
                }else{
                    g.setColor(new Color(x, 255 - y, 255 - y));
                    g.fillRect(x + 255, y, 1, 1);                    
                }
            }
        }
    }
    
    public void paintTubular2(Graphics g){
        for(int a = 0; a <= 700; a+=50){
            for(int b = 0; b <= 255; b+=15){
                g.setColor(new Color(b, b, b));
                g.drawLine(a + (b / 15), 0, a + (b / 15), 700);
                g.setColor(new Color(255 - b, 255 - b, 255 - b));
                g.drawLine(a + (b / 15) + 15, 0, a + (b / 15) + 15, 700);
            }
        }
    }
    
    public void paintBrickWall(Graphics g){
        for(int a = 0; a < 50; a++){
            for(int b = 0; b < 35; b++){
                g.setColor(Color.RED);
                g.fillRect(a * 25, b * 30, 20, 10);
            }
        }        
        for(int a = 0; a < 50; a++){
            for(int b = 0; b < 35; b++){
                g.setColor(Color.RED);
                g.fillRect((a * 25) - 15, (b * 30) - 15, 20, 10);
            }
        }
    }
    
    public void paintPaperStack(Graphics g){
        for(int a = 0; a < 20; a+=2){
            g.setColor(Color.BLACK);
            g.fillRect(a, a, 85, 110);
            g.setColor(Color.WHITE);
            g.fillRect(a + 1, a + 1, 85, 110);
        }
    }
    
    public void paintSuprise(Graphics g){        
        for(int a = 0; a <= 700; a+=1){
            for(int b = 0; b <= 700; b+=10){
                g.setColor(new Color(a / 3, 255 - (a / 3), 0));
                g.fillRect(b, a, 1, 1);
            }
        }
        g.setColor(Color.BLACK);
        int [] poly1x = {0, 350, 700};
        int [] poly1y = {0, 350, 0};
        g.fillPolygon(poly1x, poly1y, 3);
        int [] poly2x = {0, 350, 700};
        int [] poly2y = {700, 350, 700};
        g.fillPolygon(poly2x, poly2y, 3);
        for(int a = 0; a <= 700; a+=10){
            g.setColor(new Color(a / 3, 255 - (a / 3), 0));
            g.drawLine(a, a, 700 - a, a); 
        }
        for(int x = 700; x >= 350; x-=1){
            g.setColor(new Color(255 - (x / 3), 0, x / 3)); 
            g.drawLine(x, 350, 350, (700 + 350) - x); 
        }
        for(int x = 0; x <= 350; x+=1){
            g.setColor(new Color(255 - (x / 3), 0, x / 3)); 
            g.drawLine(x, 350, 350, 350 + x); 
        }
        for(int x = 0; x <= 350; x+=1){
            g.setColor(new Color(255 - (x / 3), 0, x / 3)); 
            g.drawLine(x, 350, 350, 350 - x); 
        }
        for(int x = 700; x >= 350; x-=1){
            g.setColor(new Color(255 - (x / 3), 0, x / 3)); 
            g.drawLine(x, 350, 350, x - 350); 
        }
    }
    
    public void paintPatchWork(Graphics g){////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
    }
    
    public void paintChains(Graphics g){////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      
    }
    
    public void paintWallPaper70s(Graphics g){////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
    }

    public void paintTiledFloor(Graphics g){////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
    }    
    
    public void paintSpiral(Graphics g){////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
    }    
    
    public void paintSinCurve(Graphics g){////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
    }    
    
    public void paintTubular3(Graphics g){////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       
    } 
}