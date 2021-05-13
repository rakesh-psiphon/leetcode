class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max_sum = 0;
        for(int i=0;i<n;i++){
            int c_sum = 0;
            for(int j=i;j<n;j++){
                c_sum += nums[j];
                if(max_sum<c_sum)
                    max_sum = c_sum;
            }
        }
        return max_sum;
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max_sum = nums[0];
        int curr_sum = 0;
        for(int i=0;i<n;i++){
            curr_sum += nums[i];
            if(curr_sum>max_sum)
                max_sum = curr_sum;
            if(curr_sum<0)
                curr_sum = 0;
        }
        return max_sum;
    }
}