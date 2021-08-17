package coding.exercise;

public class BarkingDog {

	public static void main(String[] args) {
		
		System.out.println(shouldWakeUp(true, 8));
	}
	
	public static boolean shouldWakeUp(boolean barking,int hourOfDay) {
		if(hourOfDay >= 0 && hourOfDay < 24) {
			if((hourOfDay < 8) || (hourOfDay > 22)) {
				if(barking) {
					return true;
				}else {
					return false;
				}
			}
			return false;
		}
		return false;
	}

}
