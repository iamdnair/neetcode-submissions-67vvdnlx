class Solution {
    public boolean isAnagram(String s, String t) {
        if( s.length()!=t.length()) return false;
        Map<Character, Integer> hmap = new HashMap<>();
        for (char a :s.toCharArray()){
            hmap.put(a,hmap.getOrDefault(a,0)+1);
        }

     for(int j=0; j<t.length();j++){

        char ch = t.charAt(j);

        if(!hmap.containsKey(ch)) return false;// fail fast

        int newCount= hmap.get(ch) -1;  // at this point we are sure get will nto throw NPE
        hmap.put(ch,newCount);
       if(newCount<0) return false;

      

     }
    return true;
   
    }
}
