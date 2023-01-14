import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int A = 0, B = 0;
		
		for (int i = 0; i < str.length(); i++)
			if(str.charAt(i) == 'A') A++;
			else B++;
		System.out.println(A + " : " + B);
	}
}