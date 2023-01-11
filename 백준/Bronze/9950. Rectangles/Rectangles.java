import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int[] arr = new int[3];
			for (int i = 0; i < arr.length; i++)
				arr[i] = sc.nextInt();
			
			if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;
			
			for (int i = 0; i < arr.length; i++)
				if(arr[i] == 0)
					if(i == 0) arr[0] = arr[2] / arr[1];
					else if(i == 1) arr[1] = arr[2] / arr[0];
					else arr[2] = arr[0] * arr[1];
			
			for (int i = 0; i < arr.length; i++)
				System.out.print(arr[i] + " ");
			System.out.println();
		}
	}
}
