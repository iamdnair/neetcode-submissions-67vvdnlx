class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int val: nums){
            hmap.put(val, hmap.getOrDefault(val,0) + 1); 
        }
        List<Integer>[] bucket = new List[nums.length +1];

        for(Map.Entry<Integer, Integer> entry : hmap.entrySet()){
              int num= entry.getKey();
              int frequency = entry.getValue();
              if(bucket[frequency]==null){
                bucket[frequency]= new ArrayList<>();
              }
              bucket[frequency].add(num);
        }
        int count=0;
        int result[] = new int[k];
        for(int i= bucket.length -1; i>=0 && count<k; i--){
            if(bucket[i]!= null){
                 for(int a: bucket[i]){
                result[count]=a;
                count++;
               if (count == k) break;
            }
            }
        }
        return result;
    }
}
