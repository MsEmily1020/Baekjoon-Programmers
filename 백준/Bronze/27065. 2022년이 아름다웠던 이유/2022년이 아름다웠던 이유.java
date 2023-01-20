import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			int n = sc.nextInt();
			int sum1 = 0;
			boolean isCollect = true;
			for (int j = 1; j < n; j++) {
				if(n % j == 0) {
					arr.add(j);
					sum1 += j;
				}
			}
			//1. 과잉수이므로 조건 충족
			if(sum1 > n) {
				for (int j = 0; j < arr.size(); j++) {
					int tmp = arr.get(j);
					int sum2 = 0;
					for (int k = 1; k < tmp; k++)
						if(tmp % k == 0) sum2 += k;

					//약수 중 하나라도 과잉수이면 BOJ 2022
					if(sum2 > tmp) {
						isCollect = false;
						break;
					}
				}
				if(isCollect) sb.append("Good Bye").append('\n');
				else sb.append("BOJ 2022").append('\n');
			
			} else sb.append("BOJ 2022").append('\n');
		}

		System.out.println(sb.toString());
	}
}