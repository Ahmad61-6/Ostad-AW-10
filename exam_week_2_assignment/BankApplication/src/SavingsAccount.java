class SavingsAccount extends BankAccount{

    private static final double limit_of_cash_withdraw = 1000; // Example withdrawal limit for Savings Account

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance && amount <= limit_of_cash_withdraw) {
            balance -= amount;
            System.out.println("\n\n*********\n-- "+amount + " BDT withdrawn from Savings Account.\n-- Current Balance: " + balance+" BDT.\n*********");
        } else {
            System.out.println("\n\n** Withdrawal limit exceeded or insufficient funds for withdrawal from Savings Account!! **");
        }
    }

}