class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        
        int count = 0;
        for(int a : arr) {
            if (a % 2 == 0 && a >= 50) answer[count] = a / 2;
            else if (a % 2 != 0 && a < 50) answer[count] = a * 2;
            else answer[count] = a;
            count++;
        }
        return answer;
    }
}