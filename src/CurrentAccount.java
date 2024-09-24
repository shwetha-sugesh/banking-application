public class CurrentAccount extends BankAccount{

    private static double overdraft=500;
    public void createAccount(String accname)
    {
        super.createAccount(accname);

    }

    public void withdraw(double amount) {
        if (balance + overdraft >= amount) {
            balance -= amount;
            if (balance < 0) {
                System.out.println("Withdrawal successful. Overdraft used:" + (-balance));
            } else {
                System.out.println("Withdrawal successful. No overdraft used.");
            }
        } else {
            System.out.println("Overdraft limit exceeded. Withdrawal not allowed.");
        }
    }

    public void displayAccDetails() {

        super.displayAccDetails();
        System.out.println("Account Type: Current");
        System.out.println("Overdraft Limit:" + overdraft);
        System.out.println("Available Overdraft:" + (overdraft + balance));
    }



}
