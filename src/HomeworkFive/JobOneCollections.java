package HomeworkFive;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class JobOneCollections {

	public static void main(String[] args) {
	
		Collection<Object> list = new LinkedList<>();
		long b1 = System.nanoTime();
	
		for (int i=0; i <=1000000;i++)
		{
		list.add(new Integer(i));
		}
		long a1 = System.nanoTime();
		long c1 = (a1 - b1)/1000000000;
	//	System.out.println(c1 + " sec");
	//	System.out.println("***");
		
		Collection<Object> ArList = new ArrayList<>();
		long b2 = System.nanoTime();
		for (int i=0; i <=100000;i++)
		{
			ArList.add(new Integer(i));
		}
		long a2 = System.nanoTime();
		long c2 = (a2 - b2)/1000000000;
	//	System.out.println(c2 + " sec");
	//	System.out.println("***");

		
		Collection<Object> TrSet = new TreeSet<>();
		long b3 = System.nanoTime();
		for (int i=0; i <=1000000;i++)
		{
			TrSet.add(new Integer(i));
		}
		long a3 = System.nanoTime();
		long c3 = (a3 - b3)/1000000000;
	//	System.out.println(c3 + " sec");
	//	System.out.println("***");
		
		Collection<Object> HaSet = new HashSet<>();
		long b4 = System.nanoTime();
		for (int i=0; i <=1000000;i++)
		{
			HaSet.add(new Integer(i));
		}
		long a4 = System.nanoTime();
		long c4 = (a4 - b4)/1000000000;
	//	System.out.println(c4 + " sec");
	//	System.out.println("***");
		
		
		
		HashMap<Long, Collection<Object>> listMap = new HashMap<>();
		listMap.put(c1, list);
		
		HashMap<Long, Collection<Object>> ArMap = new HashMap<>();
		ArMap.put(c2, ArList);
		
		HashMap<Long, Collection<Object>> TrMap = new HashMap<>();
		TrMap.put(c3, TrSet);
		
		HashMap<Long, Collection<Object>> HaMap = new HashMap<>();
		HaMap.put(c4, HaSet);
		
	}

}
