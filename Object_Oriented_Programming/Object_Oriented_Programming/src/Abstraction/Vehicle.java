package Abstraction;

import java.util.Scanner;

public abstract class Vehicle
{
    public  int no_tyres,price;
   public String model,name;
    public abstract double milage(int distance,int time,int speed);
    public abstract void display_info(String model,String name,int price);
    public Vehicle(int no_tyres)
    {
        this.no_tyres=no_tyres;
    }

}
class Car extends Vehicle
{

    @Override
    public double milage(int distance, int time, int speed) {
        double milage_speed = distance/time;
        milage_speed = milage_speed*speed;
        milage_speed=milage_speed/(distance+time);
        return milage_speed;
    }
    @Override
    public void display_info(String model, String name, int price) {
        System.out.println("The Model of the Car is :"+model);
        System.out.println("The Name of the Name is :"+name);
        System.out.println("The Price of the Car is :"+price);
    }
    public Car(int no_tyres,String model,String name,int price)
    {
        super(no_tyres);
        this.model=model;
        this.name=name;
        this.price=price;
    }
}
class Bike extends Vehicle
{
    @Override
    public double milage(int distance, int time, int speed)
    {
        double milage_speed = distance/time;
        milage_speed = milage_speed*speed;
        milage_speed=milage_speed/(distance+time);
        return milage_speed;
    }

    @Override
    public void display_info(String model, String name, int price)
    {
        System.out.println("The Model of the Car is :"+model);
        System.out.println("The Name of the Name is :"+name);
        System.out.println("The Price of the Car is :"+price);
    }
    public Bike(int no_tyres,String model,String name,int price)
    {
        super(no_tyres);
        this.model=model;
        this.name=name;
        this.price=price;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the model of the Car");
        String model=s.nextLine();
        System.out.println("Enter the Name of the Car");
        String name=s.nextLine();
        System.out.println("Enter the Price");
        int price = s.nextInt();
        System.out.println("Enter the no of Tyres");
        int no_tyres=s.nextInt();
        System.out.println("Enter the distance Travelled");
        int distance=s.nextInt();
        System.out.println("Enter the time");
        int time=s.nextInt();
        System.out.println("Enter the Speed ");
        int speed=s.nextInt();
        Car maruti = new Car(no_tyres,model,name,price);
        System.out.println("The Milage of the Car is :"+maruti.milage(distance,time,speed));
        maruti.display_info(model,name,price);
        Bike kawasaki = new Bike(no_tyres,model,name,price);
        System.out.println("The Milage of the Bike is:"+kawasaki.milage(distance,time,speed));
        kawasaki.display_info("kawaaski","Kawasaki Ninja",500000);
        int array[] = new int[10];
    }
}


