import java.util.Random;
import java.util.List;
import java.util.ArrayList;
public class BankAccount {

    String accountname;
    int accountnumber;
    double balance;
    private List<Transaction> transactions;


    public void  createAccount(String accname)
    {
        this.accountname=accname;
        Random rd=new Random();
        this.accountnumber=rd.nextInt(12000);
        System.out.println("Account created succesfully");
        System.out.println("Your account number is:"+this.accountnumber);
        this.balance=0.0;
        this.transactions = new ArrayList<>();


    }
    public void deposit(double amount)
    {
        if(amount>0)
        {
            this.balance+=amount;
            System.out.println("Amount deposited successfully");
            transactions.add(new Transaction("Deposit",this.balance));
        }
        else {
            System.out.println("Enter a valid amount");
        }

    }
    public void withdraw(double amount) throws InsufficientFundsException
    {
        if(amount>0 && amount<balance)
        {
            this.balance-=amount;
            System.out.println("Amount withdrawn successfully");
            transactions.add(new Transaction("Withdraw",this.balance));
        }
        else {
            throw new InsufficientFundsException("Insufficient funds for this transaction");
        }

    }

    public void displayAccDetails()
    {
        System.out.println("The accountname is:"+this.accountname);
        System.out.println("The accountnumber is:"+this.accountnumber);

        System.out.println("The account balance is:"+this.balance);
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
