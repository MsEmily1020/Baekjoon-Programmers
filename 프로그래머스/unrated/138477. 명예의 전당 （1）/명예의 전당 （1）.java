import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        var arr = new ArrayList<Integer>();
        var answer = new ArrayList<Integer>();
        
        for(int s : score) {
            arr.add(s);
            
            if (arr.size() <= k) {
                Collections.sort(arr);
                answer.add(arr.get(0));
            }
            else {
                int count = 0;
                Collections.sort(arr, Collections.reverseOrder());
                answer.add(arr.get(k - 1));
            }
            System.out.println();
        }
        
        return  answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}