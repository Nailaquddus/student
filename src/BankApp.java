import game.Player;

public class BankApp {
    public static void main(String[] args) {
       SavingAccount savingAccount = new SavingAccount(1500);
        savingAccount.deposit(600);
        savingAccount.withdraw(2200);
        System.out.print("on saving Account you have "+savingAccount.balance);
        Player play = new Player();
          play.moveRight();
               play.moveLeft();
               play.turnAround();
               play.punch();

        CkeckingAccount checkingAccount= new CkeckingAccount(2000);
        checkingAccount.deposit(500);
        checkingAccount.withdraw(4000);

        System.out.println("on checkingAccount you have:$ "+checkingAccount.balance);
        Account sAccount=new SavingAccount(500);
        Account[]accounts=new Account[3];
        accounts[0]=checkingAccount;
        accounts[1]=savingAccount;
        accounts[2]=sAccount;
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].balance);
        }
    }
}
