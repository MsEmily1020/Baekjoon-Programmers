class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++)
            answer[i] = arr[i] + ((arr.length % 2 != i % 2) ? n : 0);
        
        return answer;
    }
}