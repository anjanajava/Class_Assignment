// Private Variables, Getters and Setters for Bank Account Assignment


import java.util.Scanner;

public class CA_SecuredBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CA_SecuredBA ac1 = new CA_SecuredBA();  
		ac1.
		
System.out.println("Please enter the Action to want (Deposit/ Withdraw/ Balance/ Quit: ");
Scanner input = new Scanner(System.in);
String UserAction = input.next();
							

Scanner value = new Scanner(System.in);
float amount;

switch (UserAction) {
case "Deposit":
System.out.println("Enter the deposit amount: ");
amount = value.nextFloat();
ac1.deposit(amount);
System.out.println("The current balance is: " + ac1.getBal());
break;
case "Withdraw":
System.out.println("Enter the Withdrawal amount: ");
amount = value.nextFloat();
ac1.withdraw(amount);
System.out.println("The current balance is: " + ac1.getBal());
break;
case "Balance":
System.out.println("The Account Balance is:" + ac1.getBal());
break;
case "Quit":
System.out.println("Thank you!");
break;
	}
}



}
