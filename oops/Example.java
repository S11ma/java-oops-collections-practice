/*Build a Shape hierarchy: Circle, Rectangle, Triangle with area() and perimeter() using polymorphism. No switch statements allowed.	*/

abstract class Shape{
	abstract double area();
	abstract double peri();
}

class Circle extends Shape{
	double r=10;
	double area(){return Math.PI *r *r;}
	double peri(){return 2* Math.PI *r;}
}
class Rectangle extends Shape{
	double l=10; double b=12;
	double area(){return l*b;}
	double peri(){return 2*(l+b);}
	
}
class Triangle extends Shape{
	float h=9; float base=10;
	float s=12;
	double area(){return 0.5*base*h;}
	double peri(){return 3*s; }
}

class Example{
	public static void main(String[] args){
		Shape c=new Circle();
		System.out.println("circle= " +c.area());
		System.out.println("circle= " +c.peri());

		Shape r=new Rectangle();
		System.out.println("Rectangle: " +r.area());
		System.out.println("Rectangle: " +r.peri());

		Shape t=new Triangle();
		System.out.println("Triangle: " +t.area());
		System.out.println("Triangle: " +t.peri());



	}
}