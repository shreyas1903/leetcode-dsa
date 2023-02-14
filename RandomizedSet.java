class RandomizedSet {
    // List<Integer> list;
    HashSet<Integer> res ;
    // Random random;


    public RandomizedSet() {
        // list = new ArrayList<>();
        res = new HashSet<Integer>();
        // random = new Random();
    }
    
    public boolean insert(int val) {
        if(!res.contains(val)){
            res.add(val);
            // nums.add(val);
            return true;
        }
        else
            return false;
        
    }
    
    public boolean remove(int val) {
        if(res.contains(val)){
            res.remove(val);
            return true;
        }
        else{
            return false;

        } 
    }
    
    public int getRandom() {
        Integer[] temp = res.toArray(new Integer[0]); 
        return temp[ (int) (Math.random() * temp.length)]; 
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
