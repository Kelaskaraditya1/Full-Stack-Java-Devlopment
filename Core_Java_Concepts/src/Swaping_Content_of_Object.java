
import java.util.*;
public class Swaping_Content_of_Object {
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Aditya","Android-devloper",20,100000);
        Employee e2 = new Employee("Aaryamaan","Android-Devloper",20,200000);
        e1.show_details();
        e2.show_details();
        System.out.println();
        Employee tmp = e1;
        e1=e2;
        e2=tmp;
        e1.show_details();
        e2.show_details();

    }
}
class Employee
{
    String name,position;
    int salery,age;
    public Employee(String name,String position,int age,int salery)
    {
        this.name=name;
        this.position=position;
        this.age=age;
        this.salery=salery;
    }
    public void show_details()
    {
        System.out.println("The name.txt of the Employee is "+name);
        System.out.println("The Position of the Employee is "+position);
        System.out.println("The age of the Employee is "+age);
        System.out.println("The salery of the Employee is "+salery);
    }
}