//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.

//Input: nums = [1,3,5,6], target = 5
//Output: 2

//Input: nums = [1,3,5,6], target = 2
//Output: 1


class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target < nums[0]) return 0;

        int len = nums.length;
        for(int i = 0; i < len; i++)
        {
            if(nums[i] == target)
            {
                return i;
            }

            if(i != len-1)
            {
                if(nums[i] < target && nums[i+1] > target)
                {
                    return i+1;
                }
            }
        }

        return len;
    }
}
