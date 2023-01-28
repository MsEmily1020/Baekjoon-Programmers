import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt(), l = sc.nextInt(), h = sc.nextInt();
		boolean isRoom = true;
		
		if(Math.min(w, l) / h < 2) isRoom = false;
		if(Math.min(w, l) / Math.max(w, l) > 2) isRoom = false;
		
		if(isRoom) System.out.println("good");
		else System.out.println("bad");
	}
}