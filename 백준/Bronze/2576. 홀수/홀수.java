import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < 7; i++) {
			int n = sc.nextInt();
			if(n % 2 != 0) arr.add(n);
		}
		
		if(arr.size() == 0) System.out.println(-1);
		else {
			int sum = 0, min = arr.get(0);
			for (int i = 0; i < arr.size(); i++) {
				sum += arr.get(i);
				if(min > arr.get(i)) min = arr.get(i);
			}
			System.out.println(sum + "\n" + min);
		}
	}
}
