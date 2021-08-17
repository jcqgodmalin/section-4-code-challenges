package coding.exercise;

public class AreaCalculator {

	
	public static void main(String[] args) {
		
		System.out.println(area(-1));

	}

	//this method will return an area of a circle
	public static double area(double radius) {
		if(!(radius < 0)) {
			return (radius * radius) * Math.PI;
		}
		return -1.0;
	}
	
	//this method will return an area of a rectangle
	public static double area(double x, double y) {
		if(!((x < 0) || (y < 0))) {
			return x * y;
		}
		return -1.0;
	}
}
