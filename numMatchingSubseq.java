class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        HashMap<String, Boolean> res = new HashMap<>();
        int count=0;
        for(String h :words){
            if(!res.containsKey(h)){
                if(iss(h,s,h.length() ,s.length()) || h.length() == 0){
                    count++;
                    res.put(h, true);
                }
                else{
                    res.put(h,false);
                }
            }
            else if(res.get(h)) count++;
        }
        return count;
    }
    
    public boolean iss(String s, String t, int m, int n){
       int j=0;
        for(int i=0; i<n && j<m ;i++){
            if(s.charAt(j) == t.charAt(i)){
                j++;
            }
        }
        return m==j;
       
    }
    
    
}
