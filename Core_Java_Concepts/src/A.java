public abstract class A
{
    public abstract void method();
}
class B
{
    public void method1()
    {
        System.out.println("I am Batman");
    }
}
class Anonymous_two extends B
{
    public static void main(String[] args)
    {
        A object = new A() {
            @Override
            public void method() {
                System.out.println("I am ironman");
            }
        };
        object.method();
    }
    B object1 = new B()
    {
        public void method1()
        {
            System.out.println("I am Batman");
            System.out.println("I am vengence");
            System.out.println("I am the night");
        }
    };
}


