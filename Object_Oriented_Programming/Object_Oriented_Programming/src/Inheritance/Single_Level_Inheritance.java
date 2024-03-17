package Inheritance;

public class Single_Level_Inheritance {
    public static void main(String[] args)
    {
        Car car = new Car("MHCO-019","Honda","Passion-Pro",69,95000);
        car.display_information();
    }
}
class MotorVehicle
{
    public String model,company;
    public void display_specs()
    {
        System.out.println("The Model number of the Car is "+this.model);
        System.out.println();
        System.out.println("The MotorVehicle belongs to the "+this.company+" Company");
        System.out.println();
    }
    public MotorVehicle(String model,String company)
    {
        this.model=model;
        this.company=company;
    }
}
class Car extends MotorVehicle
{
    public String name;
    public double price;
    public int discount_rate;
    public Car(String model,String company,String name,int discoutn_rate,int price)
    {
        super(model,company);
        this.discount_rate=discoutn_rate;
        this.name=name;
        this.price=price;
    }
    public double final_price(double price,int discount_rate)
    {
        double discount_price=price*discount_rate*0.01;
        return price-discount_price;
    }
    public void display_information()
    {
        super.display_specs();
        System.out.println("The Name of the Car is "+this.name);
        System.out.println();
        System.out.println("The Discout Rate on the Car is "+this.discount_rate);
        System.out.println();
        System.out.println("The Final price after applying "+this.discount_rate+"% is "+final_price(this.price,this.discount_rate));
    }
}

