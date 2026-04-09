class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>> map = new HashMap<>();

     for(String s: strs){
        char[] charArr= s.toCharArray();
        Arrays.sort(charArr);
        String sortedKey = new String(charArr);
        if(!map.containsKey(sortedKey)){
           map.put(sortedKey, new ArrayList<>());// creating new key
        } //chck if key exisits
        map.get(sortedKey).add(s);// here is the update
     }
     return new ArrayList<>(map.values());
    }
    
}
