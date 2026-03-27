import java.util.*;

public class Color {
    public static void main(String[] args) {

        int countR = 0, countG = 0, countB = 0;
        List<String> colorN = new ArrayList<>();
        colorN.add("red");
        colorN.add("blue");
        colorN.add("red");
        colorN.add("green");
        colorN.add("blue");

        System.out.println("All colors = " + colorN);
        
	for (String color : colorN) {
            if (color.equals("red")) {
                countR++;
            } else if (color.equals("blue")) {
                countB++;
            } else if (color.equals("green")) {
                countG++;
            }
        }
	for(Map.Entry<String, Integer> entry: colorC.entrySet()){
		System.out.println(entry.getKey() + " "+entry.getValue());
	}



        Map<String, Integer> colorC = new HashMap<>();
        colorC.put("Red", countR);
        colorC.put("Blue", countB);
        colorC.put("Green", countG);

        System.out.println("Color Counts:");
        System.out.println(colorC);

        System.out.println("\nFinal Count Summary:");
        System.out.println("Red   : " + countR);
        System.out.println("Blue  : " + countB);
        System.out.println("Green : " + countG);
    }
}