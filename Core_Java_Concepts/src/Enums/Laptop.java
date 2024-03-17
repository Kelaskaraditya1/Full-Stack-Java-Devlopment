package Enums;
import java.util.*;
public enum Laptop
{
    Lenovo(),Acer(),Asus(),Dell();
    private int price;
    private Laptop(int price)
    {
        this.price=price;
    }
    private Laptop()
    {}

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
class Test
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Laptop laptop1 = Laptop.Lenovo;
        Laptop laptop2 = Laptop.Acer;
        Laptop laptop3 = Laptop.Asus;
        Laptop laptop4 = Laptop.Dell;
        laptop1.setPrice(s.nextInt());
        laptop2.setPrice(s.nextInt());
        laptop3.setPrice(s.nextInt());
        laptop4.setPrice(s.nextInt());
        for(Laptop laptop : Laptop.values())
            System.out.println(laptop.getPrice());


    }
}

