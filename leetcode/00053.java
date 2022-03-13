class Solution {
    public int maxSubArray(int[] nums) {
        int[] sum = new int[nums.length + 1];
        sum[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            sum[i+1] = sum[i] + nums[i];
        }
        
        int maxsum = nums[0];
        int minimumminus = sum[0];
        for (int i = 1; i < sum.length; i++) {
            if (sum[i] - minimumminus > maxsum) {
                maxsum = sum[i] - minimumminus;
            }
            if (sum[i] < minimumminus) {
                minimumminus = sum[i];
            }
        }
        return maxsum;
    }
}