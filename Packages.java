import java.util.Scanner;
import BasicOperations.*;

import static BasicOperations.Operations.Add;

public class Packages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x = sc.nextInt();
        System.out.println("Enter the second number:");
        int y =sc.nextInt();
        Operations obj = new Operations();

        System.out.println("The sum is "+Add(x,y));
        System.out.println("The sum is "+obj.Sum(x,y));
        System.out.println("The difference is "+obj.Difference(x,y));
        System.out.println("The product is "+obj.Product(x,y));
        System.out.println("The quotient is "+obj.Divide(x,y));

//        Operations obj2 = new Operations(10,9);
//        System.out.println("The sum is "+Add());
//        System.out.println("The sum is "+obj2.Sum());
//        System.out.println("The difference is "+obj2.Difference());
//        System.out.println("The product is "+obj2.Product());
//        System.out.println("The quotient is "+obj2.Divide());

    }
}
