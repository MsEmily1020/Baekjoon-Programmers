import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] str = new String[sc.nextInt()];
		String[] answer = new String[str.length];
		String S = sc.next();

		//당첨자의 정답 확인
		String answerS = "";
		int idx = 0; //당첨자 인덱스
		for (int j = 0; j < str.length; j++) {
			str[j] = sc.next();
			answer[j] = sc.next();
			if(str[j].equals(S)) {
				answerS = answer[j];
				idx = j;
			}
		}

		//당첨자이랑 입력 값 동일하면서 먼저 쓴 사람
		int cnt = 0;
		for (int j = 0; j < idx; j++)
			if(answer[j].equals(answerS)) cnt++;
		System.out.println(cnt);
	}
}