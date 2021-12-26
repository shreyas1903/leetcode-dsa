class Solution {
public:
    int sumOfUnique(vector<int>& nums) {
        int attendance[] = new int[101];
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            //Number seen first time, so add it to sum
            if(attendance[nums[i]]==0){
                attendance[nums[i]]++;
                sum+=nums[i];
            }
            //Number seen second time, so subtract it from sum
            else if(attendance[nums[i]]==1){
                attendance[nums[i]]++;
                sum-=nums[i];
            }
            //In every other case, do nothing
        }
        return sum;
    }
};
