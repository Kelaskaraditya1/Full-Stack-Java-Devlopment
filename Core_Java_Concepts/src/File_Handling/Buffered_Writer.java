package File_Handling;
import java.io.*;
import java.util.*;
public class Buffered_Writer
{
    public static void main(String[] args) throws IOException,FileNotFoundException
    {
        Scanner s = new Scanner(System.in);
        File file = new File("C:\\Users\\Aditya\\Desktop\\Programing files all\\Full_Stack_Java_Devlopment\\Core_Java_Concepts\\src\\File_Handling\\name.txt");
        FileWriter writer = new FileWriter(file,true);
        BufferedWriter writer1 = new BufferedWriter(writer);
        System.out.println("Enter the data");
        String data = s.nextLine();
        writer1.write(data);
        writer1.close();
    }
}
