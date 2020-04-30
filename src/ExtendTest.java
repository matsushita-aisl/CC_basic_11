
public class ExtendTest {

	public static void main(String[] args) {
		Food food = new Food("Banana", 350, "2011/1/1");
		
		System.out.println("name:\t\t" + food.getName());
		System.out.println("price:\t\t" + food.getPrice());
		System.out.println("bestBefore:\t" + food.getBB());
		
		System.out.println("********Status is changed********");
		
		food.setName("Apple");
		food.setPrice(200);
		food.setBB("2020/5/1");
		
		System.out.println("name:\t\t" + food.getName());
		System.out.println("price:\t\t" + food.getPrice());
		System.out.println("bestBefore:\t" + food.getBB());
	}

}
