package coding.exercise;


/*
 * 
 * Author: Jhon Godmalin
 * Email: jhon.c.godmalin@accenture.com
 * Date: August 17, 2021
 * Purpose: Made this code from the Java Programming Masterclass Challenge.
 * Note: I did not follow the code from the video. This works. I'm out. 
 * 
 */


public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%.3f",calcFeetAndInchesToCentimeters(157));
	}

	public static double calcFeetAndInchesToCentimeters(double feet,double inches) {
		if((feet >= 0) && ((inches >= 0) && (inches <= 12))){
			return 2.54 * ((12 * feet) + inches);
		}
		return -1;
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches >= 0) {
			int feet = (int)(inches / 12);
			int remInch = (int)(inches%12);
			return calcFeetAndInchesToCentimeters(feet, remInch);
		}
		return -1;
	}
}
