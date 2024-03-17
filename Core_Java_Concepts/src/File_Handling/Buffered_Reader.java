package File_Handling;
import java.io.*;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
public class Buffered_Reader
{
    public static void main(String[] args) throws IOException,FileNotFoundException
    {
     File file = new File("C:\\Users\\Aditya\\Desktop\\Programing files all\\Full_Stack_Java_Devlopment\\Core_Java_Concepts\\src\\File_Handling\\name.txt");
     try {
         FileReader fr = new FileReader(file);
         BufferedReader br = new BufferedReader(fr);
         System.out.println(br.readLine());
     }
     catch (Exception e)
     {
         e.printStackTrace();
     }
    }
}
