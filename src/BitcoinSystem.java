import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class BitcoinSystem {
    private Vector<Double> transactions;

    public BitcoinSystem(){
        transactions = new Vector<Double>();
    }

    public double getBalance(){
        double sum = 0;
        for (var t: transactions) {
            sum += t;
        }
        System.out.println("Balance is \u20BF" + sum);
        return sum;
    }

    public boolean withdraw(double amount){
        if (getBalance() >= amount){
            transactions.add(0 - amount);
            System.out.println("Withdrew \u20BF" + amount);
            return true;
        }
        return false;
    }

    public boolean deposit (double amount){
        transactions.add(amount);
        System.out.println("Deposited \u20BF" + amount);
        return true;
    }
}
