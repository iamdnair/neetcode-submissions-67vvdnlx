class Solution {
    public int characterReplacement(String s, int k) {
        int max_freq=0;
        int left=0;
        int[]freq= new int[26];
        int longest=0;
        for(int right=0; right<s.length(); right++){
            char ch= s.charAt(right);
            freq[ch-'A']++;
            max_freq=Math.max(max_freq,freq[ch -'A']);
            int window_len=right-left+1;
            if(window_len-max_freq>k){
                char charleft=s.charAt(left);
                freq[charleft-'A']--;
                left++;
                window_len=right-left+1;
            }
            longest=Math.max(longest,window_len);
        }
        return longest;
    }
}
