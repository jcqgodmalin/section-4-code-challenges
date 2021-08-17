package coding.exercise;

public class LeapYear {

	public static void main(String[] args) {
		int[] samples = {-1600,1600,2017,2000};
		
		for(int year:samples) {
			System.out.println(isLeapYear(year));
		}
	}
	
	public static boolean isLeapYear(int year) {
		if((year >= 1) && (year <= 9999)) {
			if((year%4) == 0) {
				if((year%100) == 0) {
					if((year%400) == 0) {
						return true;
					}else {
						return false;
					}
				}else {
					return true;
				}
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

}
