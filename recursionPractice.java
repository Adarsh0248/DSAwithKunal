import java.util.Scanner;
public class recursionPractice {
//    static int factorial(int a){
//        if (a<=1)
//            return 1;
//        else
//            return a*factorial(a-1);
//    }
//    static void fibonacci(int a,int b,int terms){
//        if (terms <=1)
//            return;
//        else {
//            System.out.println(b);
//            fibonacci(b,a+b,terms-1);
//        }
//    }
//
//
//
    static int alternateSum(int n){
        if (n==1)
            return 1;
       if (n%2==0)
           return -n+alternateSum(n-1);
       return n+alternateSum(n-1);



    }

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter num : ");
//        int a = get.nextInt();
//        System.out.print("Enter k : ");
        int p = get.nextInt();
        System.out.println("The sum  is : "+alternateSum(p));
    }
}
