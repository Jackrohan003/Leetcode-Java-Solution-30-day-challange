/*
Time Complexity O(n)
Space Complexity O(1)
moore's voting algorithm
*/


class Solution {
    public int majorityElement(int[] nums) {
    
         int id =0;
        int cnt =1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[id])
                cnt++;
            else
                cnt--;
            if(cnt==0)
            {
                id = i;
                cnt =1;
            }
        }
        return nums[id];
        
    }
}

//2nd Way (TimeComplexity and Space Complexity O(n)

class Solution {
    public int majorityElement(int[] nums) {
        int limit = (int) Math.ceil(nums.length/2.0);
        System.out.println(limit);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
                if (map.get(nums[i]) >= limit) {
                    return nums[i];
                }
            } else {
                map.put(nums[i], 1);
                if (map.get(nums[i]) >= limit) {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}



