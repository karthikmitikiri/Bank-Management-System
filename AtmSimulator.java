import java.util.Scanner;

public class AtmSimulator {
    public static void welcomeMessage(String bankName){
        System.out.println("***************************");
        System.out.println("          "+bankName);
        System.out.println("Welcome to Bank Management System");
        System.out.println("***************************");

    }

    public static void showMenu(){
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit Amount");
        System.out.println("3. Withdraw Amount");
        System.out.println("4. Exit");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String bankName = "XYZ BANK";
        int choice = 0;
        long depositAmount;
        BankAccount account = new BankAccount(
    123456789,
    "Karthik",
    5000,
    "SBIN000123"
);

        welcomeMessage(bankName);
        while(choice !=4){
            showMenu();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    account.showBalance();
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    depositAmount = sc.nextLong();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter withdraw amount: ");
                    long withdrawAmount = sc.nextLong();
                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Thank you for choosing " + bankName);
                    break;

                default:
                    System.out.println("Invalid choice.");
                    System.out.println("Please select a number between 1-4.");
            }
        }

    }
}
