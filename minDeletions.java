class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        
        for(int i =0; i<s.length();i++){
            freq[s.charAt(i) - 'a']++;
        }
        
        Set<Integer> modfreq= new HashSet<>();
        int deletefreq=0;
        
      
        for(int i=0; i < 26;i++){
            int currfreq = freq[i];
            while(currfreq > 0){
                if(modfreq.contains(currfreq)){
                    currfreq--;
                    deletefreq++;
                }
                else
                    break;
            }
            
            if(currfreq != 0){
                modfreq.add(currfreq);
            }
        }
       
        
        
       
        
        return deletefreq;
    }
}
