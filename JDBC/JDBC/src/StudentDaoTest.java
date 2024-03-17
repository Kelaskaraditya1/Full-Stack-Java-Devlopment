import java.util.*;
public class StudentDaoTest
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the sid of the Student");
//        int sid=s.nextInt();
//        Student student = (Student) StudentDao.getInfo(sid);
//        System.out.println("Name: "+student.getName());
//        System.out.println("Age: "+student.getAge());
//        System.out.println("Contact: "+student.getContact());
//        System.out.println("Nationality: "+student.getNationality());
        System.out.println("Sid:");
        int sid=s.nextInt();
        System.out.println("Name:");
        String name=s.next();
        System.out.println("Age:");
        int age=s.nextInt();
        System.out.println("Contact:");
        String contact=s.next();
        System.out.println("Nationality:");
        String nationality=s.next();
        Student student = new Student(sid,name,contact,nationality,age);
        StudentDao.insertStudent(student);
    }
}
