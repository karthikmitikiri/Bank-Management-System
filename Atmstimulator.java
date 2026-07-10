import java.util.Scanner;
public class Atmstimulator {
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

    public static void showBalance(long balance){
        System.out.println("Current Balance: " + balance);
    }

public static long deposit(long balance, long depositAmount){
    if(depositAmount <= 0){
        System.out.println("Invalid deposit amount");
    }
    else{
    balance += depositAmount;
    System.out.println("Deposit successful.");
    System.out.println("Current Balance: " + balance);
    }
    return balance;
}

public static long withdraw(long balance, long withdrawAmount){
    if(withdrawAmount <=0){
    System.out.println("Invalid withdraw amount");
    }
    else if(withdrawAmount <= balance){
    balance -= withdrawAmount;
    System.out.println("Withdraw successful.");
    System.out.println("Current Balance: " + balance);
    }
    else{
    System.out.println("Insufficient balance.");
    }
    return balance;
}

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        String bankName = "XYZ BANK";
        int choice = 0;
        long  balance = 5000, depositAmount;
        welcomeMessage(bankName);
        while(choice !=4){
            showMenu();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

        switch(choice){
            case 1:
                showBalance(balance);
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                depositAmount = sc.nextLong();
                balance = deposit(balance, depositAmount);
                break;

            case 3:
                System.out.println("Enter withdraw amount: ");
                long withdrawAmount = sc.nextLong();
                balance = withdraw(balance, withdrawAmount);
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
