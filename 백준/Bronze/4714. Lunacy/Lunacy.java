import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			double x = sc.nextDouble();
			if(x < 0.0) break;
			System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n", x, x * 0.167);
		}
	}
}