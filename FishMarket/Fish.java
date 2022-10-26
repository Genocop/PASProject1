public class Fish extends Seafood {
	int fishIndex;
	String fishType;
	double fishWeight, fishPrice;
	
	public Fish(int index, String type, double weight, double price) {
		super(index, type, weight, price);
		this.fishIndex = index;
		this.fishType = type;
		this.fishWeight = weight;
		this.fishPrice = price;
	}
}
