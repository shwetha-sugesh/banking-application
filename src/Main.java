//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        char op;
        char choice;
        int ch1=-1;

        String accname;
        System.out.println("Welcome to banking services");

        BankAccount  ac=new BankAccount();
        SavingsAccount sa=new SavingsAccount();
        CurrentAccount ca=new CurrentAccount();
        do {
            System.out.println("Choose the service required from the menu ");
            System.out.println("1.CREATE AN ACCOUNT  2.DEPOSIT CASH  3.WITHDRAW CASH 4.DISPLAYDETAILS 5.EXIT");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.println("Choose which type of account");
                    System.out.println("1.Savings Account 2.Current Account");
                    ch1=sc.nextInt();
                    sc.nextLine();
                    if(ch1==1)
                    {
                        System.out.println("Enter account name");
                        accname = sc.nextLine();
                        sa.createAccount(accname);
                    }
                    else {
                        System.out.println("Enter account name");
                        accname = sc.nextLine();
                        ca.createAccount(accname);

                    }
                    break;

                    case 2:

                        System.out.println("Enter the amount");
                        double amt = sc.nextDouble();
                        if(ch1==1){
                            sa.deposit(amt);

                        }
                        else {
                            ca.deposit(amt);
                        }



                        break;

                        case 3:
                                try{
                                    System.out.println("Enter the amount");
                                     amt = sc.nextDouble();
                                        if(ch1==1)
                                        {
                                            sa.withdraw(amt);

                                        }
                                        else {
                                            ca.withdraw(amt);
                                        }


                                }
                                catch(InsufficientFundsException e){
                                    System.out.println(e.getMessage());
                                }
                                break;

                        case 4:

                            if (ch1==1)
                            {
                                sa.displayAccDetails();
                                System.out.println("After updating the interest rate");
                                sa.calculateInterest();
                            }
                            else {
                                ca.displayAccDetails();
                            }




                            break;
                        case 5:
                            System.exit(0);

                        default:
                            System.out.println("Enter a valid choice");
                    }
                    System.out.println("Do you wish to avail any other services:Type y to continue Type n to exit");
                    choice = sc.next().charAt(0);


            }
            while (choice == 'y') ;





    }
}
