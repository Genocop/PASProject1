public class Scallop extends Seafood {
	int scallopIndex;
	String scallopType;
	double scallopWeight, scallopPrice;
	
	public Scallop(int index, String type, double weight, double price) {
		super(index, type, weight, price);
		this.scallopIndex = index;
		this.scallopType = type;
		this.scallopWeight = weight;
		this.scallopPrice = price;
	}
}


