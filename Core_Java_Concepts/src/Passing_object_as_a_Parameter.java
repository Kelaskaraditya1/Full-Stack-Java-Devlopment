import java.util.*;

import static java.awt.geom.Point2D.distance;

public class Passing_object_as_a_Parameter{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Point a = new Point(10,20);
        Point b = new Point(5,10);
        double dist = a.distance(a,b);
        System.out.println("The Distance between 2 points is "+dist);
    }
}
class Point
{
    public int x,y;
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public double distance(Point a,Point b)
    {
        double dista = Math.pow((a.x-b.x),2);
        double distb = Math.pow((a.y-b.y),2);
        double distance = Math.pow((dista+distb),0.5);
        return distance;
    }
}

