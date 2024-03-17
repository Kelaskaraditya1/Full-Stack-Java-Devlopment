interface Computer
{
    public void status();
}
class Laptop implements Computer
{
public void status()
{
    System.out.println("Code,Compile,Run");
}
}
class Desktop implements Computer
{
    public void status()
    {
        System.out.println("Code,Compile,Run,but more faster");
    }
}
class Devloper
{
    public void devloping(Computer computer)
    {
        computer.status();
    }
}

public class Test
{
    public static void main(String[] args)
    {
        Computer computer1 = new Laptop();
        Computer computer2 = new Desktop();
        Devloper devloper = new Devloper();
        devloper.devloping(computer1);
        devloper.devloping(computer2);
    }
}
