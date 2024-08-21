import java.util.Scanner;
public class StudentClass {
    int rollNumber =10;
    String name;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentClass S1 = new StudentClass();
        System.out.println("Enter the name of student.");
        S1.name=sc.nextLine();
        System.out.println("Enter Student roll number.");
        S1.rollNumber = sc.nextInt();

        System.out.println("Details of the student are:");
        System.out.println("Name : "+S1.name);
        System.out.println("Roll Number : "+S1.rollNumber);
    }
}
