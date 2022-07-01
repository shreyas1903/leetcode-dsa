class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> {
            return b[1] - a[1];
        });
        
        int ans=0, i=0, n = boxTypes.length;
        while(i<n && truckSize >0){
            int max = Math.min(boxTypes[i][0], truckSize);
            ans += max * boxTypes[i][1];
            i++; 
            truckSize -= max;
        }
        return ans;
            
    }
}
