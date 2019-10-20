class Application {
    public static void main(String[] args){
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        int i;

        saver1.setBalance(2000.00);
        saver2.setBalance(3000.00);

        for (i=0; i<12; ++i){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }
        saver1.print1();
        saver2.print2();

        saver1.modifyInterestRate(0.05);
        saver2.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        saver1.print1();
        saver2.print2();



    }
}
