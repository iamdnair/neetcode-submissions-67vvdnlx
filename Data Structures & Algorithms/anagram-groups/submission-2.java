class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

      Map<String, List<String>> hmap = new HashMap<>();

     for(String str: strs){
      char []Arr= str.toCharArray();
      Arrays.sort(Arr);
      String SortedKey = new String(Arr);

           if(!hmap.containsKey(SortedKey)){
            hmap.put(SortedKey,new ArrayList<>());
           }
           hmap.get(SortedKey).add(str);
     }
     return new ArrayList<>(hmap.values());
    }
    
}
