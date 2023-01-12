import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			if(n == -1) break;
			
			//배열의 길이
			int idx = 0;
			for (int i = 1; i < n; i++)
				if(n % i == 0) idx++;
			
			//합계
			int[] arr = new int[idx];
			idx = 0;
			int sum = 0;
			for (int i = 1; i < n; i++)
				if(n % i == 0) {
					arr[idx++] = i; //출력용도
					sum += i;
				}
			
			//출력
			if(sum != n) System.out.println(n + " is NOT perfect.");
			else {
				System.out.print(n + " = ");
				for (int i = 0; i < arr.length; i++)
					if(i != arr.length - 1) System.out.print(arr[i] + " + ");
					else System.out.println(arr[i]);
			}
		}
	}
}