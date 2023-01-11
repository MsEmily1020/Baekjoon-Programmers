class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int max1 = dots[0][0], min1 = dots[0][0];
        int max2 = dots[0][1], min2 = dots[0][1];
        
        for(int i = 0; i < dots.length; i++) {
            if(max1 < dots[i][0]) max1 = dots[i][0];
            if(min1 > dots[i][0]) min1 = dots[i][0];
        }
        
        for(int i = 0; i < dots.length; i++) {
            if(max2 < dots[i][1]) max2 = dots[i][1];
            if(min2 > dots[i][1]) min2 = dots[i][1];
        }
        
        return (max1 - min1) * (max2 - min2);
    }
}