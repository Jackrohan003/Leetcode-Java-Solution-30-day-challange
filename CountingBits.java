if (num < 0)
            return new int[1];
        
        // allocate array incuding 0->num
        int[] countBitArray = new int[num + 1];
        
        // initial DP data
        countBitArray[0] = 0;
        
        for (int i = 1; i <= num; i++) {
            // if num is even, bit count is same as num / 2
            // if odd, bit count is same as (num / 2) + 1
            countBitArray[i] = countBitArray[i >> 1] + i % 2;
        }
        
        return countBitArray;

    }
}
