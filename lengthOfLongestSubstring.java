class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> res = new HashMap<>();
        int max=0, i=0, j =0;
        while(j< s.length()){
            if(!res.containsKey(s.charAt(j))){
                res.put(s.charAt(j++), 1);
                max = Math.max(max, res.size());
            }
            else
                res.remove(s.charAt(i++));
        }
        return max;
    }
}
