
public class Main {

	public static void main(String[] args) {
		Clothing calvin=new Clothing("S","blue");
		System.out.println(calvin.wash());
		Clothing guess=new Jeans("32c32","Stone Washed");
		System.out.println(guess.wash());
		Clothing boss=new Shirt("XL","Black"); 
		System.out.println(boss.wash());
		System.out.println(boss.pack());
	}

}
