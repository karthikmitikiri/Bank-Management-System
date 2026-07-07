import java.util.Scanner;
class Withdraw{
    public static void main(String args[]){
        int balanceAmount = 7000;
        int withdrawAmount = 5000;
        if(withdraw <0){
        System.out.println("Invalid withdraw amount");
        }
        else if(withdrawAmount <= balanceAmount){
            System.out.println("Withdraw successful.");
            balanceAmount -= withdrawAmount;
            System.out.println("Balance: " + balanceAmount);
        }
        else{
            System.out.println("Insufficient balance.");
        }
    }
}