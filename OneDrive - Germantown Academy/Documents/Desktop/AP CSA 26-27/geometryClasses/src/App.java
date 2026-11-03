public class App {
    public static void main(String[] args) throws Exception {
        // Create your objects and call their method here

        System.out.println(MathTools.randint(1, 10));
        System.out.println(MathTools.round(1.487, 2));
        
        Point a =new Point(MathTools.randint(1, 10),MathTools.randint(1,10));
        Point b = new Point(MathTools.randint(1, 10),MathTools.randint(1,10));
        Point d = new Point(MathTools.randint(1, 10),MathTools.randint(1,10));
        Point rand = new Point(MathTools.randint(1, 10),MathTools.randint(1,10));
        System.out.println(a.getX());
        System.out.println(MathTools.distance(a,b));
        System.out.println(MathTools.slope(a, b));
        Circle c = new Circle(a,MathTools.randint(1, 10));
        System.out.println(c.getRadius());
        System.out.println(c.getArea());
        Rectangle r = new Rectangle(a,MathTools.randint(1, 10),MathTools.randint(1, 10));
        System.out.println(r.getArea());
        Triangle t = new Triangle(a,rand,d);
        System.out.println(t.getArea());
    }
}
