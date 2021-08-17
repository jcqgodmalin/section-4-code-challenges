package coding.exercise;

public class MegaBytesConverter {

	public static void main(String[] args) {
		
		printMegaBytesAndKiloBytes(0);

	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if(kiloBytes >= 0) {
			int mb = kiloBytes / 1024;
			int kb = kiloBytes%1024;
			System.out.println(kiloBytes + " KB = " + mb + " MB and " + kb + " KB");
		}else {
			System.out.println("Invalid Value");
		}
	}
}
