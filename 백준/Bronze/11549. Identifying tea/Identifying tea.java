import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int T = sc.nextInt();
       int[] arr = new int[5];
       
       int cnt = 0;
       for(int i = 0; i < arr.length; i++) {
    	   arr[i] = sc.nextInt();
    	   if(arr[i] == T) cnt++;
       }
       System.out.println(cnt);
    }
}