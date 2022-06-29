class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a,b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        
        List<int[]> lst = new LinkedList<>();
        for(int a[] : people){
            lst.add(a[1],a);
        }
        return lst.toArray(new int[people.length][]);
    }
}
