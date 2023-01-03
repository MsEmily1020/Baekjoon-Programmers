import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		for (int i = 0; i < 3; i++)
			sum += sc.nextInt() * (i + 1);
		if(sum >= 10) System.out.println("happy");
		else System.out.println("sad");
	}
}
