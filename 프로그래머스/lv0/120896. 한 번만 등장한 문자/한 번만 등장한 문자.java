class Solution {
    public String solution(String s) {
        String answer = "";
        int[] arr = new int[26];
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; i++) arr[ch[i] - 'a']++;
        
        for(int i = 0; i < arr.length; i++)
            if(arr[i] == 1) answer += (char)(i + 'a');
                
        return answer;
    }
}