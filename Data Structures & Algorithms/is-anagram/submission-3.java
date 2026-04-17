class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length()!=t.length()) return false;
      Map<Character, Integer> hmap= new HashMap<>();
      for(int i=0; i<s.length();i++){
        char ch= s.charAt(i);
         hmap.put(ch, hmap.getOrDefault(ch,0) + 1);
      } 

      for(int i=0; i<t.length();i++){
        char ch= t.charAt(i);
        if(!hmap.containsKey(ch)) return false;
        else {
            hmap.put(ch, hmap.getOrDefault(ch,0) -1);
        }
      }
      boolean isAnagram= hmap.values().stream().allMatch(x->x==0);
      if(isAnagram) return true;
      else return false;
    }
}
