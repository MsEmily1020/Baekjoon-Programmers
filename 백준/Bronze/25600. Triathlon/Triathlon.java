import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] N = new int[sc.nextInt()][4]; //[][3]은 합계방
		for (int i = 0; i < N.length; i++) {
			for (int j = 0; j < N[i].length - 1; j++)
				N[i][j] = sc.nextInt();
			
			N[i][3] = N[i][0] * (N[i][1] + N[i][2]);
			if(N[i][0] == N[i][1] + N[i][2]) N[i][3] *= 2;
		}
		
		int max = N[0][3];
		for (int i = 1; i < N.length; i++)
			if(max < N[i][3]) max = N[i][3];
		
		System.out.println(max);
	}
}