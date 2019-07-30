
import java.util.Scanner;

public class CA_lb2kg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double lb = 0;
		double kg = 0;
		lb = 100;
		
		kg = lb/0.45359237;
		System.out.println("When Pounds = " + lb + "\nThen Kilogram equals: " + kg);
		
	//	with user inputs
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of pounds: ");
		lb = input.nextDouble();
		kg = lb/0.45359237;
		System.out.println("When Pounds = " + lb + "\nThen Kilogram equals: " + kg);
	//
		
	}

}
