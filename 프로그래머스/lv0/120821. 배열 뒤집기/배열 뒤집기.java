class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for(int i = answer.length - 1; i >= 0; i--)
            answer[answer.length - i - 1] = num_list[i];
        return answer;
    }
}