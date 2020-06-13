class Solution {
    int maxV;
    int maxL;
    int cs;
    int next[];
    int len[];
    public List<Integer> largestDivisibleSubset(int[] nums) {
        
        if(nums.length==0)
            return new ArrayList<>();
        
        next=new int[nums.length];
        len=new int[nums.length];
        
         Arrays.sort(nums);
         maxV=nums[nums.length-1];
         
        
        for(int j=0;j<nums.length;j++){
            dp(1,j,nums);
            
        }
        
        List<Integer>list=new ArrayList<>();
        int i=cs;
        while(i!=-1){
            list.add(nums[i]);
            i=next[i];
        }
        return list;
        
        }
    
    
      
    private void dp(int cL,int start,int[] nums){
        
        if(len[start]==0){
            len[start]=1;
            next[start]=-1;
        }
        if(len[start]>maxL){
            maxL=len[start];
            cs=start;
        }
        
        
        
        int limit=maxV>>Math.max(maxL-cL,0);
        int max=0;
        for(int j=start+1;j<nums.length&&nums[j]<=limit;j++){
            
            if(nums[j]%nums[start]==0){
                
                if(len[j]==0){
                    dp(cL+1,j,nums);
                }
                
                if(len[j]>max){
                    max=len[j];
                    next[start]=j;
                    len[start]=len[j]+1;
                    if(len[start]>maxL){
                        maxL=len[start];
                        cs=start;
                        limit=maxV>>Math.max(0,maxL-cL);
                    }
                    
                    
                }
                
                
            }
            
            
        }
            
        
        
    }
}
