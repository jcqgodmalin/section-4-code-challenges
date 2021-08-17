package coding.exercise;

public class SpeedConverter {

	public static void main(String[] args) {
		
		printConversion(0.0);
		
	}
	
	public static long toMilesPerHour(double kilometersPerHour) {
		
		if(!(kilometersPerHour < 0)) {
			long res;
			res = (long)(Math.round(kilometersPerHour / 1.609));
			return res;
		}
		
		return -1;
	}
	
	public static void printConversion(double kilometersPerHour) {
		long mph = toMilesPerHour(kilometersPerHour);
		if(mph > -1) {
			System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h");			
		}else {
			System.out.println("Invalid Value");
		}
	}
	
}
