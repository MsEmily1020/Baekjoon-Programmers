import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[50];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		
		int score = sc.nextInt();
		for (int i = 0; i < arr.length; i++)
			if(arr[i] == score) {
				score = i + 1;
				break;
			}
		
		if(score <= 5) System.out.println("A+");
		else if(score <= 15) System.out.println("A0");
		else if(score <= 30) System.out.println("B+");
		else if(score <= 35) System.out.println("B0");
		else if(score <= 45) System.out.println("C+");
		else if(score <= 48) System.out.println("C0");
		else System.out.println("F");
	}
}
