import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double c = sc.nextDouble();
		while(true) {
			double d = sc.nextDouble();
			if(c == 999 || d == 999) break;
			System.out.printf("%.2f\n", d - c);
			c = d;
		}
	}
}
