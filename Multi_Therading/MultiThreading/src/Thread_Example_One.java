class Thread_one extends Thread
{
    @Override
    public void run()  {
        super.run();
        for(int i=0;i<100;i++)
        {
            System.out.println("I am Ironman");
            try {
                sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Thread_two extends Thread
{
    @Override
    public void run()  {
        super.run();
        for(int i=0;i<100;i++)
        {
            System.out.println("I am the most complete programmer in the world");
            try {
                sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Thread_Example_One
{
    public static void main(String[] args)
    {
        Thread_one threadOne = new Thread_one();
        Thread_two threadTwo = new Thread_two();
        threadOne.start();
        try {
            Thread.sleep(1);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        threadTwo.start();
    }

}
