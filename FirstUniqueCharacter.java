class Solution {
    public int firstUniqChar(String s) {
        int res = Integer.MAX_VALUE;
        
        for(char c = 'a'; c <= 'z'; c++){
            int index = s.indexOf(c);
            
            if(index != -1 && index == s.lastIndexOf(c))
                res = Math.min(res, index);
        }
        
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}

// 2n way

class Solution {
    public int firstUniqChar(String s) {
    
            int ch[]= new int[26];
            
            for(char c : s.toCharArray())
            {
                ch[c-'a']+=1;
            }
        
            for(int i=0;i<s.length();i++)
                if(ch[s.charAt(i)-'a']==1)
                    return i;
        
            return -1;
        
    }
}


//3rd way
public class Solution {
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        
        if (s.length() == 1) {
            return 0;
        }
        
        int index = Integer.MAX_VALUE;
        for (char c = 'a'; c <= 'z'; c++) {
            int i = s.indexOf(c);
            if (0 <= i && i == s.lastIndexOf(c)) {
                index = Math.min(index, i);
            }
        }
        
        return index == Integer.MAX_VALUE ? -1 : index;
    }
}

