public class SavingAccount extends Account{

    public SavingAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount){
        balance+=amount;
    }
    @Override
    public void withdraw(double amount){
      if (balance>=amount){
          balance-=amount;
      }else{
          System.out.println("insufficient funds");
      }
    }
}
