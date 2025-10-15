class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        int[] stack = new int[n]; // acts as stack
        int top = -1; // stack pointer

        for (int i = 0; i < n; i++) {
            while (top >= 0 && temperatures[i] > temperatures[stack[top]]) {
                int prev = stack[top--];
                res[prev] = i - prev;
            }
            stack[++top] = i; // push current index
        }
        return res;
    }
}
