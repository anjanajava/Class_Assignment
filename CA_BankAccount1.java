// Private variables, Getter and Setter 


public class CA_BankAccount1 {
	private int AC = 0;
	private float Bal = 0.0f;
	private String CustName = "John";
	private String eMail = "jhxxxxon@gmail.com";
	private String Phone = "(xxx) xxx-xxxx";
	int check= 21;
	
	public int getAC() { return (AC);}
	public void setAC(int newAC) { this.AC= newAC; }
	
	public float getBal() { return (Bal);}
	// public float getBal1(float newAC) {/* with db AC = newAC; */ return (Bal);};
	public void setBal(float newBal) { this.Bal = newBal;}
	
	
	public String getCustName() { return (CustName);}
	public void setCustName(String newCustName) {this.CustName= newCustName;}

//	public String eM
	
/*	
	public CA_BankAccount1() {
		this.AC = 123456789;	
		this.Bal = 50.0f;
		this.CustName = "Anjana";
		this.eMail = "anjanat.java@gmail.com";
		this.Phone = "(925) 587-3912";
	}
*/
	/*
	public void CA_BankAccount1(AC) {
		to use account number as primary key to access db.
	}
	*/

	public void deposit(float amount) {
		float Bal1 = Bal + amount; 
		// System.out.println("New Balance is: " + Bal1);
		Bal = Bal1;
	}

	public void withdraw(float amount) {
		float Bal1 = Bal - amount;
	if (Bal1 <= 0)
		System.out.println("Dear " + CustName + " Insufficient fund in Account for withdrawal. Balance Available:" + Bal);
	else
		// System.out.println("Amount Withdrawed: " + amount + "\n Balance: " + Bal1);
	Bal = Bal1; 
	}

	public void printcust() {
		System.out.println("Customer Name: " + CustName + "\nAccount Number: " + AC + "\nBalance: " + Bal
				+ "\neMail: " + eMail + "\nPhone number" + Phone);
	}
	}
