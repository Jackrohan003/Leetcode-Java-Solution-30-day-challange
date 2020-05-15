class Solution {
    public int maxSubarraySumCircular(int[] A) {
     
        int totalsum=0;
        int maxEnding =0;
        int minEnding=0;
        int maxsum=Integer.MIN_VALUE;
        int minsum= Integer.MAX_VALUE;
        
        for(int x : A)
        {
            totalsum+=x;
            maxEnding = Math.max(maxEnding + x,x);
            maxsum= Math.max(maxsum,maxEnding);
            minEnding = Math.min(minEnding + x,x);
            minsum= Math.min(minsum,minEnding);
        
        }
        if(maxsum>0)
            return Math.max(maxsum ,totalsum-minsum);
        else
            return maxsum;
        
        
        
    }
}   
