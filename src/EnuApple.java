
public class EnuApple {

	/**
	 * @param args
	 */
	
	enum Apple {
		Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
		private int price; // price of each apple
		// Constructor
		Apple(int p) { price = p; }
		int getPrice() { return price; }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apple ap = Apple.Jonathan;
		
		System.out.println("test :"+Apple.values().toString());
		System.out.println("test :"+ap);
		
		for(Apple a : Apple.values())
			System.out.println(a + " costs " + a.getPrice() +
			" cents.");

	}

}
