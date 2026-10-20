public class Circle{
    private int radius;
    private Point center;

    public Circle(Point xcenter, int xradius){
        center = xcenter;
        radius = xradius;
    }

    public double getRadius(){
        return MathTools.round(radius,2);
    }
    public Point getCenter(){
        return (center);
    }
    public double getArea(){
        return MathTools.round(Math.PI*(Math.pow(radius,2)),2);
    }









}