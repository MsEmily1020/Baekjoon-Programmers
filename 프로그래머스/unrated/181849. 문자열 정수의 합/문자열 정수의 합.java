import java.util.*;
import java.util.stream.Stream;

class Solution {
    public int solution(String num_str) {
        int[] num = Stream.of(num_str.split("")).mapToInt(Integer::parseInt).toArray();

        return Arrays.stream(num).sum();
    }
}