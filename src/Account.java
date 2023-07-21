abstract class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);


}

