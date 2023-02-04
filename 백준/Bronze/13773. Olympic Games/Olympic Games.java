import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int year = sc.nextInt();
			if(year == 0) break;
			
			System.out.print(year + " ");
			if(((year >= 1914 && year <= 1918) || (year >= 1939 && year <= 1945)) && (year % 4 == 0))
				System.out.println("Games cancelled");
			else if(year % 4 == 0 && year >= 1896) {
				if(year <= 2020) System.out.println("Summer Olympics");
				else System.out.println("No city yet chosen");
			}
			else System.out.println("No summer games");
		}
	}
}
