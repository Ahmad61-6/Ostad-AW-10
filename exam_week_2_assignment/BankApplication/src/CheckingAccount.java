class CheckingAccount extends BankAccount{
    private static final double withdraw_charge = 5.80;

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if(balance< amount){
            System.out.println("\n\n** Insufficient amount!! **");
        }
        else{
            balance-=(amount+withdraw_charge);
            System.out.println("\n\n*********\n-- Amount withdrawn from Checking account = " + amount + " BDT.\n-- Total amount withdrawn with charge = " + (amount + withdraw_charge)+"\n-- Current Balance = "+balance+"\n*********");
        }
    }

}