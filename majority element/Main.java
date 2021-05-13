class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
        }
        int val=0;
        for(Map.Entry<Integer,Integer> itr : map.entrySet()){
            if(itr.getValue()>n/2)
                val = itr.getKey();
        }
        return val;
    }
}
