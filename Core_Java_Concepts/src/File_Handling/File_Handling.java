package File_Handling;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
public class File_Handling
{
    public static void main(String[] args) throws IOException,FileNotFoundException
    {
        File file = new File("C:\\Users\\Aditya\\Desktop\\Programing files all\\Full Stack Java Devlopment\\Core-Java_programming\\src\\Core_Concepts\\File_Handling\\name.txt.txt");
        file.createNewFile();
        System.out.println(file.exists());
        System.out.println(file.length());
        file.delete();
        System.out.println(file.exists());
    }
}
