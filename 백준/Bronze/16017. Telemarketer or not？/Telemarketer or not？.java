import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isPattern = true; //true : 스팸o
		
		//the first of these four digits is an 8 or 9
		int a = sc.nextInt();
		if(!(a == 8 || a == 9)) isPattern = false;
		
		//the second and third digits are the same.
		if(!(sc.nextInt() == sc.nextInt())) isPattern = false;
		
		//the last digit is an 8 or 9;
		a = sc.nextInt();
		if(!(a == 8 || a == 9)) isPattern = false;
		
		if(isPattern) System.out.println("ignore");
		else System.out.println("answer");
	}
}