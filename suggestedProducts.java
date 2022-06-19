class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> res = new ArrayList<>();
        for(int i =0; i < searchWord.length(); i++){
            int count=0; 
            List<String> list = new ArrayList<>();
            String sub = searchWord.substring(0, i+1);
            for(int j=0; j < products.length; j++){
                String p = products[j];
                if(p.length() >= i+1){
                    if(p.substring(0,i+1).equals(sub)){
                        list.add(p);
                        count++;
                    }
                    if(count == 3){
                    break;
                }
                }
                
            }
            res.add(list);
        }
        return res;
    }
}
