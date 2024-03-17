import java.util.*;
public class Constructors {
    public String name;
    public String student_id;
    public Constructors()
    {}
    public Constructors(String name,String student_id)
    {
        this.name=name;
        this.student_id=student_id;
    }
    public Constructors(Constructors constructor)
    {
        this.name=constructor.name;
        this.student_id=constructor.student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }
    static void display(Constructors constructors)
    {
        System.out.println("The Student-id of the Student is "+constructors.student_id);
        System.out.println("The Name of the Student is "+constructors.name);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Constructors constructors1 = new Constructors();
        System.out.println("Enter the name for the 1st Constructor");
        constructors1.name=s.next();
        System.out.println("Enter the Student id for the 1st Constructor");
        constructors1.student_id=s.next();
        System.out.println("The information of 1st Constructor is ");
        display(constructors1);
        Constructors constructors2 = new Constructors("2021FHCO041","Mayur");
        System.out.println();
        System.out.println("The information of 2nd Constructor is ");
        display(constructors2);
        Constructors constructors3 = new Constructors(constructors2);
        System.out.println("The Information of the 3 rd Constructor is ");
        display(constructors3);
    }
}
