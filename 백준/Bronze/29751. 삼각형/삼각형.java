import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double answer = sc.nextDouble() * sc.nextDouble() / 2;
        System.out.printf("%.1f", answer);
    }
}