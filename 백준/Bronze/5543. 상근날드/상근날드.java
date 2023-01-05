import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min = sc.nextInt();
		for (int i = 0; i < 2; i++) {
			int burger = sc.nextInt();
			if(min > burger) min = burger;
		}
		System.out.println(min + Math.min(sc.nextInt(), sc.nextInt()) - 50);
	}
}