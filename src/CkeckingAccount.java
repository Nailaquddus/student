public class CkeckingAccount extends Account{
    public CkeckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance +=amount;
    }

    @Override
    public void withdraw(double amount){
        if (amount<=balance+100){
            balance-=amount;}
        else {
            System.out.println("invalid amount");
        }
    }
}
