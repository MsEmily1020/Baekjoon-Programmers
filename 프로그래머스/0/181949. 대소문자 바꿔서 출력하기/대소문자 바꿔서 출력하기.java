import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') answer += (str.charAt(i)+"").toLowerCase();
            else answer += (str.charAt(i)+"").toUpperCase();
        }
        
        System.out.println(answer);
    }
}