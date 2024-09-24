import java.util.Scanner;
import java.util.Random;
public class account {

    String accountname;
    int panno;
    int accountnumber;
    int initialdeposit;
    int balance;

    Scanner sc=new Scanner(System.in);

    public void createaccount()
    {

        System.out.println("Enter your name:");
        this.accountname=sc.nextLine();
        System.out.println("Enter your pan number:");
        this.panno=sc.nextInt();
        Random rd=new Random();
        this.accountnumber=rd.nextInt(12000);
        System.out.println("Account created succesfully");
        System.out.printf("The account number assigned to you is %d\n",this.accountnumber);
        System.out.println("Enter your initial deposit amount");
        this.initialdeposit=sc.nextInt();
        sc.nextLine();
        this.balance=this.initialdeposit;
        System.out.println("Cash deposited successfully");



    }
    public void depositcash()
    {
        System.out.println("Enter your account name");
        String name=sc.nextLine();
        System.out.println("Enter your account number");
        int number=sc.nextInt();
        sc.nextLine();
        if(this.accountname.equals(name) && this.accountnumber==number)
        {
            System.out.println("Enter the amount to be deposied");
            int amount=sc.nextInt();
            sc.nextLine();
            this.balance+=amount;
            System.out.println("Cash deposited succesfully");

        }
        else
        {
            System.out.println("Enter a valid account number and account name");
        }
    }

    public void withdrawcash()
    {
        System.out.println("Enter your account name");
        String name=sc.nextLine();
        System.out.println("Enter your account number");
        int number=sc.nextInt();
        sc.nextLine();
        if((this.accountname).equals(name) && this.accountnumber==number)
        {
            System.out.println("Enter the amount to be withdrawn");
            int amount=sc.nextInt();
            sc.nextLine();
            if(amount>this.balance)
            {
                System.out.println("Insufficient balance");
                System.out.printf("The balance in your account is %d\n",this.balance);
            }
            else {
                this.balance-=amount;
                System.out.println("Cash withdrawn succesfully");
            }

        }
        else
        {
            System.out.println("Enter a valid account number and account name");
        }
    }

    public void viewbalance()
    {
        System.out.println("Enter your account name");
        String name=sc.nextLine();
        System.out.println("Enter your account number");
        int number=sc.nextInt();
        sc.nextLine();
        if((this.accountname).equals(name) && this.accountnumber==number)
        {
            System.out.printf("The balance in your account is %d\n",this.balance);
        }
        else {
            System.out.println("Enter a valid account no or name");
        }
    }



}