package coding.exercise;

public class EqualityPrinter {

	public static void main(String[] args) {
		printEqual(1,1,1);
		printEqual(1,1,2);
		printEqual(-1,-1,-1);
		printEqual(1,2,3);
	}
	
	public static void printEqual(int x, int y, int z) {
		if(!( (x < 0) || (y < 0) || (z < 0) )){
			if((x == z) && (x == y) && (y == z)) {
				System.out.println("All numbers are equal");
			} else if((x == z) || (x == y) || (y == z)) {
				System.out.println("Neither all are equal or different");
			} else {
				System.out.println("All numbers are different");
			}
		} else {
			System.out.println("Invalid Value");
		}
	}

}
