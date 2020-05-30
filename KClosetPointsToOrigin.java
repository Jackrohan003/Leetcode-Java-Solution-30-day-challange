  public int[][] kClosest(int[][] points, int K) {
        if(K >= points.length) return points;
        int[] nums = new int[points.length];
        for(int i = 0; i < points.length; i++){
            int[] pair = points[i];
            int d = pair[0]*pair[0] + pair[1] * pair[1];
            nums[i] = d;
        }
        
        int keyIndex = points.length - 1;
        int small = 0;
        int big = keyIndex - 1;
        int currentPos = findPosition(keyIndex, small, big, nums);
        int target = K;
        while(currentPos != target - 1){
            if(currentPos < target-1){
                small = currentPos + 1;
            }
            else{
                keyIndex = currentPos - 1;
                big = keyIndex - 1;
            }
            currentPos = findPosition(keyIndex, small, big, nums);
        }
        
        int[][] output = new int[K][2];
        int max = nums[K-1];
        int index = 0;
        for(int[] pair : points){
            if(pair[0]*pair[0] + pair[1] * pair[1] <= max){
                output[index] = pair;
                index ++;
                if(index == K) return output;
            }
        }
        return output;
    }
    
    int findPosition(int keyIndex, int left, int right, int[] nums){
        int key = nums[keyIndex];
        while(left < right){
            while(left < right && nums[left] < key){
                left ++;
            }
            while(right > left && nums[right] >= key){
                right --;
            }
            if(nums[left] >= key && nums[right] < key){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left ++;
                right --;
            }
        }
        if(nums[left] < key){
            left ++;
        }
        nums[keyIndex] = nums[left];
        nums[left] = key;
        return left;
    }
}
