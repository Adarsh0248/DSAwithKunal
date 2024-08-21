import java.util.*;
import BasicOperations.operationsOnArrays;
public class arraysPractice {
    static void Pair(int []arr,int a){
        operationsOnArrays obj = new operationsOnArrays();
        int triplet = 0;
        System.out.println("Pairs with sum "+a+" are:");
        for (int i = 0;i<arr.length;i++){
            for (int j =i+1;j<arr.length;j++){
                for (int k = j+1;k<arr.length;k++){
                    if (arr[i]+arr[j]+arr[k]==a) {
                        int[] ans = {arr[i], arr[j],arr[k]};
                        obj.printArray(ans);
                        triplet++;
                    }

                }

            }
        }
        if(triplet==0)
            System.out.println("NO triplets FOUND");
        else
            System.out.println("No of Triplets found : "+triplet);
    }
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        operationsOnArrays obj = new operationsOnArrays();
        int[] arr = new int[100];
        for (int i =0;i<arr.length;i++){
            arr[i]=i;
        }
//        System.out.println("Enter The no of elements in the array:");
//        int l = get.nextInt();
//        System.out.println("Enter the numbers in  Array : ");
//        int[] arr = new int[l];
//        obj.inputArray(arr);
        System.out.println("Enter the sum x :");
        int x = get.nextInt();
        Pair(arr,x);



    }
}
