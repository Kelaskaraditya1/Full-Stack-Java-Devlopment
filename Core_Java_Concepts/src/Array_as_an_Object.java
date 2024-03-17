

import java.sql.SQLOutput;
import java.util.*;
public class Array_as_an_Object {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Student students[] = new Student[10];
        for(int i=0;i<10;i++)
            students[i]=new Student();
        students[0]=new Student("Aditya","Computer","Te",54,'A');
        students[1]=new Student("Mayur","Computer","Te",56,'A');
        students[0].print_intfo();
        students[1].print_intfo();
    }
}
class Student
{
    public String name,department,year;
    public int roll_no;
    public char div;
    public Student()
    {}
    public Student(String name,String department,String year,int roll_no,char div)
    {
        this.name=name;
        this.department=department;
        this.year=year;
        this.roll_no=roll_no;
        this.div=div;
    }
    public void print_intfo()
    {
        System.out.println("The name.txt of the Student is "+this.name);
        System.out.println("the department of the Student is "+department);
        System.out.println("The student is currently studying in "+ year+" Year");
        System.out.println("The roll-no of the student is "+roll_no);
        System.out.println("The Division of the Student is "+div);
    }

}

