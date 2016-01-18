package art.lines;

public class xyPair{    
    public double x; //protected?
    public double y;
    
    public xyPair(double startX, double startY){
        x = startX;
        y = startY;
    }
    
    public xyPair(xyPair p, double angle, double length){
        x = (length * Math.cos(Math.toRadians(angle))) + p.x;
        y = (length * Math.sin(Math.toRadians(angle))) + p.y;
    }
    
    void setX(double newX){
        x = newX;
    }
    
    void setY(double newY){
        y = newY;
    }
    
    //sets this point's location to target point
    void setxyPair(xyPair p){
        x = p.x;
        y = p.y;
    }
    
    //moves this point by the x and y stored in the target
    void moveBy(xyPair p){
        x = x+p.x;
        y = y+p.y;
    }
}
