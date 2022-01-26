class Solution {
    public int countKDifference(int[] nums, int k) {
        int size = nums.length;
int count = 0;
for(int index = 0; index < size ; index++)
{
for(int itr = index+1; itr < size ;itr++)
{
if (Math.abs(nums[index] - nums[itr]) == k)
{
count += 1;
}
}
}
return count;
    }
}
