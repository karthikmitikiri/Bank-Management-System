class SavingsAccount extends BankAccount {

    SavingsAccount(long accountNumber,
                   String accountHolderName,
                   long balance,
                   String ifscCode) {

        super(accountNumber, accountHolderName, balance, ifscCode);
    }

    @Override
    public void withdraw(long withdrawAmount) {
        if (withdrawAmount <= 0) {
            System.out.println("Invalid withdraw amount");
            System.out.println();
        } else if (withdrawAmount > getBalance()) {
            System.out.println("Insufficient balance");
            System.out.println();
        } else if (getBalance() - withdrawAmount < 1000) {
            System.out.println("Withdrawal failed.");
            System.out.println("Minimum balance of 1000 must be maintained.");
            System.out.println();
        } else if ((getBalance() -withdrawAmount) >= 1000){
            super.withdraw(withdrawAmount);
        }
    }
}
    
