class Solution {
    public int findComplement(int num) {
        if(num==0)return 1;
        int bits = (int)(Math.log(num)/Math.log(2))+1;
        int mask = (1<<bits)-1;
        return num ^ mask;
        
    }
}

/*

class Solution {
    public int findComplement(int num) {
        int cp = num;
        int sum = 0;
        while(num > 0){
            sum = (sum << 1) + 1;
            num >>= 1;
        }
        return sum - cp;
        
    }
}



*/
