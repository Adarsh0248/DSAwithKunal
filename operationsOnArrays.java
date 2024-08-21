package BasicOperations;
import java.util.Scanner;

public class operationsOnArrays {
    public void printArray(int [] arr) {
        System.out.print("Array : ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

//--------------------------------------------------------------------------------------------------------------------//
    public void printArray2D(int [][]arr) {
        System.out.println("Array : ");
        for (int[] val : arr) {
            for (int a : val) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
//--------------------------------------------------------------------------------------------------------------------//
    public void inputArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter "+arr.length+" Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

//--------------------------------------------------------------------------------------------------------------------//
    public int [][] inputSquareArray2d() {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of Rows : ");
        int r = sc.nextInt();
        System.out.print("No of Columns : ");
        int c = sc.nextInt();
        int [][] arr = new int[r][c];
        System.out.println("Enter Elements of 2d array");
        for (int i = 0; i <r ; i++) {
            for (int j =0; j<c;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

//--------------------------------------------------------------------------------------------------------------------//
    public void inputArray2d(int [][]arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements of 2d array");
        for (int i = 0; i <arr.length; i++) {
            for (int j =0; j<arr[i].length;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

//--------------------------------------------------------------------------------------------------------------------//
    public void occurrenceOfX(int [] arr,int x){
        int count = 0;
        for (int val:arr){
            if (val==x)
                count++;
        }
        if (count==0)
            System.out.println("Number not found.");
        else
            System.out.println("No of times x occurred is "+count);
    }

//--------------------------------------------------------------------------------------------------------------------//
    public void sortAscending(int[] arr){
        int temp;
        for (int i = arr.length; i>0;i--){
            for (int j = 0; j<i-1;j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;



                }
            }
        }
    }

//--------------------------------------------------------------------------------------------------------------------//
    public void reverseArray(int []arr){
//        int l=0;
//        if(arr.length%2==0)
//            l=arr.length/2;
//        else
//            l= (arr.length-1)/2;
        for (int i = 0;i<arr.length/2;i++){
            arr[i]=arr[i]+arr[arr.length-i-1];
            arr[arr.length-i-1]=arr[i]-arr[arr.length-i-1];
            arr[i]-=arr[arr.length-i-1];
        }

    }

//---------------------------------------------------------------------------------------------------------------------//
    public void rotateArray(int []arr,int j){
        for (int i =1; i<=j;i++){
            int x=arr[0];
            int temp = arr[arr.length-1];
            for (int k = 0;k<arr.length;k++){
                 arr[k+1]+=x;
                 x=arr[k+1]-x;
                 arr[k+1]-=x;
            }
            arr[0]=temp;
        }
    }

//--------------------------------------------------------------------------------------------------------------------//
    public void reverse_Array(int []arr,int i,int j){
        int x=j-i+1;
//        int l=0;
//        if(arr.length%2==0)
//            l=arr.length/2;
//        else
//            l= (arr.length-1)/2;
        for (int k =i;k<i+(x/2);k++){
            arr[k]=arr[k]+arr[j];
            arr[j]=arr[k]-arr[j];
            arr[k]-=arr[j];
            j--;
        }

    }

//--------------------------------------------------------------------------------------------------------------------//
    public static void Swap(int [] arr, int i, int j){
        if(i==j) return;
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]-=arr[j];
    }

//--------------------------------------------------------------------------------------------------------------------//
    public void makePrefixSum(int []arr){
        for (int i = 1; i <arr.length ; i++) {
            arr[i] += arr[i-1];
        }
    }

//--------------------------------------------------------------------------------------------------------------------//
    public static int[][] multiplyMatrix(int[][] arr1,int r1, int c1, int[][] arr2,  int r2, int c2){
        int [][] product = new int[r1][c2];
        if (c1!= r2) {
            System.out.println("Multiplication not Possible");
            return product;
        }
        for (int i = 0; i <r1 ; i++) {
            for (int j = 0;j < c2;j++){
                for (int k = 0; k < c1 ; k++){

                        product[i][j]+= arr1[i][k]*arr2[k][j];


                }
            }
        }
        return product;
    }
//--------------------------------------------------------------------------------------------------------------------//

    public static void arrayTranspose(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[i].length; j++) {
                arr[i][j] += arr[j][i];
                arr[j][i] = arr[i][j] - arr[j][i];
                arr[i][j] -= arr[j][i];
            }

        }
    }

//--------------------------------------------------------------------------------------------------------------------//

    public void spiralMatrix(int [][] arr){
        System.out.println("The spiral of the Given Matrix is : ");
        int rowStart=0,rowEnd=arr.length-1,colStart=0,colEnd=arr[0].length-1;
        int totalElements = 0;
        while (totalElements <= arr.length*arr[0].length) {
            for (int i = colStart; i <= colEnd && totalElements <= arr.length*arr[0].length; i++) {
                System.out.print(arr[rowStart][i]+",");
                totalElements++;
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd && totalElements <= arr.length*arr[0].length; i++) {
                System.out.print(arr[i][colEnd]+",");
                totalElements++;
            }
            colEnd--;
            for (int i = colEnd; i >= colStart && totalElements <= arr.length*arr[0].length; i--) {
                System.out.print(arr[rowEnd][i]+",");
                totalElements++;
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowStart && totalElements <= arr.length*arr[0].length; i--) {
                System.out.print(arr[i][colStart]+",");
                totalElements++;
            }
            colStart++;
        }
    }

//--------------------------------------------------------------------------------------------------------------------//
}

