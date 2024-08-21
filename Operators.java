import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 5,b=6;
        int c;
        c=++a;
        int d = b++;
        System.out.println(c);
        System.out.println(d);
        System.out.println(b);
        System.out.println("pqr"+4+5);
        System.out.println(4+5+"pqr");
        System.out.println("Enter a number");
        int e = s.nextInt();
        String f;
        f = (e % 2 == 0) ? "even":"odd";
        System.out.println(f);

    }
}
