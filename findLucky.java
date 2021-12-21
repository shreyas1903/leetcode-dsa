class Solution {
    public int findLucky(int[] arr) {
        int[] res = new int[501];
        for(int i = 0; i< arr.length; i++){
            res[arr[i]]++;
        }
        for(int j = res.length-1; j>0; j--){
            
            if(j == res[j])
                return j;
            
        }
        return -1;
    }
}
