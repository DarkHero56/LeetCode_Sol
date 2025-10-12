class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;

     
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;

            // Add elements one by one from start to end
            for (int end = start; end < nums.length; end++) {
                sum += nums[end];

                // Check if current subarray sum equals k
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
