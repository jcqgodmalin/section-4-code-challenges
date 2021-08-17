package coding.exercise;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {

	public static void main(String[] args) {
		double[][] sample = {{-3.1756,-3.175},{3.175,3.176},{3.0,3.0},{-3.123,3.123}};
		System.out.println(areEqualByThreeDecimalPlaces(sample[0][0],sample[0][1]));
	}
	
	public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
		DecimalFormat formatter = new DecimalFormat("0.000");
		formatter.setRoundingMode(RoundingMode.DOWN);
		x = Double.parseDouble(formatter.format(x));
		y = Double.parseDouble(formatter.format(y));
		if(x == y) {
			return true;
		}else {
			return false;
		}
	}

}
