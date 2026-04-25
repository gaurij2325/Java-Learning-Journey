import java.util.Scanner;

public class DiscountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String customerType;
        String response;
        do {

            System.out.print("Enter the purchase amount: ");
            int pAmount = sc.nextInt();
            sc.nextLine();
            System.out.print("Are you a member of the chain?(yes/no): ");
            String isMember = sc.nextLine();
            System.out.print("Is this a festive season?(yes/no): ");
            String isFestive = sc.nextLine();

            int Discount = 0;

            if (pAmount >= 5000) {
                Discount = Discount + 20;

            } else if (pAmount >= 2000) {
                Discount = Discount + 10;

            } else {
                Discount = Discount + 5;

            }

            Discount += isFestive.equalsIgnoreCase("yes") ? 10 : 0;
            Discount += isMember.equalsIgnoreCase("yes") ? 5 : 0;

            if (Discount > 30) {
                Discount = 30;
            }

            int finalAmount = pAmount - (pAmount * Discount / 100);
            if (finalAmount >= 5000) {
                customerType = "Premium";
            } else if (finalAmount >= 2000) {
                customerType = "Regular";
            } else {
                customerType = "Basic";
            }

            System.out.println("-----SUMMARY-----");
            System.out.println("Total amount: " + pAmount);
            System.out.println("Discount applied: " + Discount + "%");
            System.out.println("Final amount: " + finalAmount);
            System.out.println("Customer type: " + customerType);

            System.out.print("Do you want to continue?: ");
            response = sc.nextLine();

        } while (response.equalsIgnoreCase("yes"));
        System.out.println("Thank you!");

        sc.close();

    }
}

