class Solution {
    public int solution(int a, int b) {
        if(a % 2 == b % 2) return a % 2 == 1 ? a * a + b * b : Math.abs(a - b);
        else return 2 * (a + b);
    }
}