class Solution {
    public void sortColors(int[] nums) {
        int start = 0; //starting of the array 
		int end = nums.length-1; // end of the array
		int index = 0; // current index for the array
		while(index<=end)
		{
			if(nums[index]==0)// swap the value of start and index
			{
				nums[index] = nums[start]; 
				nums[start++] = 0;
			}
			else if(nums[index]==2)  // swap the value of end and index and do not increment the index value, thats why continue is used here 
			{
				nums[index] = nums[end];
				nums[end--] = 2;
			    continue;
            }
			index++;
		}
    }
}
