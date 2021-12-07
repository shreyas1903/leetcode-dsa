class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i =0, j = n-1;
        int[] res = new int[2];
        while (i<j){
            if(numbers[i] + numbers[j] == target){
                    res[0] = i + 1;
                    res[1] = j+1;
                return res;
                }
                else if(numbers[i] + numbers[j] > target)
                    j--;
                else if(numbers[i] + numbers[j] < target)
                    i++;
        }
        return null;
    }
}
