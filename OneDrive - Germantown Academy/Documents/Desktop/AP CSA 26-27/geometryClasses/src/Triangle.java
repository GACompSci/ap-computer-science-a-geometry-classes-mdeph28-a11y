public class Triangle {
    private Point vertice1;
    private Point vertice2;
    private Point vertice3;
    


    public Triangle(Point v1, Point v2, Point v3){
    
        vertice1=v1;
        vertice2=v2;
        vertice3=v3;
        
    }
    public double getArea(){
        double sidea = MathTools.distance(vertice2, vertice1);
        double sideb = MathTools.distance(vertice2, vertice3);
        double sidec = MathTools.distance(vertice1, vertice3);
        double sp = ((sidea + sideb + sidec)/2);
        double area = Math.sqrt(sp*(sp-sidea)*(sp-sideb)*(sp-sidec));
        return MathTools.round(area, 2);

    }
}
