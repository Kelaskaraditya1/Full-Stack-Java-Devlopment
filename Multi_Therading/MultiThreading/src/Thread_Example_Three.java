class Counter {
    public int count;

    public synchronized void increment_counter() {
        this.count++;
    }
}
class ThreadOne implements Runnable
{
    @Override
    public void run() {
        Counter counter = new Counter();
        for(int i=0;i<1000;i++)
            counter.increment_counter();
    }
}
class ThreadTwo implements Runnable
{
    @Override
    public void run() {
        Counter counter = new Counter();
        for(int i=0;i<1000;i++)
            counter.increment_counter();
    }
}
public class Thread_Example_Three
{
    public static void main(String[] args)
    {
        Counter c = new Counter();
        ThreadOne threadone = new ThreadOne();
        ThreadTwo threadtwo = new ThreadTwo();
        Thread t1 = new Thread(threadone);
        Thread t2 = new Thread(threadtwo);
        t1.start();
        t2.start();
        try {

            t1.join();
            t2.join();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("The count is: "+c.count);
    }
}
