import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int[] arr = new int[4];
			for (int i = 0; i < arr.length; i++)
				arr[i] = sc.nextInt();
			
			if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0 && arr[3] == 0) break;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == 0) {
					if(i == 0) arr[0] = arr[3] / (arr[1] * arr[2]);
					if(i == 1) arr[1] = arr[3] / (arr[0] * arr[2]);
					if(i == 2) arr[2] = arr[3] / (arr[0] * arr[1]);
					if(i == 3) arr[3] = arr[0] * arr[1] * arr[2];
				}
			}
			
			for (int i = 0; i < arr.length; i++)
				System.out.print(arr[i] + " ");
			System.out.println();
		}
	}
}
