import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
    	Scanner sc = new Scanner(System.in);
    	
    	String mbti = sc.next();
    	String[] N = new String[sc.nextInt()];
    	
    	int cnt = 0;
    	for(int i = 0; i < N.length; i++) {
    		N[i] = sc.next();
    		if(N[i].equals(mbti)) cnt++;
    	}
    	
    	System.out.println(cnt);
    }
}