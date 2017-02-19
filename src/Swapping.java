//  swaps the values of two variables without using third variable
public class Swapping {

	public static void main(String[] args) {
		// Initializing value
		int a = 4;
		int b = 3;
		System.out.println("befor swaping\na=" + a + "\nb=" + b);
		// performing operation
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swaping\na=" + a + "\nb=" + b);

	}

}
