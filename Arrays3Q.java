import java.util.Scanner;
import java.util.Scanner;
import BasicOperations.Operations;
import BasicOperations.operationsOnArrays;

public class Arrays3Q {
    static int[] Questions(int[] array) {
        int[] arr_2 = {array[0], array[array.length - 1]};
        return arr_2;
    }


    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);
        operationsOnArrays obj = new operationsOnArrays();
        System.out.println("Enter the no of elements in array : ");
        int l = get.nextInt();
        int[] arr = new int[l];
        obj.inputArray(arr);
        System.out.println("The entered array is : ");
        obj.printArray(arr);
        System.out.println("Sorted array : ");
        obj.sortAscending(arr);
        obj.printArray(arr);
        int [] na = Questions(arr);
        obj.printArray(na);

        }


}
