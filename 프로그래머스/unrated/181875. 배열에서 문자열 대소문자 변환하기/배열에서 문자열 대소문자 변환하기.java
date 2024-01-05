import java.util.*;

class Solution {
    public List solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        for(int i = 0; i < strArr.length; i++) answer.add(i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase());
        return answer;
    }
}