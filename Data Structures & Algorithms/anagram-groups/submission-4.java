class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hmap = new HashMap<>();
        for(String str: strs){
            char Arr[]= str.toCharArray();
            Arrays.sort(Arr);
            String sortedKey = new String(Arr);
            if(!hmap.containsKey(sortedKey)){
             hmap.put(sortedKey, new ArrayList<>());
            }
            hmap.get(sortedKey).add(str);
        }
return  new ArrayList<>(hmap.values());
    }
}
