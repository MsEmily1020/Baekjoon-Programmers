import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = "Paper,Printer,Planners,Binders,Calendar,Notebooks,Ink".split(",");
		double[] arr = { 57.99, 120.50, 31.25, 22.50, 10.95, 11.20, 66.95 };
		double sum = 0;
		while(true) {
			String s = sc.next();
			if(s.equals("EOI")) {
				System.out.printf("$%.2f", sum);
				break;
			}
			for (int i = 0; i < str.length; i++)
				if(s.equals(str[i])) sum += arr[i];
		}
	}
}