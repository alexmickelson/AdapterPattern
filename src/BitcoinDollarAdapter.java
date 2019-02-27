public class BitcoinDollarAdapter extends USDSystem{
    private double bitcoinWorth;
    private BitcoinSystem bitcoinSystem;

    public BitcoinDollarAdapter(BitcoinSystem bitcoinSystem){
        bitcoinWorth = 3801.43;
        this.bitcoinSystem = bitcoinSystem;
    }

    public double getBalance(){
        return bitcoinSystem.getBalance() * bitcoinWorth;
    }

    @Override
    public boolean withdraw(double dollars){
        var bitcoin = dollars / bitcoinWorth;
        return bitcoinSystem.withdraw(bitcoin);
    }

    public boolean deposit (double dollars){
        var bitcoin = dollars / bitcoinWorth;
        return bitcoinSystem.deposit(bitcoin);
    }
}
