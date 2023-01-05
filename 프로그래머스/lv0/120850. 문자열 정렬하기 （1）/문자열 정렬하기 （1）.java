import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        int cnt = 0;
        for(int i = 0; i < my_string.length(); i++)
            if(my_string.charAt(i) - '0' >= 0 && my_string.charAt(i) - '0' <= 9)  cnt++;
        
        answer = new int[cnt];
        cnt = 0;
        
        for(int i = 0; i < my_string.length(); i++)
            if(my_string.charAt(i) - '0' >= 0 && my_string.charAt(i) - '0' <= 9)  answer[cnt++] = my_string.charAt(i) - '0';
        
        Arrays.sort(answer);
        
        return answer;
    }
}