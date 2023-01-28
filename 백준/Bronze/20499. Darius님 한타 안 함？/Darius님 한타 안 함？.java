import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] str = sc.next().split("/");
		if(Integer.parseInt(str[0]) + Integer.parseInt(str[2]) < Integer.parseInt(str[1]) || Integer.parseInt(str[1]) == 0) System.out.println("hasu");
		else System.out.println("gosu");
	}
}