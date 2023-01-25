import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[2];
		for (int i = 0; i < 3; i++) arr[sc.nextInt() - 1]++;
		if(Math.max(arr[0], arr[1]) == arr[0]) System.out.println("1");
		else System.out.println("2");
	}
}