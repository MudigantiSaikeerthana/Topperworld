import java.util.*;

public class AtmSimulator 
{
     private static double balance = 1000.0;
              public static int pin=1234;
      public static void checkBalance() 
      {
        System.out.println("Your current balance is: " + balance);
      }

    public static void depositMoney() 
{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount you want to deposit: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive amount.");
        } else {
            balance += amount;
            System.out.println("You have successfully deposited " + amount);
        }
  }

    public static void withdrawMoney() 
{

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount you want to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount <= 0 || amount > balance) 
        {
            System.out.println("Invalid amount or insufficient balance. Please try again.");
        } 
       else {
            balance -= amount;
            System.out.println("You have successfully withdrawn " + amount);
        }
 }

         public static void main(String[] args) 
             {
              System.out.println("enter ypur ATM pin");
               Scanner scanner = new Scanner(System.in);
               int pin1=scanner.nextInt();
                  if(pin1==pin)
                     {
                        while (true) 
                              {
                                 System.out.println("ATM Simulator Menu:");
                                 System.out.println("1. Check Balance");
                                  System.out.println("2. Deposit Money");
                                   System.out.println("3. Withdraw Money");
                                     System.out.println("4. Exit");
                                    System.out.print("Enter your choice: ");


                                      int choice = scanner.nextInt();

                                  switch (choice)
                                            {
                                               case 1:
                                                  checkBalance();
                                                          break;
                                                case 2:
                                                   depositMoney();
                                                          break;
                                                 case 3:
                                                   withdrawMoney();
                                                           break;
                                                 case 4:
                                                    System.out.println("Thank you for using the ATM");
                                                   System.exit(0);
                                                 default:
                                                  System.out.println("Invalid choice. Please try again.");
                                             }
                                          }
                                       }
else
{
System.out.println("Sorry you entered Wrong pin...!! Please enter the Correct pin");
}
    
}
}
