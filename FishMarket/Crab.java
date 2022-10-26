public class Crab extends Seafood {
	int crabIndex;
	String crabType;
	double crabWeight, crabPrice;
	
	public Crab(int index, String type, double weight, double price) {
		super(index, type, weight, price);
		this.crabIndex = index;
		this.crabType = type;
		this.crabWeight = weight;
		this.crabPrice = price;
	}
}
