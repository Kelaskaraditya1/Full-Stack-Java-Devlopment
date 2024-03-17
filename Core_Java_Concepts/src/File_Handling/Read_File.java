package File_Handling;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Read_File
{
    public static void main(String[] args) throws IOException,FileNotFoundException
    {
        File file = new File("C:\\Users\\Aditya\\Desktop\\Programing files all\\Full_Stack_Java_Devlopment\\Core_Java_Concepts\\src\\File_Handling\\name.txt");
     Scanner s = new Scanner(file);
     int i=0;
     while(s.hasNextLine())
         System.out.println(s.nextLine());
    }
}
