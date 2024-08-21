import static java.lang.Math.abs;

import java.util.ArrayList;
import java.util.Scanner;
import BasicOperations.operationsOnArrays;

public class recursionLast {
//    static int frogProblem(int []a,int n,int idx){
//        //Base case
//         if(idx == n-1) return 0;
//         if (idx == n-2) return (abs(a[idx]-a[idx+1]));
//         //My Work
//        int op1 = abs(a[idx]-a[idx+1])+frogProblem(a,n,idx+1);
//        int op2 = abs(a[idx]-a[idx+2])+frogProblem(a,n,idx+2);
//
//        return Math.min(op1,op2);
//
//
//    }
    static void keypadTyping(String a, String s){
        if (a.isEmpty()){
            System.out.print(s+",");
            return;
        }
        int x = a.charAt(0)-'0';
        switch (x){
            case 2 :
                String t = "abc";
                for (int i = 0; i < 3; i++) {
                    keypadTyping(a.substring(1),t.charAt(i)+s);

                }
                break;
            case 3 :String q = "def";
                for (int i = 0; i < 3; i++) {
                    keypadTyping(a.substring(1),q.charAt(i)+s);

                }
                break;
            case 4 :String p = "ghi";
                for (int i = 0; i < 3; i++) {
                    keypadTyping(a.substring(1),p.charAt(i)+s);

                }
                break;
            case 5 :String b= "jkl";
                for (int i = 0; i < 3; i++) {
                    keypadTyping(a.substring(1),b.charAt(i)+s);

                }
                break;
            case 6 :
                String n= "mno";
                for (int i = 0; i < 3; i++) {
                    keypadTyping(a.substring(1),n.charAt(i)+s);

                }
                break;
            case 7 :String m = "pqrs";
                for (int i = 0; i < 4; i++) {
                    keypadTyping(a.substring(1),m.charAt(i)+s);

                }
                break;
            case 8 :String j = "tuv";
                for (int i = 0; i < 3; i++) {
                    keypadTyping(a.substring(1),j.charAt(i)+s);

                }
                break;
            case 9 :String f = "wxyz";
                for (int i = 0; i < 4; i++) {
                    keypadTyping(a.substring(1),f.charAt(i)+s);

                }
                break;

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        operationsOnArrays obj = new operationsOnArrays();
        System.out.print("Enter String : ");
        String s = sc.nextLine();
        keypadTyping(s,"");


        }


    }

