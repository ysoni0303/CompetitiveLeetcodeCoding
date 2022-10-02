class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int low = 0;
        int high = arr.length - 1;
        List<Integer> result = new ArrayList<>();
        
        while(k < (high - low + 1)){
            int lowD = Math.abs(x-arr[low]);
            int highD = Math.abs(x-arr[high]);
            if(lowD > highD){
                low++;
            }else{
                high--;
            }
        }
                                 
        for(int i=low; i<=high;i++){
            result.add(arr[i]);
        }
                                 
        return result;
    }
}