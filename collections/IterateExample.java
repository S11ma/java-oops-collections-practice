import java.util.*;

public class InterateExample{
	public static void main(String[] args){
	
		List<String> = new ArrayList<>(Array.asList("A","B","C"));

		for(String a:list){System.out.println(s + " ");}
		System.out.println();

		Iterator<String> it= list.iterator();
		while(it.hasNext())
		{
			if(it.next().equals("B")) it.remove();
		}

		System.out.println(list);

		Map<String, Integer> map=new hashmap<>();
		map.put("X",10);
		map.put("y",20);
		for(Map.Entry<String,Insteger> e : map.entrySet())
		{
			 System.out.println(e.getKey() + "=" e.getValue());	}
	}	
}	
		
























}

	}
}