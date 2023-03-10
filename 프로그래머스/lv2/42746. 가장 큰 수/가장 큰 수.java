import java.util.Arrays;
import java.util.Comparator;

class Solution {
        public String solution(int[] numbers) {
            String[] str = new String[numbers.length];
            
            for (int i = 0; i < numbers.length; i++) {
                str[i] = String.valueOf(numbers[i]);
            }
            
            Arrays.sort(str, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return (o2 + o1).compareTo(o1 + o2);
                }
            });
            
            String answer = String.join("", str);
            
            if (answer.charAt(0) == '0') return "0";
            
            return answer;
        }
    }