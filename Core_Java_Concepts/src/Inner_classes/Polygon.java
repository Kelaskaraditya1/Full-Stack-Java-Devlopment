package Inner_classes;
public class Polygon {
    int dimension;
    public Polygon(int dimension)
    {
        this.dimension=dimension;
    }
    public void display()
    {
        System.out.println("I am a Polygon and my dimensions are:"+this.dimension);
    }
    static class Triangle
    {
        int length,breadth;
        public Triangle(int length,int breadth)
        {
            this.length=length;
            this.breadth=breadth;
        }
        public void display()
        {
            System.out.println("I am a Triangle");
            System.out.println("My Length is: "+this.length);
            System.out.println("My Bredth is: "+this.breadth);
        }
        public void area()
        {
            System.out.println("The Area of the Triangle is:"+0.5*this.length*this.breadth);
        }
        public void perimeter()
        {
            System.out.println("The perimeter of the Triangle is:"+(this.length+this.breadth));
        }
    }
    public static void main(String[] args)
    {
        Polygon polygon = new Polygon(10);
        Polygon.Triangle triangle = new Polygon.Triangle(10,10);
        polygon.display();
        triangle.display();
    }

}
class EquiTriangle
{
//    public static void main(String[] args)
//    {
//     Polygon polygon = new Polygon(10);
//     polygon.display();
//     Polygon.Triangle triangle = new Polygon.Triangle(10,20);
//     triangle.display();
//     triangle.area();
//     triangle.perimeter();
//    }
}

