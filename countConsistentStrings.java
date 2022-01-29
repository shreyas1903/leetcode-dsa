class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int falseString = 0;
		for(String word : words){
			for(int i = 0; i < word.length(); i++){
				if(! allowed.contains(word.charAt(i)+"")){
					falseString++;
					break;
				}
			}
		}
		return words.length - falseString;
    }
}
