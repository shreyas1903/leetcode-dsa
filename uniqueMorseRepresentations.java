class Solution {
    public int uniqueMorseRepresentations(String[] words) {
         String arr[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> res = new HashSet<>();
        for(int i =0;i<words.length;i++){
            String s = "";
            for(int j =0;j < words[i].length();j++){
                s += arr[words[i].charAt(j) - "a"];
            }
            res.add(s);
            
        }
        return res.size();
    }
}
