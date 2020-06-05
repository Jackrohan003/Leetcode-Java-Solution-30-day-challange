class Solution {
    public Solution(int[] w) {
        mRandom = new Random();
        N = w.length;
        mIntervals = new int[N];
        mIntervals[0] = w[0];
        for (int i = 1; i < N; i++) {
            mIntervals[i] = mIntervals[i - 1] + w[i];
        }
        mMax = mIntervals[N - 1];
    }

    public int pickIndex() {
        int val = mRandom.nextInt(mMax);
        int low = 0;
        int high = N - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (mIntervals[mid] <= val) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
    Random mRandom;
    int[] mIntervals;
    int N;
    int mMax;
}
