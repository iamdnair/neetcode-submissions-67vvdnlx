class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> sort1 = new HashSet<>();
       if(nums==null || nums.length==0){
        return 0;
       }
        for(int a : nums){
           sort1.add(a);// store all element to set give O(1) lookup also removes duplciate
        }

        int longest=0;

        for(int b :nums){
            if(!sort1.contains(b-1)){ // check if this no is the first in sequence
                int current_num=b;
                int curr_streak=1;
                while(sort1.contains(current_num+1)){ // increment sequence and see if it exists
                    curr_streak++;
                    current_num++;
                }
                longest= Math.max(longest,curr_streak);
            }
        }
        return longest;
    }
}
