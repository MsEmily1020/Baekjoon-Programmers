import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int l = sc.nextInt(), r = sc.nextInt();
		int min = Math.abs(x - l), idx = l;
		for (int i = l + 1; i <= r; i++)
			if(min > Math.abs(x - i)) {
				min = Math.abs(x - i);
				idx = i;
			}
		System.out.println(idx);
	}
}