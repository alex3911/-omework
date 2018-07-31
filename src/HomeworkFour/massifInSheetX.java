package HomeworkFour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class massifInSheetX {
	
	public void massifInSheet  () {
		
		 String [] massif1 = {"Правда ", "же ", "заключалась ", "в ", "том, ", "что ", "я ", "не ", "получил ", "даже ", "среднего ", "образования "};
		 
		 List<String> listOfStrings = new ArrayList<String>();
			listOfStrings = Arrays.asList(massif1);
			System.out.print (listOfStrings);
	}

}
