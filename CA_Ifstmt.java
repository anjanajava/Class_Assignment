
public class CA_Ifstmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// If statement
		
		double v1 = 0;
		double v2 = 0;
		
		v1 = 20;
		v2 = 80;
		double T = 0;
		T = (v1+v2)*25;
		System.out.println("The Total value is: " + T);
		double remainder = 0;
		remainder = T%40;
		if (remainder <= 20)
			System.out.println("Total was over the limit");
	//	else System.out.println("Total is within limit");
		
		
	}

}
