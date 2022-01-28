class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         List list = new ArrayList<>();
int greatestElement=candies[0];       

        int ans=0;
    for (int i = 1; i <candies.length ; i++) {
       if(candies[i]>greatestElement){
           greatestElement = candies[i];
       }
    }
    for (int candy : candies) {
        ans = candy + extraCandies;
        if (greatestElement <= ans) {
            list.add(true);
        } else {
            list.add(false);
        }
    }

    return list;
    }
}
