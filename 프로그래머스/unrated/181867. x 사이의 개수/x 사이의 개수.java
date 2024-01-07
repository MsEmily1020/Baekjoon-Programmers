import java.util.*;

class Solution {
    public List solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        String[] str = myString.split("x");
        for(int i = 0; i < str.length; i++) answer.add(str[i].length());
        if(myString.charAt(myString.length() - 1) == 'x') answer.add(0);
        return answer;
    }
}