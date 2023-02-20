import java.util.Scanner;

public class Main {

    /* Given a value and a checkbit, return "true" if the check bit matches
     * up with the "value", and "false" otherwise. */
    private static boolean solveErrorDetection(int value, int checkbit) {
        boolean valid = false;

        int sum = 0;
		char[] ch = Integer.toBinaryString(value).toCharArray();
		for (int i = 0; i < ch.length; i++)
			if(ch[i] == '1') sum++;

		sum = sum % 2 == 0 ? 0 : 1;
		valid = sum == checkbit ? true : false;

        return valid;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCases = sc.nextInt();

        for(int i = 0; i < numCases; i++) 
        {

            int value = sc.nextInt();

            int checkbit = sc.nextInt();

            if (solveErrorDetection(value, checkbit)) {
                System.out.println("Valid");
            }
            else {
                System.out.println("Corrupt");
            }
        }
    }
}
