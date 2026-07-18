import java.util.Scanner;

public class AtmSimulator {
    public static void welcomeMessage(String bankName){
        System.out.println("***************************");
        System.out.println("          "+bankName);
        System.out.println("Welcome to Bank Management System");
        System.out.println("***************************");

    }

    public static void selectAccountType(){
        System.out.println("Select Account Type: ");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Enter your choice of Account Type: ");
    }

    public static void showMenu(){
        System.out.println("1. Show Account Details");
        System.out.println("2. Show Balance");
        System.out.println("3. Deposit Amount");
        System.out.println("4. Withdraw Amount");
        System.out.println("5. Change Account Holder Name");
        System.out.println("6. Exit");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String bankName = "XYZ BANK";
        int choice = 0;
        long depositAmount;
        BankAccount account;

        welcomeMessage(bankName);

        selectAccountType();
        int accountTypeChoice = sc.nextInt();
        switch(accountTypeChoice){
            case 1:
                System.out.println("You have Successfully selected Savings Account.");
                account = new SavingsAccount(
    123456789,
    "Karthik",
    5000,
    "SBIN000123");
                account.getAccountType(1);
                break;

            case 2:
                System.out.println("You have Successfully selected Current Account.");
                account = new CurrentAccount(
    987654321,
    "Karthik",
    10000,
    "SBIN000456");
                account.getAccountType(2);
                break;

            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
                return;
        }
        
    
    
        while(choice !=6){
            showMenu();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch(choice){
                case 1:
                    account.displayAccountDetails();
                    break;
                case 2:
                    account.showBalance();
                    break;

                case 3:
                    System.out.print("Enter deposit amount: ");
                    depositAmount = sc.nextLong();
                    account.deposit(depositAmount);
                    break;

                case 4:
                    System.out.print("Enter withdraw amount: ");
                    long withdrawAmount = sc.nextLong();
                    account.withdraw(withdrawAmount);
                    break;

                case 5:
                    System.out.print("Enter new account holder name: ");
                    String newName = sc.nextLine();
                    account.setAccountHolderName(newName);
                    System.out.println(account.getAccountHolderName() + ", Account holder name updated successfully.\n");
                    break;


                case 6:
                    System.out.println("Thank you for choosing " + bankName);
                    break;

                default:
                    System.out.println("Invalid choice.");
                    System.out.println("Please select a number between 1-6.");
            }
        }

    }
}
