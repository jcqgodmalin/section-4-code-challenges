package coding.exercise;

public class TeenNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasTeen(23,15,42));
	}
	
	public static boolean hasTeen(int x, int y, int z) {
		if((isTeen(x)) || (isTeen(y)) || (isTeen(z))) {
			return true;
		}
		return false;
	}
	public static boolean isTeen(int x) {
		if((x >= 13) && (x <= 19)) {
			return true;
		}
		return false;
	}

}
