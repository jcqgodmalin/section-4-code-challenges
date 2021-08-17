package coding.exercise;

public class MinutesToYearsAndDaysCalculator {

	public static void main(String[] args) {

		printYearsAndDays(525600);

	}
	
	public static void printYearsAndDays(long minutes) {
		if(!(minutes < 0)) {
			int year = (int)(minutes / 525600);
			int days = (int)((minutes%525600) / 1440);
			System.out.println(minutes + " min = " + year + " y and " + days + " d");
		}else {
			System.out.println("Invalid Value");
		}
	}

}
