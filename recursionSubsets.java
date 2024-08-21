import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import BasicOperations.operationsOnArrays;
public class recursionSubsets{
//    static ArrayList<String> subSequences(String s){
//        if (s.length()==1){
//            ArrayList<String> smallAns = new ArrayList<>();
//            smallAns.add("");
//            smallAns.add(s);
//            return smallAns;
//        }
//        ArrayList<String> smallAns = subSequences(s.substring(1));
//        for (int i = 0; i < smallAns.size(); i++) {
//            smallAns.set(i,s.charAt(0)+smallAns.get(i));
//        }
//        smallAns.addAll(subSequences(s.substring(1)));
//        return smallAns;
//    }
    static void subSequences(String s,String currChar){
        if(s.isEmpty()){
            System.out.println(currChar);
            return;
        }
            //base case

            //work
            char curr = s.charAt(0);
            subSequences(s.substring(1),currChar+curr);
            subSequences(s.substring(1),currChar);


        }
        static void arraySSQ(int [] arr,int currSum,int idx){
        if (idx>=arr.length){
            System.out.print(currSum+",");
            return;
        }
        int curr = arr[idx];
        arraySSQ(arr,currSum+curr,idx+1);
            arraySSQ(arr,currSum,idx+1);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        operationsOnArrays obj = new operationsOnArrays();
        System.out.print("Enter a Integer : ");
        int a = sc.nextInt();
        int [] arr = new int[a];
        obj.inputArray(arr);
        arraySSQ(arr,0,0);
    }
}
