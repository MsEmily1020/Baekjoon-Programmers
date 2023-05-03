import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		sc.nextInt();
		char[] ch = sc.next().toCharArray();
		int[] arr = new int[5];
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] == 'H') arr[0]++;
			else if(ch[i] == 'I') arr[1]++;
			else if(ch[i] == 'A') arr[2]++;
			else if(ch[i] == 'R') arr[3]++;
			else if(ch[i] == 'C') arr[4]++;
		}
		
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {			
			if(arr[i] == 0) {
				min = 0;
				break;
			}
			
			if(arr[i] < min) min = arr[i];
		}
		
		System.out.println(min);
	}
}
