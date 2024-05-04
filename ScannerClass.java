import java.util.Scanner;

public class ScannerClass {
    public static void main(String args[]) {
        int age;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = obj.nextLine();
        System.out.println("what is your age");
        age=obj.nextInt();
        System.out.println("Name: "+name+"\n"+"Age: "+age);
    }
}
