import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			int n = 0;
			n += Math.pow(str.charAt(i) - '0', 5);
			sum += n;
		}
		
		System.out.println(sum);
	}
}