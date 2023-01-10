import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] str = "ITMO/SPbSU/SPbSU/ITMO/ITMO/SPbSU/ITMO/ITMO/ITMO/ITMO/ITMO/PetrSU, ITMO/SPbSU/SPbSU/ITMO/ITMO/ITMO/ITMO/SPbSU/ITMO/ITMO/ITMO/ITMO/SPbSU/ITMO".split("/");
		System.out.println(str[sc.nextInt() - 1995]);
	}
}
