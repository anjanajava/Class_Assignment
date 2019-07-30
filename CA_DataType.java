
public class CA_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Create a int variable and set it to 500
		int v1 = 500;
		 
		//2. Create a short variable and set it to 10.
				short v2 = 10;
				
		//3. Create a byte variable and set it to 30.
		   byte v3 = 30;
		   
		   
	    //4. Create a variable of type long, and make it equal to 70000 + 
		   // 15 times the int value then plus the short plus the byte variables
		   // long = 70000+(15*int)+short+byte
		   long v4 = 0;
		   v4 = 70000 + (15*v1) + v2 + v3;
		   
		//5. Print the value of long variable
		   System.out.println("The value of long variable is: " + v4);

	}

}
