class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hmap = new HashMap<>();

        for(String s: strs){
            char arr[]= s.toCharArray();
            Arrays.sort(arr);
            String sortedKey= new String(arr);
           
           if(!hmap.containsKey(sortedKey)){
           hmap.put(sortedKey,new ArrayList<>());
           }
           hmap.get(sortedKey).add(s);
        
        }
        return new ArrayList<>(hmap.values());
    }
}
