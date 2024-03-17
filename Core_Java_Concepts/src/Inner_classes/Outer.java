package Inner_classes;
public class Outer {
    public int a;
    public void method1()
    {
        System.out.println("I am Outer Class,my value is: "+this.a);
    }
    public Outer(int a)
    {this.a=a;}
    class Inner
    {
        public int b;
        public void method2()
        {
            System.out.println("I am Inner Class,my value is: "+this.b);
        }
        public Inner(int b)
        {this.b=b;}
    }
}
class Test
{
    public static void main(String[] args)
    {
        Outer outer = new Outer(10);
        outer.method1();
        Outer.Inner inner = outer.new Inner(15);
        inner.method2();
    }
}

