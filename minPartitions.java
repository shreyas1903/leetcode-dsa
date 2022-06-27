class Solution {
    public int minPartitions(String n) {
       char res[] = n.toCharArray();
        int x=0;
       for(char i=0; i < n.length();++i){
           x = Math.max(x, res[i] - '0');
       }
        return x;
    }
}
