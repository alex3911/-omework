package HomeworkFour;


import java.util.LinkedHashSet;

public class JobFour {

	public static void main(String[] args) {
		
		LinkedHashSet <String> Set1 = new LinkedHashSet<>();
		
		Set1.add("1");
		Set1.add("2");
		Set1.add("3");
		Set1.add("5");
		Set1.add("7");
		Set1.add("8");
		
		System.out.println (Set1);
		
		LinkedHashSet <String> Set2 = new LinkedHashSet<>();
		
		Set2.add("1");
		Set2.add("6");
		Set2.add("9");
		Set2.add("14");
		Set2.add("3");
		Set2.add("7");
		
		System.out.println (Set2);
		
			
		union (Set1, Set2);
		
		intersect ( Set1,  Set2);
	}


	private static void union (LinkedHashSet <String> Set1, LinkedHashSet <String> Set2) {
		
		LinkedHashSet <String> Set3 = new LinkedHashSet<>();
		
		Set3.addAll(Set1);
		Set3.addAll(Set2);
		System.out.println (Set3);
				
	}
	
	private static void intersect(LinkedHashSet<String> Set1, LinkedHashSet<String> Set2) {
		
		
		Set1.retainAll(Set2);
		System.out.println (Set1);
		
	}
	
}
