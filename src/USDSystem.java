import java.util.Vector;

public class USDSystem {
    private Vector<Double> transactions;

    public USDSystem(){
        transactions = new Vector<Double>();
    }

    public double getBalance(){
        double sum = 0;
        for (var t: transactions) {
            sum += t;
        }
        System.out.println("Balance is $" + sum);
        return sum;
    }

    public boolean withdraw(double amount){
        if (getBalance() >= amount){
            transactions.add(0 - amount);
            System.out.println("Withdrew $" + amount);
            return true;
        }
        return false;
    }

    public boolean deposit (double amount){
        transactions.add(amount);
        System.out.println("Deposited $" + amount);
        return true;
    }
}