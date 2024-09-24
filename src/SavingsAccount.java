public class SavingsAccount extends BankAccount {

    private static double interestrate=3;
    double newbalance;

    public void createAccount(String accname,double interest)
    {
        super.createAccount(accname);
        this.interestrate=interest;
    }

    public void displayAccDetails()
    {
        super.displayAccDetails();
        System.out.println("The type of your account is:Savings Account");
        System.out.println("The interest rate is:"+this.interestrate);
    }
    public void calculateInterest() {
        newbalance = this.balance*(interestrate / 100);
        this.balance+=newbalance;
        System.out.println("The balance is:"+this.balance);

    }
}
