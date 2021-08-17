package coding.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodeChum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> arr = new ArrayList<>();
		int userInput;
		int highestEvenInteger = 0;
		do {
			System.out.print("Enter n: ");
			userInput = Integer.parseInt(sc.nextLine());
			arr.add(userInput);
		}while(userInput != 0);
		sc.close();
		for(int i=0;i<arr.size();i++) {
			if((arr.get(i)%2) == 0) {
				if(arr.get(i) > highestEvenInteger) {
					highestEvenInteger = arr.get(i);
				}
			}
		}
		if(highestEvenInteger == 0) {
			System.out.println("No EVEN integer found!");
		}else {
			System.out.println("The highest EVEN number is " + highestEvenInteger);
		}
	}
}
