import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String answer = "";
        String str = Long.toString(n);
        
        int[] arr = new int[str.length()];
        
        for(int i = 0; i < arr.length; i++)
            arr[i] = str.charAt(i) - '0';
        
        for(int i = 0; i < arr.length - 1; i++)
            for(int j = i + 1; j < arr.length; j++)
                if(arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
        
        for(int i = 0; i < arr.length; i++) answer += arr[i];
        return Long.parseLong(answer);
    }
}