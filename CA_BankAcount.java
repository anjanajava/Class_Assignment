
public class CA_BankAcount {
int AC = 123456789;
float Bal = 50.0f;
String CustName = "Anjana";
String eMail = "anjanat.java@gmail.com";
String Phone = "(925) 587-3912";

public void deposit(int funds) {
	float Bal1 = Bal + funds; 
	System.out.println("New Balance is: " + Bal1);
	Bal = Bal1;
}

public void withdraw(int funds) {
	float Bal1 = Bal - funds;
if (Bal1 <= 0)
	System.out.println("Dear " + CustName + " Insufficient fund in Account for withdrawal. Balance Available:" + Bal);
else
	System.out.println("Amount Withdrawed: " + funds + "\n Balance: " + Bal1);
Bal = Bal1; 
}

public void printcust() {
	System.out.println("Customer Name: " + CustName + "\nAccount Number: " + AC + "\nBalance: " + Bal
			+ "\neMail: " + eMail + "\nPhone number" + Phone);
}
}