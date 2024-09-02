// 75. Sort Colors
// Solved
// Medium
// Topics
// Companies
// Hint
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

 

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]
 

// Constraints:

// n == nums.length
// 1 <= n <= 300
// nums[i] is either 0, 1, or 2.

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i=0;i<n;i++){
            switch(nums[i]){
                case 0:
                    cnt0++;
                    break;

                case 1:
                    cnt1++;
                    break;

                case 2:
                    cnt2++;
                    break;

                default:
                    break;        
            }
        }
        int i = 0;
            while(cnt0!=0){
                nums[i]=0;
                cnt0--;
                i++;
            }
            while(cnt1!=0){
                nums[i]=1;
                cnt1--;
                i++;
            }
            while(cnt2!=0){
                nums[i]=2;
                cnt2--;
                i++;
            }
    }
}