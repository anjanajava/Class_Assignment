


public class Cars {

	// Always have declare variables whether public/ protected/ private (to know and avoid security issues)
	String Color = "Red";   
	int doors;
	Boolean moonroof = false;
	int speed;

	public void start () 
	{
		System.out.println("car starting");
		this.accelerate(5);
	}
	
	public void stop(String carName)  // passing a value to method; hence wen method called will show error without value
	{
		System.out.println(carName + " is stopping"); //  other class: car car1 = new car(); System.out.println(car1.color); car1.stop("Honda Civic"); car1.stop("Honda CRV")
	}
	
	private void accelerate(int speed)		// accelerate method can called only within the class; it doesn't appear on other classes
	{
		System.out.println("car is moving @ speed" + speed);
	}
	public void Cars(String Name) // "Cars" constructor with same name as class; start setting values (initializing) by default
	{
		System.out.println("car object is created!" + Name);
	}
	
	
}