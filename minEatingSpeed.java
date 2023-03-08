class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long left = 1;
        long max = piles[0];
        for(int i : piles){
            max = Math.max(max, i);

        }
        // int right = min * left;
        while(left < max){
            long mid = (max - left)/2 + left;
            if(!ifPossible(piles, h, mid)){
                left = mid +1;
            }
            else{
                max = mid;

            }
        }
        return (int)left;

        
    }

    public boolean ifPossible(int[] piles, int hours, long currk){
        long sum = 0;
        for(long t : piles){
            sum += t/currk;
            if(t%currk != 0){
                sum++;
            }
        }
        return (sum<=hours);
    }
}
