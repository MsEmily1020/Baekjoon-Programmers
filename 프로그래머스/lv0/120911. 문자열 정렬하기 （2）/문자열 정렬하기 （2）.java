import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        //소문자로 바꾸기
        for(int i = 0; i < my_string.length(); i++)
            if(my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z') answer += (char)(my_string.charAt(i) + 32);
            else answer += (char)my_string.charAt(i);
        
        //정렬하기
        int[] arr = new int[answer.length()];
        for(int i = 0; i < arr.length; i++)
            arr[i] = (int)answer.charAt(i);
        
        Arrays.sort(arr);
        
        //알파벳 출력
        answer = "";
        for(int i = 0; i < arr.length; i++) {
            answer += (char)arr[i];
        }
        return answer;
    }
}