class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] arr = s.toCharArray();
        
        int cntP = 0, cntS = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 'P' || arr[i] == 'p') cntP++;
            else if(arr[i] == 'Y' || arr[i] == 'y') cntS++;
        }
        
        if(cntP != cntS) answer = false;
        
        return answer;
    }
}