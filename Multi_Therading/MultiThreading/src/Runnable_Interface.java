import static java.lang.Thread.sleep;

class A
{
    public void display()
    {
        for(int i=0;i<10;i++)
            System.out.println("I am Ironman");
    }
}
class Threadone extends Thread
{
    @Override
    public void run() {
        super.run();
        for(int i=0;i<100;i++)
        {
            try {
                System.out.println("I am the most complete programmer in the world");
                sleep(5);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
class Threadtwo extends A implements Runnable
{
    @Override
    public void run() {
        for(int i=0;i<100;i++)
        {
            try {
                System.out.println("I am Batman");
                sleep(5);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class Runnable_Interface
{
    public static void main(String[] args)
    {
        Threadone thread_one = new Threadone();
        thread_one.start();
        try {
            Thread.sleep(1);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        Threadtwo bullet = new Threadtwo();
        Thread gun = new Thread(bullet);
        gun.start();
    }
}
