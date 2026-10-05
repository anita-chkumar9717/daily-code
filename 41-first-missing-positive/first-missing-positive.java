class Solution {
    public int firstMissingPositive(int[] nums) {
        // if(nums.length==1 && nums[0]<=0 || nums.length==1 && nums[0]>1){
        //     return 1;
        // }else if(nums.length==1 && nums[0]==1){
        //     return 2;
        // }

        Arrays.sort(nums);
        System.out.print(Arrays.toString(nums));
        
        int indx = -1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]<=0){
                indx=i;
            }else{
                break;
            }
        }

        if(nums[indx+1]==1){
            for(int i=indx+1; i<nums.length-1; i++){
                if(nums[i+1]>nums[i]+1){
                    return nums[i]+1;
                }
            }
            return nums[nums.length-1]+1;
        }

        return 1;
    }
}