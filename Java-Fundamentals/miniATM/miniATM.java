import java.util.Scanner;

public class miniATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialAmt = 1000;
        int choice;
        do {

            System.out.println("""
                        ----MENU----
                        1.Check balance
                        2. Deposit
                        3. Withdraw
                        4. Exit
                    """);

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("your balance is: " + initialAmt);
                    break;

                case 2:
                    System.out.println("enter the amount to be deposited: ");
                    int deposit = sc.nextInt();
                    // sc.nextLine();
                    initialAmt += deposit;
                    System.out.println("the total balance after depositing is " + initialAmt);
                    break;

                case 3:
                    System.out.println("enter the amount to be withdrawn: ");
                    int withdraw = sc.nextInt();
                    // sc.nextLine();
                    if (withdraw < initialAmt) {
                        System.out.println("processing withdrawal..");
                        initialAmt -= withdraw;
                        System.out.println("the total balance after withdrawal is " + initialAmt);

                    } else {
                        System.out.println("the value to be withdrawn exceeds the total balance");
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("invalid choice");

            }
        } while (choice != 4);
        sc.close();

    }

}

