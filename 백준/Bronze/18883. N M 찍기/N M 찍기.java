import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();

        StringBuffer sb = new StringBuffer();
        for(int i = 1; i <= N * M; i++) {
        	sb.append(i);
        	if(i % M == 0) sb.append("\n");
        	else sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}