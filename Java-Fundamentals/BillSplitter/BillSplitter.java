import java.util.Scanner;

public class BillSplitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response;
        do {

            double amt;
            int people;

            System.out.println("Welcome to the Bill Splitter");

            System.out.println("Enter the total amount: ");
            amt = sc.nextDouble();

            System.out.println("enter the total number of people");
            people = sc.nextInt();
            sc.nextLine();

            double actualValue = indiv_Value(amt, people);
            System.out.println("Actual contribution per person: " + actualValue);

            int roundedValue = (int) actualValue;
            System.out.println("Rounded off contribution per person: " + roundedValue);

            System.out.println("Do you want to continue? (yes/no)");
            response = sc.nextLine();

        } while (response.equalsIgnoreCase("yes"));
        System.out.println("Thank you!");
        sc.close();

    }

    static double indiv_Value(double amt, int people) {
        return amt / people;
    }

}

