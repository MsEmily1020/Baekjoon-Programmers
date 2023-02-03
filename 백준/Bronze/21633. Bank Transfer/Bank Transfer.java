import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double k = 25 + sc.nextInt() * 0.01;
		if(k <= 100) System.out.println("100.00");
		else if(k >= 2000) System.out.println("2000.00");
		else System.out.printf("%.2f", k);
	}
}
