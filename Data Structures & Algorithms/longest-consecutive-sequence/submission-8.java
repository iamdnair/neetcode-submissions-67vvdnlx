class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=0;
        

   Set<Integer> set = new HashSet<>();
        for(int n : nums){
          set.add(n);
        }
        
         for(int n : nums){
            if(!set.contains(n-1)){
                int curr_streak=1;
                int curr_num=n;
                while(set.contains(curr_num + 1)){
                      
                curr_streak++;
                curr_num++;
                }
                 longest= Math.max(longest,curr_streak);
            }
         
        }
     return longest;
    }
}
