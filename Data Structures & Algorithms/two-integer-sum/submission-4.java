class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            Integer index = seen.get(complement);
            if (index != null) {
                return new int[]{index, i};
            }

            seen.put(nums[i], i);
        }
        return new int[]{};
    }
}
