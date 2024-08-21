import java.util.Scanner;
public class NumberSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        //binary to decimal converter
//        System.out.println("Enter the binary number:");
//        int a =sc.nextInt();
//        int pow =0;
//        int result=1,integer=0;
//
//        while (a>0){
//
////                for (int i = 1; i <= pow; i++) {
////                    result *= 2;
////                }
//
//
//                integer =integer +(a%10)*result;
//                a=a/10;
//                result*=2;
//
//        }
//        System.out.println("the value in decimal ="+integer);
        System.out.println("Enter decimal number");
        int decimalNumber=sc.nextInt();
        int binaryNumber=0;
        int pow=1;
        while (decimalNumber>0){
            binaryNumber=binaryNumber+(decimalNumber%2)*pow;
            decimalNumber=decimalNumber/2;
            pow*=10;
        }
//        int originalBinaryNumber=0;
//        while (binaryNumber>0){
//            originalBinaryNumber=originalBinaryNumber*10+binaryNumber%10;
//            binaryNumber/=10;
//        }
        System.out.println(binaryNumber);
    }
}
