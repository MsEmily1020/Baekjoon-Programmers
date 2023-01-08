import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        String[] str1 = new String[before.length()];
        String[] str2 = new String[after.length()];
        
        for(int i = 0; i < str1.length; i++) {
            str1[i] = String.valueOf(before.charAt(i));
            str2[i] = String.valueOf(after.charAt(i));
        }        
        
        Arrays.sort(str1);
        Arrays.sort(str2);
        
        if(Arrays.equals(str1, str2)) return 1;
        else return 0;
    }
}