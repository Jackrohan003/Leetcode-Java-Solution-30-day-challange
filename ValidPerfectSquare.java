class Solution {
    public boolean isPerfectSquare(int num) {
     
                int ld = num%10;
                if(ld==2 ||ld==3||ld==7||ld==8  )
                        return false;
        
                int l=1;
            int r = num;
        while(l<=r)
        {
            long mid = (l + r)/2;
            long s = mid*mid;
            if(s==num)return true;
            else if(s < num)
                l=(int)mid+1;
            else
                r=(int)mid-1;
        }
        return false;        
        
        
    }
}
