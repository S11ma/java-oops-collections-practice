interface Vehicle{
	void start();
	void stop();
}

class Bike implements Vehicle{
	public void start(){System.out.println("bike start");}
	public void stop(){System.out.println("bike stopped");}
}

public class TestVehicle{
	public static void main(String[] args){
		Vehicle v= new Bike();
		v.start();
		v.stop();
	}
}