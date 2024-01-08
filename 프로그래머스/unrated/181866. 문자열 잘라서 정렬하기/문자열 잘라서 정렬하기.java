import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] str = myString.split("x");
        String[] answer = Arrays.stream(str)
                                .filter(s -> !s.isEmpty())
                                .sorted()
                                .toArray(String[]::new);
        return answer;
    }
}