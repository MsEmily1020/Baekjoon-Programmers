import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double bmi = sc.nextDouble() / Math.pow(sc.nextDouble(), 2);
		if(bmi >= 18.5 && bmi <= 25.0) System.out.println("Normal weight");
		else if(bmi > 25) System.out.println("Overweight");
		else System.out.println("Underweight");
	}
}