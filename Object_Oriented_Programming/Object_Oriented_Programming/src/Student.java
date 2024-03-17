import java.util.*;
public class Student {
    String name,department,year,student_id;
    int roll_no;
    char div;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public char getDiv() {
        return div;
    }

    public void setDiv(char div) {
        this.div = div;
    }
    public void show_info()
    {
        System.out.println("The Student-Id of the Student is "+this.student_id);
        System.out.println("The Name of the Student is "+this.name);
        System.out.println("The Department of the Student is "+this.department);
        System.out.println("The student is currently studying in "+this.year+" Year");
        System.out.println("The Roll-No of the Student is "+this.roll_no);
        System.out.println("The Division of the Student is "+this.div);
        System.out.println();
    }

    public Student(String student_id, String name, String department, String year, int roll_no, char div)
    {
        this.student_id=student_id;
        this.name=name;
        this.department=department;
        this.year=year;
        this.roll_no=roll_no;
        this.div=div;
    }
    public Student(Student s)
    {
        this.student_id=s.student_id;

    }

    public Student(){}
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Student s1 = new Student("2021FHCO042","Aditya","Computer","TE",54,'A');
        s1.show_info();
        Student s2 = new Student();
        System.out.println("Enter the Student-Id of the Student");
        s2.setStudent_id(s.next());
        System.out.println("Enter the Name of the Student");
        s2.setName(s.next());
        System.out.println("Enter the Department of the Student");
        s2.setDepartment(s.next());
        System.out.println("Enter the Current Year of Study of the Student");
        s2.setYear(s.next());
        System.out.println("Enter the Rollno of the student");
        s2.setRoll_no(s.nextInt());
        System.out.println("Enter the Division of the Student");
        s2.setDiv(s.next().charAt(0));
        s2.show_info();
    }
}

