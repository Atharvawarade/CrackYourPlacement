
import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length>0){
            int curr = nums[0];
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(curr);
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=curr){
                    arr.add(nums[i]);
                    curr = nums[i];
                }
            }
            for(int i=0;i<arr.size();i++){
                nums[i] = arr.get(i);
            }
            return arr.size();
        }
        else{
            return 0;
        }
    }
}