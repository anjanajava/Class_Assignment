// Private Variables, Getters and Setters for Bank Account Assignment


//import java.util.Scanner;
public class CA_SecuredBA {
	// Private variables, Getter and Setter 
		private int AC = 0;
		private float Bal = 0.0f;
		private String CustName = "John";
		private String eMail = "jhxxxxon@gmail.com";
		private String Phone = "(xxx) xxx-xxxx";
		int check= 21;
		
		public int getAC() { return (AC);}
		public void setAC(int newAC) { this.AC= newAC; }
		
		public float getBal() { return (Bal);}
		// public float getBal1(float newAC) {/* with db AC = newAC; */ return (Bal);}; ??
		public void setBal(float newBal) { this.Bal = newBal;}
		
		
		public String getCustName() { return (CustName);}
		public void setCustName(String newCustName) {this.CustName= newCustName;}


		public CA_SecuredBA() {
			this.AC = 123456789;	
			this.Bal = 50.0f;
			this.CustName = "Anjana";
			this.eMail = "anjanat.java@gmail.com";
			this.Phone = "(925) 587-3912";
		}
		
		/*
		public void CA_SecuredBA(AC) {
			to use account number as primary key to access db. ??
		}
		*/
		
		float Bal1= 0.0f;
		
		public void deposit(float amount) {
			
			if (amount >= 50.0)
				{System.out.println("Maximum deposit amount per transaction is $50.0");}  // Business Rule
			else {Bal1 = Bal + amount; 
			// System.out.println("New Balance is: " + Bal1);
			Bal = Bal1;}
		}

		public void withdraw(float amount) {
			Bal1 = Bal - amount;
		if (Bal1 <= 0)
			System.out.println("Dear " + CustName + " Insufficient fund in Account for withdrawal. Balance Available:" + Bal);
		else
			// System.out.println("Amount Withdrawn: " + amount + "\n Balance: " + Bal1);
		Bal = Bal1; 
		}

		public void printcust() {
			System.out.println("Customer Name: " + CustName + "\nAccount Number: " + AC + "\nBalance: " + Bal
					+ "\neMail: " + eMail + "\nPhone number" + Phone);
		}
		}
