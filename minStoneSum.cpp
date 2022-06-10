class Solution {
public:
    int minStoneSum(vector<int>& piles, int k) {
        while(k>0)
        {
            sort(piles.begin(),piles.end(),greater<int>());
            int temp = piles[0]-piles[0]/2;
            for(int i=0;i<piles.size();i++)
            {
                if(k==0)
                    break;
                if(temp<=piles[i])
                {
                    piles[i] = piles[i]-piles[i]/2;
                    k--;
                }
                else if(temp>piles[i])
                    break;
            }    
        }
        int sum =0;
        for(int i=0;i<piles.size();i++)
        {
            sum += piles[i];
        }
        return sum;
    }
};
