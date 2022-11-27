class Solution {

    // 1 2 3  num1
    // 4 5 6   num2
    //
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int n1 = num1.length();
        int n2 = num2.length();
        int df =0; //deciding factor
        
        int i = n2 -1;
        int[] result = new int[n1 + n2];
      
        while(i>=0){
            int ival = num2.charAt(i) - '0';
            i--;

            int j = n1 -1;
            int k= result.length -1 - df;
            int carry =0;
            while(j>=0 || carry !=0){
                int jval = j>=0 ? num1.charAt(j) - '0': 0;
                j--;
                int prod = ival * jval + carry + result[k];
                result[k] = prod %10;
                carry = prod /10;
                k--;

            }
            df++; 



        }

        String str = "";
        boolean flag = false;
        for(int val : result){
            if(flag == false && val == 0){
                continue;

            }
            else{
                flag = true;
                str += val;
            }
        }
        return str;

    }
}
