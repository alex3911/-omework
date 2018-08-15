package HomeworkFive.MyServ;

@MyAnnotation(v = 1)
public class MyService {

	private String catName = "Name";
	private int catWeight = 0;
	
	private String catVote1 = " от м€укает";
	private String catVote2 = catVote1;
	
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public int getCatWeight() {
		return catWeight;
	}
	public void setCatWeight(int catWeight) {
		this.catWeight = catWeight;
	}
	public String getCatVote2() {
		return catVote2;
	}
	public void setCatVote2(String catVote2) {
		this.catVote2 = catVote2;
	}

	public void equals () {
		boolean catV;
		catV = catVote1.equals(catVote2);
		System.out.println (catV);

		}
	
	public void hCode (String catVote1) {
		int hC;
		hC = catVote1.hashCode();
		System.out.println (hC);
		}
	
	public void thisClassInfo (String catName, int catWeight, String catVote1) {
		System.out.println (catName + " " + catWeight +" " + catVote1);
	}
		
}
