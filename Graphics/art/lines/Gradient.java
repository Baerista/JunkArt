package art.lines;


public class Gradient{
    public Clr c1;
    public Clr c2;
    
    public Gradient(Clr color1, Clr color2){
        c1 = color1;
        c2 = color2;
    }
    
    public Clr getColor(double percentile){
        int r = c2.r - c1.r;
        int g = c2.g - c1.g;
        int b = c2.b - c1.b;
               
        int R = c2.r + (int)(percentile * r);
        int G = c2.g + (int)(percentile * g);
        int B = c2.b + (int)(percentile * b);
        
        return new Clr(R,G,B);
    }
}
