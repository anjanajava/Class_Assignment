
public class Car {
	String Color = "Red";   
	int doors;
	Boolean moonroof = false;
	int speed;

	public void start () 
	{
		System.out.println("car starting time");   
	}

	public void stop()  // passing a value to method; hence wen method called will show error without value
	{	
		System.out.println("car is stopping"); //  other class: car car1 = new car(); System.out.println(car1.color); car1.stop("Honda Civic"); car1.stop("Honda CRV")
	}
	
	public void accelerate()		// accelerate method can called only within the class; it doesn't appear on other classes
	{
		System.out.println("car is moving");
	}

}

