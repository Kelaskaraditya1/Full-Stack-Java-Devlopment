package Inheritance;
public class Hierarchial_Inheritance {
    public static void main(String[] args) {
        Car_mark_two car = new Car_mark_two("MHCO-019", "Lamborgini", "Mcs-20", 500000, 18);
        car.display_car_info();
        System.out.println();
        Bike bike = new Bike("MHCO-0142","Honda","FZS-20",200000,18);
        bike.display_bike_info();
    }
}
class MotorVehicle_Mark_two
{
    public String model,company;
    public MotorVehicle_Mark_two(String model,String company)
    {
        this.model=model;
        this.company=company;
    }
    public void display()
    {
        System.out.println("The model number of the Motorrvehicle is "+this.model);
        System.out.println();
        System.out.println("The MotorVehicle belongs to "+this.company+" company");
        System.out.println();
    }
}
class Car_mark_two extends MotorVehicle_Mark_two
{
    public String name;
    public double price;
    public int discount_rate;
    public Car_mark_two(String model,String company,String name,double price,int discount_rate)
    {
        super(model,company);
        this.name=name;
        this.price=price;
        this.discount_rate=discount_rate;
    }
    public void display_car_info()
    {
        super.display();
        System.out.println();
        System.out.println("The Name of the Car is "+this.name);
        System.out.println();
        System.out.println("The discount Rate for the car is "+this.discount_rate);
        System.out.println();
        System.out.println("The Final Price of the Car is "+final_price(this.price,this.discount_rate)+" after applying "+this.discount_rate);
        System.out.println();
    }
    public double final_price(double price,int discount_rate)
    {
        double discount_price=price*discount_rate*0.01;
        return price-discount_price;
    }
}
class Bike extends MotorVehicle_Mark_two
{
    public String name;
    public double price;
    public int discount_rate;

    public Bike(String model,String company,String name,double price,int discount_rate)
    {
        super(model,company);
        this.name=name;
        this.price=price;
        this.discount_rate=discount_rate;
    }

    public void display_bike_info()
    {
        super.display();
        System.out.println();
        System.out.println("The Name of the Bike is "+this.name);
        System.out.println();
        System.out.println("The discount Rate for the Bike is "+this.discount_rate);
        System.out.println();
        System.out.println("The Final Price of the Bike is "+final_price(this.price,this.discount_rate)+" after applying "+this.discount_rate);
        System.out.println();
    }
    public double final_price(double price,int discount_rate)
    {
        double discount_price=price*discount_rate*0.01;
        return price-discount_price;
    }

}

