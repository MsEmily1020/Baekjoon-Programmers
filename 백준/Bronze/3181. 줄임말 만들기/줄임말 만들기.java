import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		String[] remove = "i,pa,te,ni,niti,a,ali,nego,no,ili".split(",");
		String answer = "";
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < remove.length; j++) {
				if(str[i].equals(remove[j]) && i != 0) break;
				if(j == remove.length - 1) answer += str[i].toUpperCase().charAt(0);
			}
		}
		System.out.println(answer);
	}
}