import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[8];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		
		int[] clone = arr.clone(); //정렬 전
		Arrays.sort(arr); //정렬 후
		
		int[] idx = new int[5]; //문제 번호
		int cnt = 0, sum = 0;
		for (int i = arr.length - 1; i >= 3; i--)
			for(int j = 0; j < clone.length; j++)
				if(arr[i] == clone[j]) {
					sum += arr[i]; //가장 높은 점수 5개의 합
					idx[cnt++] = j + 1; //가장 높은 점수의 문제 번호
				}
		
		Arrays.sort(idx); //문제 번호 정렬
		
		System.out.println(sum);
		for (int i = 0; i < idx.length; i++)
			System.out.print(idx[i] + " ");
	}
}