class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] record = new int[26];
        
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            record[c - 'a']++;
        }
        
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            --record[c - 'a'];
            if (record[c - 'a'] < 0) {
                return false;
            }
        }
        
        return true;
        
    }
}
