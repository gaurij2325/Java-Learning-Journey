import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response;
        int choice;
        double a, b;
        double result = 0;
        char format;
        do {
            System.out.println("""
                    -----MENU-----
                    1. ADDITION
                    2. SUBTRACTION
                    3. MULTIPLICATION
                    4. DIVISION
                    5. MODULUS
                    6. EXIT
                    """);

            System.out.print("Enter the 1st number: ");
            a = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter the 2nd number: ");
            b = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter your choice (1-6): ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    result = a + b;
                    break;

                case 2:
                    result = a - b;
                    break;

                case 3:
                    result = a * b;
                    break;

                case 4:
                    if (b == 0) {
                        System.out.println("Division by 0 is invalid");
                        break;
                    } else {
                        result = a / b;
                    }
                    break;

                case 5:
                    result = a % b;
                    break;

                case 6:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid input");
                    sc.close();
                    return;

            }

            System.out.print("Press R for a rounded off result and A for actual value: ");
            format = sc.next().charAt(0);
            sc.nextLine();
            if (format == 'A') {
                System.out.println("Result=" + result);
            } else if (format == 'R') {
                System.out.println("Result= " + (int) result);
            } else {
                System.out.println("Invalid format");
            }

            System.out.println("Do you want to continue? (yes/no)");
            response = sc.nextLine();
        } while (response.equalsIgnoreCase("yes"));
        System.out.println("Thank you!");

        sc.close();
    }

}
