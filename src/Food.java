
public class Food extends Product{
	private String bestBefore;
	
	public Food(String name, int price, String bestBefore){
		super(name, price);
		this.bestBefore = bestBefore;
	}
	
	public String getBB(){
		return this.bestBefore;
	}
	
	public void setBB(String bestBefore){
		this.bestBefore = bestBefore;
	}
}
