package art.lines;
public class Line{
    protected xyPair p1;
    protected xyPair p2;
    
    public Line(xyPair point1, xyPair point2){
        p1 = point1;
        p2 = point2;
    }
    
    public Line(xyPair p, double angle, double length){
        p1 = p;        
        p2 = new xyPair(p, angle, length);
    }
    
    //returns the difference between the x and y of p1 and p2
    xyPair getDifference(){
        double x = p2.x - p1.x;
        double y = p2.y - p1.y;
        
        return new xyPair(x,y);
    }
        
    //Finds the Halfway point on the line
    public xyPair getHalfway(){
        double x = (p1.x + p2.x)/2.0;
        double y = (p1.y + p2.y)/2.0;
        
        return new xyPair(x,y);
    }
    
    //percentile will be in a range from 0.0 to 1.0, inclusive
    //returns a point along the line at the given percent
    //where 0 returns p1, and 1 returns p2
    public xyPair getPoint(double percentile){
        xyPair p = getDifference();
        
        double x = p1.x + (percentile * p.x);
        double y = p1.y + (percentile * p.y);
        
        return new xyPair(x,y);
    }
    
    public double getLength(){
        return Math.sqrt(((p2.x - p1.x) * (p2.x - p1.x)) + ((p2.y - p1.y) * (p2.y - p1.y)));
    }
    
    //moves p1 and p2 by the values stored in p
    //for example, p(2,-3) and p1 (4,5)
    //will move p1(x,y) to p1(x+2,y+(-3))
    //so p1(6,2)
    void moveBy(xyPair p){ 
        p1.moveBy(p);
        p2.moveBy(p);        
    }
    
    void moveP1(xyPair p){
        p1.setxyPair(p);
    }
    
    void moveP2(xyPair p){
        p2.setxyPair(p);
    }
}
