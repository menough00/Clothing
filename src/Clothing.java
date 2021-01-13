
public class Clothing {
	private String size; 
	private String color;
	public Clothing(String size, String color) {
		super();
		this.size = size;
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String wash() {
		return "Cold Wash";
	}
	public String pack() {
		return "Fold";
	}
			
}
