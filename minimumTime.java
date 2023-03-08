class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long left = 1;
        long min = time[0];
        for(int t :time){
            min = Math.min(min,t);
        }
        long right = totalTrips * min ;
        while(left < right){
            long mid = (right-left)/2+left;
            long total = hello(time, mid); 
            if(total < totalTrips){
                left = mid +1;

            }
            else{
                right = mid;
            }
        }

        return left;

    }

    private long hello(int[] time, long given){
        long sum=0l;
        for(int t:time){
            sum += ((long)given)/t;
        }
        return sum;
       
    }
}
