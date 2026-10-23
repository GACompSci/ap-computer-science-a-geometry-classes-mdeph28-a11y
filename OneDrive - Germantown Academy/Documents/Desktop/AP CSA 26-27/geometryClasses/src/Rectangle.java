public class Rectangle {
    private Point topLeft;
    private int length;
    private int width;
    
    public Rectangle(Point xtopLeft, int xlength, int xwidth){
        topLeft= xtopLeft ;
        length = xlength;
        width = xwidth;
        
        
    }
    public double getArea(){
        return MathTools.round((width*length), 2);
        
        

      
    }
}
