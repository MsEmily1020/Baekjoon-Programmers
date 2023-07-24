import java.util.*;
import java.util.stream.Stream;

class Solution {
    public int solution(String num_str) {
        return num_str.chars().map(c -> c - 48).sum();
    }
}