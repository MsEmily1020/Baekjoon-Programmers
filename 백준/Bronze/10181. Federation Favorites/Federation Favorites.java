import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == -1) break;
			
			int sum = 0, cnt = 0;
			for (int i = 1; i < n; i++)
				if(n % i == 0) {
					sum += i;
					cnt++; //배열 크기 변수
				}
			
			if(sum != n) System.out.println(n + " is NOT perfect.");
			else {
				//배열 생성
				int[] arr = new int[cnt];
				cnt = 0;
				for (int i = 1; i < n; i++)
					if(n % i == 0) arr[cnt++] = i;
				
				//출력
				System.out.print(n + " = ");
				for (int i = 0; i < arr.length; i++) {
					if(i == arr.length - 1) System.out.print(arr[i]);
					else System.out.print(arr[i] + " + ");
				}
				System.out.println();
			}
		}
	}
}