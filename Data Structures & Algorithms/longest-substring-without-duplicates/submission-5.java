class Solution {
    public int lengthOfLongestSubstring(String s) {
        int lastseen[]= new int[128];
        Arrays.fill(lastseen,-1);
        int left=0;
        int longest=0;
        for(int right=0; right<s.length(); right++){
           char ch= s.charAt(right);
           if(lastseen[ch] != -1){
            left= Math.max(left, lastseen[ch] + 1);
           }
           lastseen[ch]=right;
           longest= Math.max(longest, right-left+1);
        }
        return longest;
    }
}
