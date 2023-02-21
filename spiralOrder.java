class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int row = matrix.length;
        if(row == 0) return res;
        int col = matrix[0].length;
        int top =0, bottom = row-1, l =0, r = col -1;
        int d=0;
        

        
        while(l<=r && top <= bottom){
            if(d==0){

                for(int i =l;i<=r; i++){
                    res.add(matrix[top][i]);
                }

                d=1;
                top++;

            }
            else if(d==1){

                for(int i =top;i<= bottom; i++){
                    res.add(matrix[i][r]);
                }
                d=2;
                r--;
            }
            else if(d==2){

                for(int i= r;i>=l; i--){
                    res.add(matrix[bottom][i]);
                }
                d=3;
                bottom--;
                
            }
            else if(d==3){
                for(int i =bottom;i>= top; i--){
                    res.add(matrix[i][l]);
                }
                d=0;
                l++;
                
            }

        }
        return res;
    }
}
