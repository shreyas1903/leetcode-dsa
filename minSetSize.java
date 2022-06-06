class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> res = new HashMap<>();
        for(int num:arr){
            res.put(num, res.getOrDefault(num,0)+1);
        }
        List<Integer> freq = new ArrayList<>(res.values());
        Collections.sort(freq, Collections.reverseOrder());
        int i=0;
        int count=0;
        int totalel = n;
        while(totalel > n/2){
            totalel -= freq.get(i);
            i++;
            count++;
        }
        return count;
    }
}
