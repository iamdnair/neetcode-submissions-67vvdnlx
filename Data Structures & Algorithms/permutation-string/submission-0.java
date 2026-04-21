class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int [] s1Arr= new int[26];
        int [] s2Arr= new int[26];
        int window_size=s1.length();

        for(int i=0;i<window_size;i++){
            s1Arr[s1.charAt(i)- 'a']++;
            s2Arr[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(s1Arr,s2Arr)) return true;
        
        for(int i=window_size; i<s2.length();i++){
           s2Arr[s2.charAt(i) - 'a']++;
           s2Arr[s2.charAt(i-window_size) - 'a']--;
            if(Arrays.equals(s1Arr,s2Arr)) return true;
        }
       return false; 
    }
}
