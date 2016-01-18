package art.triangles;

import art.lines.*;

public class Triangle{
    xyPair p1;
    xyPair p2;
    xyPair p3;
        
    //an equilateral triangle constructor
    //distance is from the center to a corner
    public Triangle(xyPair center, double angle, double distance){
        p1 = new xyPair(center, 0.0 + angle, distance);
        p2 = new xyPair(center, 120.0 + angle, distance);
        p3 = new xyPair(center, 240.0 + angle, distance);
    }
    
    //triangle constructor
    public Triangle(xyPair [] thexyPairs){
        if(thexyPairs.length < 3){
            throw new RuntimeException("not enough points there, fuckwad");
        }else{
            p1 = thexyPairs[0];
            p2 = thexyPairs[1];
            p3 = thexyPairs[2];
        }        
    }
    
    public Triangle(xyPair center, double angle, double minimum, double maximum){     
        double difference = maximum - minimum;
        
        p1 = new xyPair(center, 0.0 + angle, (Math.random() * maximum) + minimum);
        p2 = new xyPair(center, 120.0 + angle, (Math.random() * maximum) + minimum);
        p3 = new xyPair(center, 240.0 + angle, (Math.random() * maximum) + minimum);
    }
    
    public xyPair[] getPoints(){
        xyPair [] thePairs = {p1, p2, p3};
        return thePairs;
    }
}
