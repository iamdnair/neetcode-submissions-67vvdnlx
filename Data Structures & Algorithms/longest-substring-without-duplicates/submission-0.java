class Solution {
    public int lengthOfLongestSubstring(String s) {

     int left=0;
     int longest_substring=0;
     int lastseen[]= new int[256];
     Arrays.fill(lastseen, -1);

     for(int right=0; right<s.length(); right++){
       char ch = s.charAt(right);
        if(lastseen[ch]!= -1){
          left= Math.max(left, lastseen[ch] +1);
        }
        lastseen[ch]= right;
        longest_substring= Math.max(longest_substring, right-left+1);
     }  

     return longest_substring;
    }
}
