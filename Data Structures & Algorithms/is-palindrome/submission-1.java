class Solution {
    public boolean isPalindrome(String s) {
     String s1=s.toLowerCase().replaceAll("[^a-z0-9]","");
      int i=0;
      int j=s1.length()-1;
      while(i<=j){
            if(s1.charAt(i)!=s1.charAt(j)){
            return false;
        }
        i++;
        j--;
      }
      return true;
      /* Best case code
      class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            
            // 1. Skip non-alphanumeric characters from the left
            // The inner check (left < right) is crucial to prevent the pointer 
            // from going out of bounds or crossing the right pointer.
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // 2. Skip non-alphanumeric characters from the right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // 3. Compare the characters (case-insensitively)
            // If the characters at the current pointers do not match (after normalization), 
            // it's not a palindrome.
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false; 
            }
            
            // 4. If they match, move both pointers inward to check the next pair
            left++;
            right--;
        }

        // If the loop completes, all relevant characters have matched.
        return true;
    }
}
      */
    }
}
