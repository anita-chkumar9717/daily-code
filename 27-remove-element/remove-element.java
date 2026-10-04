import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]==val){
                nums[i]=-1;
                c+=1;
            }
        }

        int j=nums.length-1;
        int i=0;
        while(i<j){
            if(nums[i]==-1 && nums[j]!=-1 ){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }else if(nums[i]!=-1){
                i+=1;
            }else if(nums[j]==-1){
                j-=1;
            }
        }
        return (nums.length-c);
    }
}