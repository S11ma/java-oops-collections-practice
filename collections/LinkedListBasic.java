import java.util.*;
public class LinkedListBasic{
	public static void main(String[] args){
		List<String> queue = new LinkedList<>();
		queue.add("first");
		queue.add("second");
		queue.add(1,"inserted");

		System.out.println(queue);
	
	}
}