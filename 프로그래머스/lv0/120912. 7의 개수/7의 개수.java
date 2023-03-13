class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
            char[] ch = Integer.toString(array[i]).toCharArray();
            for(int j = 0; j < ch.length; j++)
                if(ch[j] == '7') answer++;
        }
        return answer;
    }
}