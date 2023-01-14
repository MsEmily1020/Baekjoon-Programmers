import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isEqu = true;
		int N = sc.nextInt();
		char[][] arr = new char[N][N];
		
		for (int i = 0; i < arr.length; i++) {
			String str = sc.next();
			for (int j = 0; j < arr[i].length; j++)
				arr[i][j] = str.charAt(j);
		}
		
		for (int i = 0; i < arr.length; i++) {
			String row = ""; //가로
			String column = ""; //세로
				 
			for (int j = 0; j < arr.length; j++) {
				row += arr[i][j];
				column += arr[j][i];
			}
			
			if(!row.equals(column)) {
				isEqu = false;
				break;
			}
		}
		
		if(isEqu) System.out.println("YES");
		else System.out.println("NO");
		
	}
}