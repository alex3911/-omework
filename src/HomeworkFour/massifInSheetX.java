package HomeworkFour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class massifInSheetX {
	
	public void massifInSheet  () {
		
		 String [] massif1 = {"������ ", "�� ", "����������� ", "� ", "���, ", "��� ", "� ", "�� ", "������� ", "���� ", "�������� ", "����������� "};
		 
		 List<String> listOfStrings = new ArrayList<String>();
			listOfStrings = Arrays.asList(massif1);
			System.out.print (listOfStrings);
	}

}
