import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A1 = sc.nextDouble(), P1 = sc.nextDouble(), R1 = sc.nextDouble(), P2 = sc.nextDouble();
		if(A1 / P1 > R1 * R1 * Math.PI / P2) System.out.println("Slice of pizza");
		else System.out.println("Whole pizza");
	}
}