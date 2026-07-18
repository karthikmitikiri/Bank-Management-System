class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private int accountType;
    private long balance;
    private String ifscCode;

    BankAccount(long accountNumber, String accountHolderName, long balance, String ifscCode) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.ifscCode = ifscCode;
    }


    public long getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public long getBalance(){
        return balance;
    }
    public String getIfscCode(){
        return ifscCode;
    }

    public String getAccountType(int accountType){
        this.accountType = accountType;
        if (accountType ==1){
            return "Savings Account";
        }
        else if(accountType ==2){
            return "Current Account";
        }
        else{
            return "Invalid account type";
        }
    }

    public void setAccountHolderName(String accountHolderName){
        if(accountHolderName != null && !accountHolderName.isEmpty()){
            this.accountHolderName =accountHolderName;
        }
        else{
            System.out.println("Invalid account holder name");
            System.out.println();
        }
    }

    public void showBalance() {
        System.out.println("Current Balance: " + balance);
        System.out.println();
    }

    public void deposit(long depositAmount){
        if(depositAmount <= 0){
            System.out.println("Invalid deposit amount");
            System.out.println();
        }
        else{
            this.balance += depositAmount;
            System.out.println("Deposit successful.");
            showBalance();
            System.out.println();
        }
    }

    public void withdraw(long withdrawAmount){
        if(withdrawAmount <=0){
            System.out.println("Invalid withdraw amount");
            System.out.println();
        }
        else if(withdrawAmount <= this.balance){
            this.balance -= withdrawAmount;
            System.out.println("Withdraw successful.");
            System.out.println("Current Balance: " + this.balance);
            System.out.println();
        }
        else{
            System.out.println("Insufficient balance.");
            System.out.println();
        }
    }

    protected void addBalance(long amount){
        this.balance += amount;
    }

    protected boolean deductBalance(long amount){
        if(amount <= this.balance){
            this.balance -= amount;
            return true;
        }
        else{
            return false;
        }
    }

    public void displayAccountDetails(){

        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder Name: " + getAccountHolderName());
        System.out.println("Account Type: " + (getAccountType(accountType)));
        System.out.println("Current Balance: " + getBalance());
        System.out.println("IFSC Code: " + getIfscCode());
        System.out.println();
    }
}