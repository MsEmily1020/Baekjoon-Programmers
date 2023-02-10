import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		int f = b - a;
		if(f <= 0) System.out.println("Congratulations, you are within the speed limit!");
		else if(f <= 21) System.out.println("You are speeding and your fine is $100.");
		else if(f <= 30) System.out.println("You are speeding and your fine is $270.");
		else System.out.println("You are speeding and your fine is $500.");
	}
}