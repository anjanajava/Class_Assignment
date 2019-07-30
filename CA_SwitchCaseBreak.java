import java.util.Scanner;


public class CA_SwitchCaseBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Create a char variable for switch statement
   char v;
   String ip; //= new String("A");
   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter an Alphabet in Caps: ");
   ip = input.next();
   v = ip.charAt(0);
   
   System.out.println("The Alphabet entered: " + v);
   
   
   
   switch (v) {
   case 'A':
	   System.out.println("Apple");
	   break;
   case 'B':
	   System.out.println("Banana");
	   break;
   case 'C':
	   System.out.println("Cherries");
	   break;
   case 'D':
	   System.out.println("Dragon Fruit");
	   break;
   case 'E':
	   System.out.println("ElderBerry");
	   break;
   default:
	   System.out.println("Not in fruit basket");
	   break;
   }
	   
		
		
	}

}
