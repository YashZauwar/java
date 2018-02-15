
abstract class Honda {
	abstract void run();
	
}

class Bike extends Honda{
	void run()
	{
		System.out.println("Bike is running");
	}
	public static void main(String[] args)
	{
		Honda A =new Bike();
		A.run();
	}
}