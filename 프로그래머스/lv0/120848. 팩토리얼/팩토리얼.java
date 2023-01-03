class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i = 1; i <= n; i++) {
            answer = 1;
            for(int j = 1; j <= i; j++)
                answer *= j;
            if(answer > n) {
                answer = i - 1;
                break;
            }
        }
        
        return answer;
    }
}