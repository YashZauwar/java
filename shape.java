abstract class Shap{
	abstract void draw();
}
class Rectangle extends Shap{
	void draw(){
System.out.println("Drawing Rectangle");
	}
	
}
class Circle extends Shap{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
}
public class shape {
	public static void main(String[] args)

	{
		Shap a = new Circle();
		a.draw();
		Shap b = new Rectangle();
		b.draw();
	}

}
