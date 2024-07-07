public abstract class BankAccount {
    double balance;
    
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void deposit(double balance){
        this.balance += balance;

    }
    abstract void withdraw(double amount);
}
