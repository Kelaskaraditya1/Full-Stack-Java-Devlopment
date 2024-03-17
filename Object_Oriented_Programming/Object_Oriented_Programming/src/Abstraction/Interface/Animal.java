package Abstraction.Interface;
import java.util.*;
public interface Animal
{
    public static final int ear=2,eyes=2;
    public abstract void walking();
    public abstract void sound();
    public default void age(int a)
    {
        System.out.println("I am an Animal.");
        System.out.println("My age is: "+a);
    }
    public static void kill_count(int kill)
    {
        System.out.println("I am a Animal");
        System.out.println("and i have Killed "+kill+" this many Peoples");
    }
}
class Human implements Animal
{
    @Override
    public void walking() {
        System.out.println("I am a Being Human");
        System.out.println("I drive on footpath ");
    }

    @Override
    public void sound() {
        System.out.println("I Talk and sound of my Engine Scares the Shit out of Gereeb on Footpath");
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Human salman =new Human();
        System.out.println("My name is Salman Khan.\nand I love Hiran.");
        System.out.println("Enter the age of Salman");
        int age=s.nextInt();
        salman.age(age);
        System.out.println("Enter the Kill Count of Salman");
        int kill_count=s.nextInt();
        Animal.kill_count(kill_count);
        salman.walking();
        salman.sound();
    }

}

