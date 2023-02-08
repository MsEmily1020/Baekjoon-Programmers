import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			char[] ch1 = sc.next().toCharArray();
			char[] ch2 = sc.next().toCharArray();
			int sum = 0;
			for (int j = 0; j < ch1.length; j++)
				if(ch1[j] != ch2[j]) sum++;
			System.out.println("Hamming distance is " + sum + ".");
		}
	}
}