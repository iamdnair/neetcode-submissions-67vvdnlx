class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> sh = new HashSet<>();
          for(int num: nums){
             sh.add(num);
          }
          int longest=0;
          for(int num:sh){
            if(!sh.contains(num-1)){
                int curr_streak=1;
                int curr_num=num;
                while(sh.contains(curr_num + 1)){
                    curr_streak++;
                    curr_num++;
                }
                longest= Math.max(longest, curr_streak);
            }
         
          }
          return longest;
    }
}
