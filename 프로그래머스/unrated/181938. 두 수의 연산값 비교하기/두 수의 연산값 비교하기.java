class Solution {
    public int solution(int a, int b) {
        int answer1 = Integer.parseInt(a + "" + b), answer2 = 2 * a * b;
        return answer1 > answer2 ? answer1 : answer1 == answer2 ? answer1 : answer2;
    }
}