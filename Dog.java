public class Dog extends Animal {
public static void main(String[] args)
{
	Animal dg= new Animal();
	int i= dg.animalage();
	Dog d= new Dog();
	d.bark(i);
	
}
public void bark(int i){

	System.out.println("DOg of age  "  +i+  "   is BOW BOWing");
}
}