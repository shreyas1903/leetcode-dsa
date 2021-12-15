class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length==0 && nums2.length==1  ) return nums2[0];
        if(nums1.length==1 && nums2.length==0  ) return nums1[0];
        int[] x= new int[nums1.length + nums2.length];
        int m = nums1.length;
        int n= nums2.length;
        int j =0;
        for(int i =0; i< m; i++){
            x[j] = nums1[i];
            j++; 
        }
        for(int i =0; i<n && j < (m+n);i++){
            x[j] = nums2[i];
            j++;
        }
        Arrays.sort(x);
        int mid = (x.length)/2;
        if(x.length % 2 !=0){
            return x[mid];
        }
        else
            return (Double.valueOf(x[mid]+x[mid-1])/Double.valueOf(2));
    }
}
