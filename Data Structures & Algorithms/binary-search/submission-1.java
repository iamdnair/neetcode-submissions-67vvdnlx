class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length -1;
       // int mid=0;

        while(low<=high){//1,2,4,6,8,9,10 

  int mid= low + (high-low)/2;

      if(nums[mid]==target){
         return mid;
      }
      
      else if(nums[mid]>target)
      {
            high=mid-1;
      } 
      else {
        low= mid + 1;
         }
        }
      return -1;  
    }
}
