class Solution {
    public int findJudge(int N, int[][] trust) {
        
            int tcount[] = new int[N];
            for(int t[] : trust)
            {
                tcount[t[0]-1]--;
                tcount[t[1]-1]++;
            }
            int result =-1;
        for(int i=0;i<N;i++)
        {
            if(tcount[i]==N-1)
                return i+1;
            
        }
        return result;
        
        
    }
}
