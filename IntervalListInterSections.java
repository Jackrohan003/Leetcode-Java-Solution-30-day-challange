class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> res = new ArrayList<>();

        int aIndex = 0;
        int bIndex = 0;
        
        while(aIndex < A.length && bIndex < B.length){
            int[] intervalA = A[aIndex];
            int[] intervalB = B[bIndex];
            
            if(intervalA[0] > intervalB[1]){
                bIndex++;
            }
            else if(intervalB[0] > intervalA[1]){
                aIndex++;
            }
            else{
                //There is intersection
                int[] intersection = new int[2];
                intersection[0] = Math.max(intervalA[0], intervalB[0]);
                intersection[1] = Math.min(intervalA[1], intervalB[1]);
                
                res.add(intersection);
                if(intervalB[1] < intervalA[1]){
                    bIndex++;
                }
                else{
                    aIndex++;
                }
            }
        }
        
        
        return res.toArray(new int[res.size()][2]);
    }
}
