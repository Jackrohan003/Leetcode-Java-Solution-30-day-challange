class Solution {
    public boolean checkStraightLine(int[][] c) {
        
        float slop = getslop(c[0],c[1]);
        
            for(int i=2;i<c.length;i++)
            {
                float m = getslop(c[i],c[0]);
                if(m!=slop)
                    return false;
            }
        return true;
    
    }
    
    float getslop(int p1[],int p2[])
    {
        if(p1[0]==p2[0])
            return 100000;
        
        return (float)(p2[1]-p1[1])/(p2[0]-p1[0]);
    }
}
