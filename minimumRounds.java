class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> res = new HashMap<>();
        for(int i: tasks){
            res.put(i, res.getOrDefault(i,0)+1);
        }
        int c =0;
        for(int auto : res.keySet()){
            if(res.get(auto) <2){
                return -1;
            }
            if(res.get(auto) == 2 || res.get(auto) == 3){
                c+=1;

            }
            if(res.get(auto) > 3){
                int temp = res.get(auto);
                while(temp >= 3){
                    temp-=3;
                    c++;
                }
                while(temp >= 2){
                    temp -=2;
                    c++;
                }
                if(temp >0){
                    c++;

                }

            }
        }
        return c;
    }
}
