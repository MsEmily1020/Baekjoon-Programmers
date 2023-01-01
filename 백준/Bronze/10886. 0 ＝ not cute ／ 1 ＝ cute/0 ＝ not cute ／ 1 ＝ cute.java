import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[sc.nextInt()];
		
		int[] result = new int[2]; //0과 1 구별
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i] == 0) result[0]++;
			else result[1]++;
		}
		
		if(result[0] > result[1]) System.out.println("Junhee is not cute!");
		else System.out.println("Junhee is cute!");
			
	}
}