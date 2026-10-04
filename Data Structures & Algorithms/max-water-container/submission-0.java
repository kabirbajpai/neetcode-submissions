class Solution {
    public int maxArea(int[] heights) {
        int max = Integer.MIN_VALUE;
        int i=0;
        int j=heights.length-1;
        while(i<j){
            int hght=Math.min(heights[i],heights[j]);
            int width=j-i;
            max=Math.max(max,hght*width);
            if(heights[i]<heights[j]){
                i++;
            }else {
                j--;
            }
         
        }

        return max ;
    }
}
