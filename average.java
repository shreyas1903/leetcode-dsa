class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int n = salary.length;
        double sum =0;
        int x = (salary[0]+salary[salary.length-1]);
        for(int i =1; i<n-1; i++){
            sum += salary[i];
        }
        sum = sum/(n-2);
        return sum;
    }
}
