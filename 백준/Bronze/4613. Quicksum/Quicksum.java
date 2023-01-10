import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		while(true) {
			String str = sc.nextLine();
			if(str.equals("#")) break;
			char[] chArr = str.toCharArray();
			
			int sum = 0;
			for (int i = 0; i < chArr.length; i++)
				if(chArr[i] != ' ')
					sum += (i + 1) * (chArr[i] - 64);
			
			System.out.println(sum);
		}
	}
}
