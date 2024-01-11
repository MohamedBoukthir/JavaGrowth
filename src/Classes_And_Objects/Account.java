package Classes_And_Objects;

public class Account {
    private int accountNum;
    private  String name;
    private float amount;

    public void insert(int a, String n, Float amt){
        this.accountNum = a;
        this.name = n;
        this.amount = amt;
    }

    public void deposit(float amt){
        this.amount = this.amount + amt;
        System.out.println(amt + " Deposited.");
    }

    public void withdraw(float amt){
        if (amount < amt) {
            System.out.println("Sorry, Insufficient Balance.");
        }else {
            this.amount = this.amount - amt;
            System.out.println(amt + " Withdrawn.");
        }
    }

    public void checkBalance() {
        System.out.println("Your Balance = " + this.amount);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNum=" + accountNum +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
