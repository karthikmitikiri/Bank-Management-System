public class Main {
    public static void main(String[] args) {
        String bankName = "XYZ BANK", customerName = "Karthik";
        int accountNumber = 123456789, balance = 5000, depositAmount = 2000;
        System.out.println("***************************");
        System.out.println("          "+bankName);
        System.out.println("Welcome to Bank Management System");
        System.out.println("***************************");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Deposit Amount: " + depositAmount);
        balance += depositAmount;
        System.out.println("Current Balance: " + balance);
        System.out.println("Thank you for choosing " + bankName);

    }
    
}
