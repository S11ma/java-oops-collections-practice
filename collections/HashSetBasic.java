import java.util.*;

public class HashSetBasic{
	public static void main(String[] args){
		Set<String> uniqueLoans= new HashSet<>();
		uniqueLoans.add("Home");
		uniqueLoans.add("Car");
		uniqueLoans.add("Home");

		System.out.println(uniqueLoans);


	}
}