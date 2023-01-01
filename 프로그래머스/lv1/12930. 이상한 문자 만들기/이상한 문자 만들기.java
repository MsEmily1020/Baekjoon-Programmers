class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        
        int cnt = 0;
        for(int i = 0; i < str.length; i++) {
            if(str[i].equals(" ")) { cnt = 0; answer += " "; }
            else if(cnt % 2 == 0) {
                answer += str[i].toUpperCase(); cnt++;
            }
            else if(cnt % 2 != 0) { 
                answer += str[i].toLowerCase(); cnt++;
            }
        }
        return answer;
    }
}