package File_Handling;
import java.io.*;
import java.util.*;

public class File_Output_Stream
{
    public static void main(String[] args) throws IOException,FileNotFoundException
    {
        Scanner s = new Scanner(System.in);
        try {
            File file = new File("C:\\Users\\Aditya\\Desktop\\Programing files all\\Full_Stack_Java_Devlopment\\Core_Java_Concepts\\src\\File_Handling\\name.txt");
            FileOutputStream stream = new FileOutputStream(file, false);
            System.out.println("Enter the data to be entered in the File");
            String input = s.nextLine();
//            char data[] = input.toCharArray();
//            int i = 0;
//            while (i < file.length())
//                stream.write(data[i++]);
//            stream.close();
//            System.out.println("Data entered sucessfully\n");
            FileWriter writter = new FileWriter(file,false);
            writter.write(input);
            writter.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

