class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int num = i; num <= j; num++) {
            char[] ch = String.valueOf(num).toCharArray();
            for(int num1 = 0; num1 < ch.length; num1++)
                if(ch[num1] == Character.forDigit(k, 10)) answer++;
        }
        return answer;
    }
}