import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			int ABC = sc.nextInt();
			if(ABC > N) sum += N;
			else sum += ABC;
		}
		
		System.out.println(sum);
	}
}
