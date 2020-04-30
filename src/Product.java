
public class Product {
	private String name;
	private int price;
	
	public Product(String name, int price){	//コンストラクタ
		this.name = name;
		this.price = price;
	}
	
	
	public String getName(){	//名前のgetter
		return this.name;
	}
	
	public int getPrice(){	//価格のgetter
		return this.price;
	}
	
	public void setName(String name){	//名前のsetter
		this.name = name;
	}
	
	public void setPrice(int price){	//価格のsetter
		this.price = price;
	}
}