//import java.util.Scanner;

public class CA_BankAcount {
int AC = 0;
float Bal = 0.0f;
String CustName = "John";
String eMail = "jhxxxxon@gmail.com";
String Phone = "(xxx) xxx-xxxx";

public void CA_BankAccount() {
	this.AC = 123456789;	
	this.Bal = 50.0f;
	this.CustName = "Anjana";
	this.eMail = "anjanat.java@gmail.com";
	this.Phone = "(925) 587-3912";
}

/*
public void CA_BankAccount(AC) {
	to use account number as primary key to access db.
}
*/

public void deposit(float amount) {
	float Bal1 = Bal + amount; 
	System.out.println("New Balance is: " + Bal1);
	Bal = Bal1;
}

public void withdraw(float amount) {
	float Bal1 = Bal - amount;
if (Bal1 <= 0)
	System.out.println("Dear " + CustName + " Insufficient fund in Account for withdrawal. Balance Available:" + Bal);
else
	System.out.println("Amount Withdrawed: " + amount + "\n Balance: " + Bal1);
Bal = Bal1; 
}

public void printcust() {
	System.out.println("Customer Name: " + CustName + "\nAccount Number: " + AC + "\nBalance: " + Bal
			+ "\neMail: " + eMail + "\nPhone number" + Phone);
}
}