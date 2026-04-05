class Solution {
    public boolean isAnagram(String s, String t) {
     Map<Character,Integer> hmap = new HashMap<>();
     if(s.length()!=t.length()) return false;

     for (char a: s.toCharArray()){
        hmap.put(a,hmap.getOrDefault(a,0)+1);
     }

     for (char b : t.toCharArray()){
        if(!hmap.containsKey(b)){
           return false;
        }
           else{
              hmap.put(b,hmap.get(b)-1);
           }
     }
     for(int count: hmap.values()){
        if(count!=0)
        return false;
     }
     return true;
    }
}
