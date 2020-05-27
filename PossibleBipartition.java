class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        int[] ids = new int[N+1];
        for(int i=0; i < ids.length; i++) {
            ids[i] = i;
        }
        
        for(int[] x: dislikes) {
            int one = x[0];
            int two = x[1];
            
            if (ids[one] == one && ids[two] == two) {
                ids[one] = two;
                ids[two] = one;
            }
            else if (ids[one] != one && ids[two] == two) {
                ids[two] = ids[ids[one]];
            }
            else if (ids[one] == one && ids[two] != two) {
                ids[one] = ids[ids[two]];
            }
            else if (ids[one] != one && ids[two] != two && ids[one] == ids[two]) {
                return false;
            }            
        }
        return true;
    }
}
