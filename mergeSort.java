import java.util.*;
public class mergeSort {
    static void inputArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter "+arr.length+" Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static void merge(int[] arr,int l,int mid ,int r){
        int n1 = mid-l+1;
        int n2 = r - mid;
        int [] left = new int[n1];
        int [] right = new int[n2];
        for (int i = l; i <= mid; i++) {
            left[i]=arr[i];
        }
        for (int i = mid+1; i <=r; i++) {
            right[i]=arr[i];
        }
        int i,j,k;
        i=0;
        j=0;
        k=l;
        while (i<n1 && j<n2){
            if (left[i]<right[j]) arr[k++]=left[i++];
            else arr[k++]=right[j++];
        }
        while (i<n1) arr[k++]=left[i++];
        while (j<n2) arr[k++]=right[j++];

    }
    static void merge_Sort(int[] arr,int l ,int r){
        if (l>=r)return;
        int mid = (l+r)/2;
        merge_Sort(arr,l,mid);
        merge_Sort(arr,mid+1,r);
        merge(arr,l,mid,r);

    }
    static void printArray(int [] arr) {
        System.out.print("Array : ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the number of elements in array : ");
        int l = get.nextInt();
        int [] arr = new int[l];
        inputArray(arr);
        System.out.println("Array before sorting ");

        printArray(arr);
        merge_Sort(arr,0,l-1);
        System.out.println("Array after sorting : ");
        printArray(arr);

    }
}