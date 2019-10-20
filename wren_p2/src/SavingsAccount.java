public class SavingsAccount {
    private static double annualInterestRate = 0.04;
    private double savingsBalance;

    public void setBalance (double initBalance){
        savingsBalance = initBalance;
    }

    public static void modifyInterestRate (double newInterest ){
        annualInterestRate = newInterest;
    }


    public void calculateMonthlyInterest(){
        double intEarned = (savingsBalance * annualInterestRate / 12);
        savingsBalance += intEarned;

    }

    public void print1(){
        System.out.println("The balance for account 1 is:");
        System.out.printf( "%.2f\n", savingsBalance);
    }
    public void print2(){
        System.out.println("The balance for account 2 is:");
        System.out.printf( "%.2f\n", savingsBalance);
    }

}


