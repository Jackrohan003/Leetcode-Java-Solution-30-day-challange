class Solution {
    public int findMaxLength(int[] nums) {
        
        
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        
        int sum=0;
        int maxlen= 0;
        mp.put(0,-1);
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                sum+=-1;
            else
                sum+=1;
            
            if(mp.containsKey(sum))
                maxlen = Math.max(maxlen,i-mp.get(sum));
            else
                mp.put(sum,i);
                
        }
        return maxlen;
        
        
    }
}
