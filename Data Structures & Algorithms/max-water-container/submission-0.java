class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int area=0;
        int max_area=0;
        int curr_height=0;

        while(left<right){// area= width * Math.min(heights[left], heights[right])
        int width= right-left;
        curr_height=Math.min(heights[left],heights[right]);;
        area=width * curr_height;
        max_area= Math.max(max_area, area);
        if(heights[left]<heights[right]){//move always the shorter height bar
          left++;
        }
        else{
        right--;
        }
        }
        return max_area;
    }
}
