
public class Food extends Product{
	private String bestBefore;
	
	public Food(String name, int price, String bestBefore){	//コンストラクタ
		super(name, price);
		this.bestBefore = bestBefore;
	}
	
	public String getBB(){	//賞味期限のgetter
		return this.bestBefore;
	}
	
	public void setBB(String bestBefore){	//賞味期限のsetter
		this.bestBefore = bestBefore;
	}
}
