import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		
		if(sum >= 100) System.out.println("OK");
		else {
			int min = arr[0];
			for(int i = 1; i < arr.length; i++)
				if(min > arr[i]) min = arr[i];

			if(min == arr[0]) System.out.println("Soongsil");
			else if(min == arr[1]) System.out.println("Korea");
			else System.out.println("Hanyang");
		}
	}
}