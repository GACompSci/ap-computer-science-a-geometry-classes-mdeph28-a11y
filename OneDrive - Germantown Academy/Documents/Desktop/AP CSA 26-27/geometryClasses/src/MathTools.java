public class MathTools {
    //Create the static MathTools methods in this file
    /*
    randInt(int min, int max)
round(double num, int places)
distance(Point a, Point b)
slope(Point a, Point b)
volumeOfSphere(double  */
public static int randint(int min, int max){
    return (int) (Math.random()*(max-min+1))+min;
}
public static double round(double num, int places){
    return (double) ((int)(num*Math.pow(10, places)+.5)/Math.pow(10, places));
}

public static double distance(Point a, Point b){
    double xDiff = (a.getX()-b.getX());
    double yDiff = (a.getY()-b.getY());
    return MathTools.round(Math.sqrt((Math.pow(xDiff, 2))+ Math.pow(yDiff, 2)),2);
}
public static double slope(Point a, Point b) {
 double xDiff = (a.getX()-b.getX());
 double yDiff = (a.getY()-b.getY());
 return MathTools.round((yDiff/xDiff),3);
}
}
