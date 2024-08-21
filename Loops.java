import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows :");
        int a = sc.nextInt();
//        System.out.println("Enter columns:");
//        int b = sc.nextInt();
        for (int i =1;i<=a;i++){
            for (int j=1;j<=a-i+1;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1||i==a)
                System.out.print(i);
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

    }
}
