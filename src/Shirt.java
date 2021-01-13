
public class Shirt extends Clothing {

	public Shirt(String size, String color) {
		super(size, color);
		
	}

	@Override
	public String wash() {
		
		return "Dry CLean";
	}

}
