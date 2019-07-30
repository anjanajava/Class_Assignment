import java.util.Scanner;

public class SecondJavaProgram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// User input program: Scanner and obj, next for reading input into variable
	
		Scanner unobj = new Scanner (System.in);     // scanner object created
		System.out.println("Enter Username");
		
		String UserName = unobj.nextLine();          // read user input
        
		System.out.println("Username is: " + UserName);     // output user input
 		System.out.println("Super");
 		System.out.println("UserName is:" + UserName + "\n Super");

	/*
		
	Scanner input =new Scanner (System.in);
	
	System.out.println("Enter your first name:");
	String fname = input.next();
	System.out.println("Enter your last name:");
	String lname = input.next();
	System.out.println("\n");
	System.out.println("Hello " + fname +" "+lname);
	*/
	
	}

}
