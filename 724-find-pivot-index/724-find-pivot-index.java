class Solution {
    public int pivotIndex(int[] nums) {
        int sum =0;
        for(int i=0; i<nums.length;i++){
            sum += nums[i];
        }
        
        int low = 0;
        int high = nums.length;
        
        int backSum = 0;
        for(int i=0; i<nums.length;i++){
            if(backSum == sum - backSum - nums[i]){
                return i;
            }
            else{
                backSum +=  nums[i];
            }
        }
        return -1;
    }
}