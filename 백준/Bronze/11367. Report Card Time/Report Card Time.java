import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = {59, 66, 69, 76, 79, 86, 89, 96, 100};
		String[] str = "F,D,D+,C,C+,B,B+,A,A+".split(",");
		for (int i = 0; i < n; i++) {
			System.out.print(sc.next());
			int score = sc.nextInt();
			for (int j = 0; j < arr.length; j++)
				if(arr[j] >= score) {
					System.out.println(" " + str[j]);
					break;
				}
		}
	}
}