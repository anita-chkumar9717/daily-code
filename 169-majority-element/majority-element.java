class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length<=1){
            return nums[0];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int c=0;
        int v=1;
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
                if(map.get(nums[i])>=c){
                    v=nums[i];
                    c=map.get(nums[i]);
                }
            }else{
                map.put(nums[i],1);
            }
        }
        return v;

    }
}