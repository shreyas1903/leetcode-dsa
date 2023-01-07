class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0, n = gas.length;
        for(int i=0;i<n;i++) {
            sum += gas[i]-cost[i];
        }
        if(sum < 0){
            return -1;

        }
        int gasin =0, start=0;
        for(int i=0;i<gas.length;i++){
            gasin += gas[i]-cost[i];
            if(gasin <0){
                start =i+1;
                gasin=0;
            } 
        }
        return start;

        
    }
}
