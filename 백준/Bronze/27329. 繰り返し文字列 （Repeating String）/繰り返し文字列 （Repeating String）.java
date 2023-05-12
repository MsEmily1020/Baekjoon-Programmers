import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        br.readLine();
        String str = br.readLine();
        String answer1 = str.substring(0, str.length() / 2);
        String answer2 = str.substring(str.length() / 2);

        System.out.println(answer1.equals(answer2) ? "Yes" : "No");
    }
}