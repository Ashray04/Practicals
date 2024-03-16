import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;

        while (true) {
            System.out.println("Scientific Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Sine");
            System.out.println("6. Cosine");
            System.out.println("7. Tangent");
            System.out.println("8. Sin Inverse");
            System.out.println("9. Cos Inverse");
            System.out.println("10. Tan Inverse");
            System.out.println("11. Exponentiation (e^x)");
            System.out.println("12. Exponentiation (10^x)");
            System.out.println("13. Cube root");
            System.out.println("14. Natural Log");
            System.out.println("15. Inverse (1/x)");
            System.out.println("16. Exit");
            System.out.print("Choose an operation: ");
            int choice = scanner.nextInt();

            if (choice == 16) {
                System.out.println("Exiting...");
                break;
            }

            double num1, num2;
            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 + num2;
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    break;
                case 4:
                    System.out.print("Enter dividend: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter divisor: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0)
                        result = num1 / num2;
                    else
                        System.out.println("Error: Cannot divide by zero!");
                    break;
                case 5:
                    System.out.print("Enter the angle in degrees: ");
                    double angle = scanner.nextDouble();
                    result = Math.sin(Math.toRadians(angle));
                    break;
                case 6:
                    System.out.print("Enter the angle in degrees: ");
                    angle = scanner.nextDouble();
                    result = Math.cos(Math.toRadians(angle));
                    break;
                case 7:
                    System.out.print("Enter the angle in degrees: ");
                    angle = scanner.nextDouble();
                    result = Math.tan(Math.toRadians(angle));
                    break;
                case 8:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    result = Math.asin(num1);
                    break;
                case 9:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    result = Math.acos(num1);
                    break;
                case 10:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    result = Math.atan(num1);
                    break;
                case 11:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    result = Math.exp(num1);
                    break;
                case 12:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    result = Math.pow(10, num1);
                    break;
                case 13:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    result = Math.cbrt(num1);
                    break;
                case 14:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    result = Math.log(num1);
                    break;
                case 15:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    if (num1 != 0)
                        result = 1 / num1;
                    else
                        System.out.println("Error: Cannot divide by zero!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("Result: " + result);
        }
        scanner.close();
    }
}
