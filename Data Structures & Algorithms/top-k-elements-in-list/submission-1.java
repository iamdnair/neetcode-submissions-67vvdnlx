class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int n:nums){
            hmap.put(n,hmap.getOrDefault(n,0)+ 1);
        }
    
       ArrayList<Integer>bucketArr[]= new ArrayList[nums.length +1];
       for(Map.Entry<Integer, Integer> entry : hmap.entrySet()){
         int frequency = entry.getValue(); 
        int num=entry.getKey();
        if(bucketArr[frequency]==null){
            bucketArr[frequency]= new ArrayList<>();//{4: 3, 1: 2, 8: 1}.

        }
        bucketArr[frequency].add(num);
       }
      int res[] = new int[k];
      int count =0;
       for(int i=bucketArr.length-1;i>=0 && count<k; i--){
          if(bucketArr[i] != null){
            for(int a: bucketArr[i]){
                res[count]=a;
                count++;
               if (count == k) break;
            }
          }
       }
      return res;
    }
}
