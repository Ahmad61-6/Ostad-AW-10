package exam_week_2_assignment;

public class BankApplication{
public static void main(String args[]){

}
}

abstract class BankAccount{
abstract void deposit();
abstract void withdraw();
}

class SavingsAccount extends BankAccount{

    @Override
    void deposit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }

    @Override
    void withdraw() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
    }

}

class CheckingAccount extends BankAccount{

    @Override
    void deposit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }

    @Override
    void withdraw() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
    }

}