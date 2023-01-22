import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt() + sc.nextInt();
		int C = sc.nextInt();
		if(sum >= C * 2) System.out.println(sum - C * 2);
		else System.out.println(sum);
	}
}