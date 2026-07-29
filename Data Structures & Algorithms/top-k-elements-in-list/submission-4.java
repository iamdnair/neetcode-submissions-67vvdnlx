class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int n :nums){
         hmap.put(n,hmap.getOrDefault(n,0) + 1);
        }
       PriorityQueue<Integer> minheap= new PriorityQueue<>(
       (a,b) -> Integer.compare(hmap.get(a) , hmap.get(b))
       );
       for(int key:hmap.keySet()){
        minheap.add(key);
        if(minheap.size()>k){
          minheap.poll();
        }
       }
       int result[]= new int[k];
       for(int i=0; i<k;i++){
        result[i]=minheap.poll();
       }
      return result;
    }
}
