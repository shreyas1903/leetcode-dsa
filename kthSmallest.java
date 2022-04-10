class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;
        ArrayList<Integer> res = new ArrayList<>(); 
        for(int i =0; i<n; i++){
            for(int j =0; j < m; j++){
                res.add(matrix[i][j]);
            }
        }
        Collections.sort(res);
        return (int)res.get(k-1);
            
    }
}
