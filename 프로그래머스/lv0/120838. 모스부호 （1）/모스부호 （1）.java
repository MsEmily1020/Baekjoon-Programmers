class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] str = letter.split(" ");
        String[] op = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(int i = 0; i < str.length; i++)
            for(int j = 0; j < op.length; j++)
                if(str[i].equals(op[j])) answer += (char)(j + 97);
        
        return answer;
    }
}