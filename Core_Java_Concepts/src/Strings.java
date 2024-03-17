
import java.util.*;
public class Strings
{
    public static void main(String[] args)
    {
        String name="Aditya";
        String name1="Aditya";
        System.out.println(name);
        //Comprision operations of Strings
        System.out.println("The Length of the String is: "+name.length());
        System.out.println("is String empty: "+String.valueOf(name.isBlank()));
        System.out.println(name.equals(name1));
        System.out.println(name.equals("Aditya"));
        System.out.println(name.compareTo("AdityaK"));
        //Searching Operations of Strings
        System.out.println("Wheather it contains string 1 "+name.contains(name1));
        System.out.println("Wheather is contains Adi "+name.contains("Adik"));
        System.out.println("Wheather it Starts with a "+name.startsWith("a"));
        System.out.println("Wheather Starts with A "+name.startsWith("A"));
        System.out.println("The Location of A is "+name.indexOf("A"));
        //indivisual charecter
        System.out.println("The charecter present at 3 rd index is "+name.charAt(3));
        // Substrings
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,3));
        //Lower and Upper Case
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        //static method valueof returns String value of any arg
        System.out.println(String.valueOf(1523));

    }
}