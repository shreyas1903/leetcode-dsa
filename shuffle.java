class Solution {
    public int[] shuffle(int[] nums, int n) {
         int [] ans = new int[nums.length];
		// index to keep track of where the entries into the answer array are going
        int index = 0;
        
		// Simultaneously iterate through the first and second half of the arrays (j starts halfway down at n), placing the elements at i and j in every second slot of the answer array
        for(int i = 0, j = n; i < n; i++) {
            ans[index] = nums[i];
            index++;
            ans[index] = nums[j];
            index++;
            j++;
        }
        return ans;
    }
}
