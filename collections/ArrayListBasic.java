import java.util.*;

public class ArrayListBasic{
	public static void main(String[] args){
		List<String> loan= new ArrayList<>();
		loan.add("Home");
		loan.add("Car");
		loan.add("Home");

		System.out.println(loan);
		System.out.println(loan.get(0));

	}

}