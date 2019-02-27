public class Main {
    public static void main(String[] args){


        var bitcoin = new BitcoinSystem();
        System.out.println("Paul has no bitcoin");
        bitcoin.getBalance();
        System.out.println("Paul made 300 bitcoin");
        bitcoin.deposit(300);
        bitcoin.getBalance();


        System.out.println("\n\n\n\n");


        USDSystem paul = new BitcoinDollarAdapter(bitcoin);

        System.out.println("Pauls bitcoin balance");
        paul.getBalance();
        System.out.println("\nPaul made $100");
        paul.deposit(100);

        System.out.println("\nPauls bitcoin balance");
        paul.getBalance();
        System.out.println("\nPaul bought $10000 of pizza");
        paul.withdraw(10000);
        paul.getBalance();

    }
}
