package tddProjects;

import java.util.Scanner;

public class AccountApplication {
    public static void main(String... Sleek) {
        //create two objects of the class Account
        Account account1 = new Account("Blessing",1000.00 );
        Account account2 = new Account("Banke",500.60 );

        // display initial account balance of each object
        displayAccountBalance(account1, account2);

        // create a Scanner to obtain input from user
        Scanner input = new Scanner(System.in);
        //prompt for deposit amount in account1
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        account1.depositMoney(depositAmount);

        System.out.printf("%nAdding %.2f to Blessing's balance%n%n", depositAmount);
        displayAccountBalance(account1, account2);

        //prompt for deposit amount in account2
        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        account2.depositMoney(depositAmount);

        System.out.printf("%nAdding %.2f to Banke's balance%n%n", depositAmount);
        displayAccountBalance(account1, account2);

        //prompt for withdrawal amount from account 1
        System.out.print("Enter withdrawal amount for account1: ");
        double withdrawalAmount = input.nextDouble(); // read the input
        account1.withdrawMoney(withdrawalAmount);

        System.out.printf("%nWithdrawing %.2f from Blessing's balance%n%n", withdrawalAmount);
        displayAccountBalance(account1, account2);

        //prompt for withdrawal amount for account 2
        System.out.print("Enter  withdrawal amount for account2: ");
         withdrawalAmount = input.nextDouble();
         account2.withdrawMoney(withdrawalAmount);

        System.out.printf("%nWithdrawing %.2f from Banke's balance%n%n", withdrawalAmount);
        displayAccountBalance(account1, account2);


    }






    private static void displayAccountBalance(Account account1, Account account2) {
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                account2.getName(), account2.getBalance());
    }

}
