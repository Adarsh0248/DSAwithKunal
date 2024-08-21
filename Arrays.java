import  java.util.Scanner;

import BasicOperations.Operations;
import BasicOperations.*;
class DataArray{
    int [] arr ={1,2,3,4,5,6,7,8,9,0};
    void printArray(){
        for (int array : arr){
            System.out.println(array);
        }
        int i = 0;
        while (i<10){
            System.out.println(arr[i]);
            i++;
        }

    }
}
class MultiArray{
    int [][] multiArr = {{4,5,6},{5,8,-119,0},{2,55},{11}};
    void printArray(){
        Scanner sc = new Scanner(System.in);

//        for(int[] arr : multiArr) {
//            for (int val : arr) {
//                if (val > max)
//                    max = val;
//            }
//        }
        System.out.println("Enter the number to search");
        int x = sc.nextInt();
        int ans = -1;
        loop1 :for (int i =0;i< multiArr.length;i++){
           loop2: for (int j = 0; j<multiArr[i].length; j++){
                if (multiArr[i][j]==x) {
                    ans = i;
                    System.out.println("Number found at index "+i+","+j);
                    break loop1;
                }
            }
        }
        System.out.println(ans);
    }
}


public class Arrays {
    public static void main(String[] args){
        operationsOnArrays obj = new operationsOnArrays();
        int [] arr ={1,2,3,4,5,6,7,8,9,0};
        int [][] multiArr = {{4,5,6},{5,8,-119,0},{2,55},{11}};

        obj.printArray(arr);
        obj.printArray2D(multiArr);
    }
}
