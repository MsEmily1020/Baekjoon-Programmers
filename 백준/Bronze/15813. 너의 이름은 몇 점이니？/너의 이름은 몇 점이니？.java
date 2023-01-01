import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nameLength = sc.nextInt();
		String name = sc.next();
		int sum = 0;
		for(int i = 0; i < name.length(); i++) {
			sum += name.charAt(i) - 'A' + 1;
		}
		
		System.out.println(sum);
	}
}