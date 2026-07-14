class BankAccount {
    long accountNumber;
    String accountHolderName;
    long balance;
    String ifscCode;

    BankAccount(long accountNumber, String accountHolderName, long balance, String ifscCode) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.ifscCode = ifscCode;
    }

    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void deposit(long depositAmount){
        if(depositAmount <= 0){
            System.out.println("Invalid deposit amount");
        }
        else{
            this.balance += depositAmount;
            System.out.println("Deposit successful.");
            System.out.println("Current Balance: " + this.balance);
        }
    }

    public void withdraw(long withdrawAmount){
        if(withdrawAmount <=0){
            System.out.println("Invalid withdraw amount");
        }
        else if(withdrawAmount <= this.balance){
            this.balance -= withdrawAmount;
            System.out.println("Withdraw successful.");
            System.out.println("Current Balance: " + this.balance);
        }
        else{
            System.out.println("Insufficient balance.");
        }
    }
}