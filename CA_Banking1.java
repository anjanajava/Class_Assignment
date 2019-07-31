// Private Variables, Getters and Setters


import java.util.Scanner;

public class CA_Banking1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CA_BankAccount1 /* class */ ac1 = new CA_BankAccount1() /* constructor */;  
		//ac1.CA_BankAccount1();   // for default customer account and details, constructor is initialized
		// ac1.CA_BankAccount1(AC);   for user input on Customer account number. want to use this as primary key for accessing db

		
/*
		//getter and setter example
  		
		System.out.println("Do you want to change number Account number (true/ false): ");
		Scanner ui = new Scanner(System.in);
		Boolean ans = ui.nextBoolean();
		
if (ans = true)
{
		Scanner detail = new Scanner(System.in);
		//Getter and Setter
		System.out.println("Old Account number: " + ac1.getAC());
		System.out.println("Please enter New Account number: ");
		int newAC = detail.nextInt();
		ac1.setAC(newAC);
		System.out.println("The New Account number is: " + ac1.getAC());
}
		
		
else 		
{	
*/
	
		
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
