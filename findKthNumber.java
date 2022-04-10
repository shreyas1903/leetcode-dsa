class Solution {
    public int findKthNumber(int m, int n, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        int[][] arr = new int[m][n];
        for(int i =1; i < m; i++){
            for(int j =1; j <n;j++){
                arr[i][j] = i*j;
            }
        }
        for(int i =1; i < m; i++){
            for(int j =1; j <n;j++){
                res.add(arr[i][j]);
            }
        }
        Collections.sort(res);
        return (int)res.get(k);
    }
}
