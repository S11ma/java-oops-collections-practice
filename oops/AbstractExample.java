abstract class Shape{
	String color="red";
	abstract double area();
	void display(){System.out.println("color=" +color);}
}

class Circle extends Shape{
	double radius=5;
	double area(){return Math.PI *radius *radius;}
}

class Square extends Shape{
	double side=10;
	double area(){return side*side;}
}

public class AbstractExample{
	public static void main(String[] args){
		Shape s= new Circle();
		Shape v= new Square();
		s.display();
		v.display();

		System.out.println("area circle=" +s.area());
		System.out.println("area square=" +v.area());

	}
}