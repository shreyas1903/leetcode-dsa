class Solution {
    public int minStoneSum(int[] piles, int k) {
        
        int n =piles.length - 1;
        
        while(k<0){
            Arrays.sort(piles, n, 0);
            int temp = piles[0] - piles[0]/2;
            for(int i=1; i<n; i++){
               
                if(k == 0)
                    break;
                if(temp < piles[i]){
                    piles[i] -= piles[i]/2;
                    k--;
                }
                else if(temp > piles[i])
                    break;
               
            }
        }
        
        int sum=0;
       for(int i =0; i < n; i++){
            sum += piles[i];
        }
        return sum;
    }
}
