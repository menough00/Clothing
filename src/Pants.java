
public class Pants extends Clothing {

	public Pants(String size, String color) {
		super(size, color);
		
	}

	@Override
	public String wash() {
		
		return "Cold Wash, Like Colors";
	}

	@Override
	public String pack() {
	
		return "Hang";
	}

}
