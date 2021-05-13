class Solution {
    public int findPeakElement(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid = (low+high)/2;
            if(nums[mid]>nums[mid+1]){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}


//  0  1  2  3  4  5  6
//  1  2  1  3  5  6  7

/*

*/

