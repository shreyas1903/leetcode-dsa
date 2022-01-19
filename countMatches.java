class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int i=0, ans=0;
        switch(ruleKey){
            case "type":
                i=0; break;
            case "color":
                i=1; break;
            case "name":
                i=2; break;
            default:
                break;
        }
        
        for(List<String> s : items){
            if(ruleValue.equals(s.get(i))){
                ans++;
            }
        }
        
        return ans;
    }
}
