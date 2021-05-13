class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int max = arr[0];
        int index = 0;
        for(int i=1;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}


class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(nums[0]>nums[1])
            return 0;
        else if(nums[n-1]>nums[n-2])
            return n-1;
        for(int i=1;i<n-1;i++){
            if(nums[i-1]<nums[i]&&nums[i]>nums[i+1])
                return i;
        }
        return -1;
    }
}



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
8 5 4 3 2 1
*/