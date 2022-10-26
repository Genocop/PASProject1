public class Shrimp extends Seafood {
	int shrimpIndex;
	String shrimpType;
	double shrimpWeight, shrimpPrice;
	
	public Shrimp(int index, String type, double weight, double price) {
		super(index, type, weight, price);
		this.shrimpIndex = index;
		this.shrimpType = type;
		this.shrimpWeight = weight;
		this.shrimpPrice = price;
	}
}


