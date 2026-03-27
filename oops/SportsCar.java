class Car{
	String brand="hero";
	int speed=0;
	void accelerate(int increase){speed+=increase;
	System.out.println(brand+ " now at " +speed);}
}

public class SportsCar extends Car{
	boolean turbo = true;

	void boost(){
		accelerate(30);
		System.out.println("Turbo boosted");
	}

	public static void main(String[] args){
		SportsCar sc = new SportsCar();
		sc.accelerate(50);
		sc.boost();
	}
}
