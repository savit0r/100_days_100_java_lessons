//1.Account class
class Account{
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    //Constructor
    public Account(String accountNumber, String accountHolderName, 
    double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    //Deposite Method
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited $ " + amount + " successfully");
        }
        else{
            System.out.println("Invalid deposite amount");
        }
    }

    //Withdraw Method
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdraw $ " + amount + 
            " successfully");
        }
        else{
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    //Display Method
    public void displayBalance( ){
        System.out.println("Account Balance: $" + balance);
    }
}



//2.SavingsAccount class
class SavingsAccount extends Account{
    private double interestRate;

    //Constructor
    public SavingsAccount(String accountNumber, String accountHolderName
    , double initialBalance, double interestRate){
        super(accountNumber, accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }

    //Add interest to balance
    public void addInterest(){
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of $ " + interest + " added" );
    }

    @Override
    public void displayBalance(){
        System.out.println("Saving account balance: $ " + balance );
    }
}


//CurrentAccount class
class CurrentAccount extends Account{
    private double overdraftLimt;

    //Constructor
    public CurrentAccount(String accountNumber, String accountHolderName,
    double initialBalance, double overdraftLimt){
        super(accountNumber, accountHolderName, initialBalance);
        this.overdraftLimt = overdraftLimt; 
    }

    //Override withdraw to allow overdraft
    @Override
    public void withdraw(double amount){
        if(amount > 0 &&(balance + overdraftLimt) >= amount){
            balance -= amount;
            System.out.println("Withdrew $ " +amount + " successfully");
            
            if(balance < 0){
                System.out.println("Account is in overdraft.");
            }
        }
        else{
                System.out.println("Exceed overdraft limit or invalid amount");
            }
    }
    @Override
    public void displayBalance(){
        System.out.println("Current account balance: " + balance);
    }
}



class Main{
    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount("SA1001", "Alice Smith", 1000.0, 0.05 );
        System.out.println("Created savings account for " + savings.accountHolderName);
        savings.displayBalance();
        savings.deposit(500);
        savings.withdraw(200);
        savings.addInterest();
        savings.displayBalance();
        System.out.println("*******************************************************");


        CurrentAccount current = new CurrentAccount("CA1001", "John Wick", 500.0, 300.0);
        System.out.println("Created Current Account for " + current.accountHolderName);

        current.displayBalance();
        current.withdraw(600);
        current.displayBalance();
        current.withdraw(300);
        current.displayBalance();
        
    }
}