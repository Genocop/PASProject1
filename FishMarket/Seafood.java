import java.text.DecimalFormat;

public class Seafood extends FishMarket {
	DecimalFormat decimal = new DecimalFormat("0.000");
	public int index;
	public double weight;
	public double pricePound;
	public String type;
	
	public Seafood(int index, String type, double weight, double pricePound) {
		this.index = index;
		this.type = type;
		this.weight = weight;
		this.pricePound = pricePound;
	}

	private String seafoodPrice() {
		return decimal.format(pricePound);
	}

	private String seafoodWeight() {
		return decimal.format(weight);
	}

	private String seafoodType() {
		return type;
	}

	private int seafoodIndex() {
		return index;
	}
	//Override String to output to CSV file correctly
	@Override
	public String toString() {
		return (this.seafoodIndex() + "," + this.seafoodType() + "," + this.seafoodWeight() +
				"," + this.seafoodPrice() + ",");
	}
	
}


