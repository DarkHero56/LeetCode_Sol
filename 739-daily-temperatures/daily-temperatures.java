class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];

        for (int i = n - 2; i >= 0; i--) {
            int j = i + 1;
            while (j < n && temperatures[j] <= temperatures[i]) {
                if (res[j] > 0) {
                    j = j + res[j]; // skip ahead using known results
                } else {
                    j = n; // no warmer day ahead
                }
            }
            if (j < n) {
                res[i] = j - i;
            }
        }

        return res;
    }
}
