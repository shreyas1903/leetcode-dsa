class Solution {
    public List<List<Integer>> generate(int numRows) {
         if(numRows ==0)
            return new ArrayList<>();
        
        List<List<Integer>> triangle = new ArrayList();
        
       
        
        for(int i =0; i < numRows; i++){
            List<Integer> rows = new ArrayList<>();
            for(int j =0; j < i+1; j++){
                if(j==0 || j == i){
                    rows.add(1);
                }
                else{
                    rows.add(triangle.get(i - 1).get(j-1) + triangle.get(i - 1).get(j));
                }
                
            }
            triangle.add(rows);
            
        }
        return triangle;
    }
}
