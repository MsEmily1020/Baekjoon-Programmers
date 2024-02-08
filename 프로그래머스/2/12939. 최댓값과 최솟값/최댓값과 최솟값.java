class Solution {
    public String solution(String s) {
        String[] answer = s.split(" ");
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(String num : answer) {
            min = Math.min(Integer.parseInt(num), min);
            max = Math.max(Integer.parseInt(num), max);
        }
        return min + " " + max;
    }
}