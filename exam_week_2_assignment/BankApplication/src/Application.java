 public class Application {
    public static void main(String[] args) throws Exception {
        BankAccount savingsAccount = new SavingsAccount(1500);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(700);
        savingsAccount.withdraw(400);

        System.out.println();

        BankAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.deposit(500);
        checkingAccount.withdraw(400);
        checkingAccount.withdraw(900);
    }
}
