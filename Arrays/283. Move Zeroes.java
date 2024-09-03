import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                arr.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i<arr.size()){
                nums[i] = arr.get(i);
            }
            else{
                nums[i] = 0;
            }
        }

    }
}