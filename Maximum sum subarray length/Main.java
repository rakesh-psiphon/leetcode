class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max_sum = nums[0];
        int len = 0;
        for(int i=0;i<n;i++){
            int c_sum = 0;
            for(int j=i;j<n;j++){
                c_sum += nums[j];
                if(max_sum<c_sum){
                    max_sum = c_sum;
                    len = j-i;
                }
            }
        }
        return (len+1);
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max_sum = nums[0];
        int curr_sum = 0;
        int start=0;
        int end=0;
        int p=0;
        for(int i=0;i<n;i++){
            curr_sum += nums[i];
            if(curr_sum>max_sum){
                max_sum = curr_sum;
                start = p;
                end = i;
            }
            if(curr_sum<0){
                curr_sum = 0;
                p=i+1;
            }
        }
        return (end-start+1);
    }
}