package HomeworkFive;

import java.util.HashMap;
import java.util.Map;

public class jobThree {

	public static void main(String[] args) {
		
		String message = "Я полный дебил. Исправлению это не подлежит.";
        String [] words = message.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");
 
        Map<String, Integer> counterMap = new HashMap<>();
        for (String word : words) {
            if(!word.isEmpty()) {
                Integer count = counterMap.get(word);
                if(count == null) {
                    count = 0;
                }
                counterMap.put(word, ++count);
            }
        }
 
        for(String word : counterMap.keySet()) {
            System.out.println(word + ": " + counterMap.get(word));
        }
    }

	}