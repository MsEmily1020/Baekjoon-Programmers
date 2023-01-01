import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			int M = sc.nextInt();
			char ch = sc.next().charAt(0);
			
			switch(ch) {
			case 'C' : 
				char[] chArr = new char[M];
				for(int j = 0; j < chArr.length; j++) {
					chArr[j] = sc.next().charAt(0);
					System.out.print((chArr[j] - 'A' + 1) + " ");
				}
				System.out.println();
				
				break;
			
			case 'N' :
				int[] arr = new int[M];
				for(int j = 0; j < arr.length; j++) {
					arr[j] = sc.nextInt();
					System.out.print((char)(arr[j] + 'A' - 1) + " ");
				}
				System.out.println();
				break;
			}
		}
	}
}