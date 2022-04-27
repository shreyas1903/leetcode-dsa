class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String current : strs){
            char[]  character=  current.toCharArray();
            Arrays.sort(character);
            String sorted = new String(character);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(current);
            
        }
        res.addAll(map.values());
            return res;
    }
}
