class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        while(nums1.length > i && nums2.length > j){
            if(nums1[i] == nums2[j]){
                ans.add(nums2[j]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j])
                    i++;
            else 
                j++;
        }
        int[] arr = new int[ans.size()];
        int k = 0;
        for(int num: ans)
            arr[k++] = num;
        return arr;
        
    }
}
