
import java.util.Scanner;
public class Array_oned {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[20];
        System.out.println("Enter the no of elements");
        int no = sc.nextInt();
        System.out.println("Enter the elements");
        for (int i = 0; i < no; i++)
            array[i] = sc.nextInt();
        for (int i = 0; i < no; i++) {
            for (int j = i + 1; j < no; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println("After Sorting the array");
        for (int i = 0; i < no; i++)
            System.out.print(array[i] + " ");
    }
}
