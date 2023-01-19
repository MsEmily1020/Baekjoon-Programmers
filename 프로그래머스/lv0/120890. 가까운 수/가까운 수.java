import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        
        int min = Integer.MAX_VALUE;
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
            int abs = Math.abs(array[i] - n);
            if(abs < min) {
                min = abs;
                answer = array[i];
            }
        }
        return answer;
    }
}