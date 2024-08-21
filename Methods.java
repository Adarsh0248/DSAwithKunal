import java.util.Scanner;
class Sum{
     int sum(int a,int b){
        return a+b;
    }
}


public class Methods {

    public static void main(String[] args) {
        Sum obj = new Sum();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x = sc.nextInt();
        System.out.println("Enter the second number:");
        int y =sc.nextInt();
        int ans;
        ans =obj.sum(x,y);
        System.out.println("The sum is "+obj.sum(x,y));

    }

}
