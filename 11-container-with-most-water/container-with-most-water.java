class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int area = 0;
        int max_area = 0;
        while(start < end){
            area = (end-start)*(Math.min(height[end],height[start]));
            max_area = Math.max(max_area,area);
            if(height[start]>height[end]){
                end--;
            }
            else{
                start ++;
            }
        }
        return max_area;
    }
}