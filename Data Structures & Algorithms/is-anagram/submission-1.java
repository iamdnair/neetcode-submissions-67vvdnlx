class Solution {
    public boolean isAnagram(String s, String t) {
        if( s.length()!=t.length()) return false;
        Map<Character, Integer> hmap = new HashMap<>();
        for (char a :s.toCharArray()){
            hmap.put(a,hmap.getOrDefault(a,0)+1);
        }

     for(int j=0; j<t.length();j++){
      if(hmap.containsKey(t.charAt(j))){
        hmap.put(t.charAt(j), hmap.getOrDefault(t.charAt(j),0)-1);
      }

     }
     boolean flag= hmap.values().stream().allMatch(v->v==0);
   if(flag){
    return true;
   }
   return false;
   
    }
}
