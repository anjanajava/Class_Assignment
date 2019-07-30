import java.util.Scanner;

public class ThirdJavaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Calculator: Arithmetic operations between 2 numbers (user inputs)
		
		Scanner input = new Scanner(System.in);   // create scanner object "input"
		
		System.out.println("Enter first number:");
		int fnum = input.nextInt();  //read user input (nextInt) and assign to variable (fnum)
		System.out.println("Enter second number");
		int snum = input.nextInt();
		int pgmadd = 0;
		pgmadd = fnum+snum;
		System.out.println("The sum of " + fnum + " and " + snum + " is: " + pgmadd);
		int pgmmult =0;
		pgmmult = fnum*snum;
		System.out.println("The product of " + fnum + " and " + snum + " is: " + pgmmult);
		
		double pgmdiv =0.0000d;  //division cannot return correct decimal values
		pgmdiv = (double)(fnum/snum);
		System.out.println("The division of " + fnum + " and " + snum + " is: " + pgmdiv);
		
		int pgmmod =0;
		pgmmod = fnum%snum;
		System.out.println("The modulo of " + fnum + " and " + snum + " is: " + pgmmod);
		/*
		int pgmpow =0;      // no power operator
		pgmpow = fnum^snum;
		System.out.println("The power of " + fnum + " and " + snum + " is: " + pgmpow);
		*/
		
	}

}
