import java.util.*;
import BasicOperations.operationsOnArrays;
public class arrayPractice4 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        operationsOnArrays obj = new operationsOnArrays();
        int[] freq = new int[100000];
        System.out.print("Enter The no of elements in the array: ");
        int l = get.nextInt();
        int[] arr = new int[l];
        obj.inputArray(arr);
        for (int i = 0;i<arr.length;i++) {
            freq[arr[i]]++;
        }
        boolean response = false;
        do {
            System.out.println("Enter the number to search.");
            int x = get.nextInt();
            if (freq[x] != 0)
                System.out.println("Present.");
            else System.out.println("Absent");
            System.out.println("Want to continue Yes(1) No(0) ");
            int y= get.nextInt();
            if (y==1)
                response=true;
            else break;
        } while (response);

    }
}
