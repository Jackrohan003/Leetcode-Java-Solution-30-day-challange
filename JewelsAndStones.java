
class Solution {
    public int numJewelsInStones(String J, String S) {
    
          if (J == null || J.length() == 0) {
            return 0;
        }
        int count = 0;
        for (Character c : S.toCharArray()) {
            for (Character m : J.toCharArray()) {
                if (m == c) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    
}


/*
class Solution {
    public int numJewelsInStones(String J, String S) {
       //Set <Character> jewelSet = new HashSet<>();
       // for(char curr : J.toCharArray()){
       //   jewelSet.add(curr); 
       // }
        
        Map<Character, Integer> stoneCount =  new HashMap<>();
        for(char stone : S.toCharArray()){
            if(J.contains(String.valueOf(stone))){
               stoneCount.put(stone,(stoneCount.getOrDefault(stone,0)+1)); 
            }
        }
        int sum =0;
        for(Integer val : stoneCount.values()){
         sum+=val;   
        }
        
        return sum;
    }
}
   */
