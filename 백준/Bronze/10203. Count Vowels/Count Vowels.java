import java.util.*;

public class Main {

    private static int countVowels(String s) {
        int c = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
				c++;
		}
        return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numCases = sc.nextInt();

		for(int i = 0; i < numCases; i++)
		{
			String s = sc.next();
            System.out.println("The number of vowels in " + s + " is " + countVowels(s) + ".");
		}
		
		sc.close();
	}
}
