import java.util.Scanner;
public class ATMInterface
{
        public static void main(String args[])
    {
        int balance=8000,withdraw=0,deposit=0;
        try (Scanner s = new Scanner(System.in)) {
            while(true)
            {
                System.out.println("Automated Teller Machine");
                System.out.println("1 Transaction History");
                System.out.println("2 for Withdraw");
                System.out.println("3 for Deposit");
                System.out.println("4 for Check balance");
                System.out.println("5 for EXIT");
                System.out.println("Choose the operation you want");
                int n = s.nextInt();
                switch(n)
                {
                    case 1:
                    System.out.println("Transaction Details");
                    System.out.println("Deposited Amount : "+ deposit);
                    System.out.println("Withdraw Amount :"+ withdraw);
                    System.out.println("Balance : "+balance);
                    System.out.println(" ");
                    break;

                    case 2:
                    System.out.println("Enter money to be withdraw :");
                    withdraw = s.nextInt();
                    if(balance >=withdraw)
                    {
                        balance = balance-withdraw;
                        System.out.println("Please collect your money");
                    }
                    else
                    {
                        System.out.println("Insufficient balance");
                    }
                    System.out.println("");
                    break;

                    case 3:
                    System.out.println("Enter money to be deposited");
                    deposit = s.nextInt();
                    balance =balance + deposit;
                    System.out.println("your money has been successfully deposited");
                    System.out.println("");
                    break;

                    case 4:
                    System.out.println("Balance :"+balance);
                    System.out.println("");
                    break;

                    case 5:
                    System.exit(0);
                }
            }
        }
    }   
}
