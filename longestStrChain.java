class Solution {
    public int longestStrChain(String[] words) {
        if(words == null || words.length == 0){
            return 0;
        }
        Arrays.sort(words, (a,b) -> a.length() - b.length());
        Map<String, Integer> res = new HashMap<>();
        int max=0;
        for(String word :words){
            int longest = 0;
            for(int i =0; i <word.length(); i++){
                String subword = word.substring(0, i) + word.substring(i+1);
                longest = Math.max(longest, res.getOrDefault(subword,0) + 1); 
            }
            res.put(word, longest);
            max = Math.max(max, longest);

        }
        return max;
    }
}
