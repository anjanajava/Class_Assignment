
import java.util.Scanner;

public class CA_Banking_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Please enter the Action to want (Deposit/ Withdraw/ Balance/ Quit: ");
		Scanner input = new Scanner(System.in);
		String UserAction = input.next();
							
CA_BankAcount /* class */ ac1 = new CA_BankAcount() /* constructor */;  
ac1.CA_BankAccount();   // for default customer account and details, constructor is initialized
// ac1.CA_BankAccount(AC);   for user input on Customer account number. want to use this as primary key for accessing db
Scanner value = new Scanner(System.in);

switch (UserAction) {
case "Deposit":
System.out.println("Enter the deposit amount: ");
float amount = value.nextFloat();
ac1.deposit(amount);
break;
case "Withdraw":
System.out.println("Enter the Withdrawal amount: ");
float amount1 = value.nextFloat();
ac1.withdraw(amount1);
break;
case "Balance":
ac1.printcust();
break;
case "Quit":
System.out.println("Thank you!");
break;

	}


}
	}