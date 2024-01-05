import java.util.*;

class Solution {
    public List solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        for (int num : arr) answer.add(num);
        for(int delete : delete_list) if(answer.indexOf(delete) != -1) answer.remove(answer.indexOf(delete));
        return answer;
    }
}