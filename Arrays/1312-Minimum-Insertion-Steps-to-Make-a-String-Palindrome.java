class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];

        // Case 1: k == 0
        if (k == 0) return ans;

        int windowSize = Math.abs(k);
        int sum = 0;

        // 🔹 Build initial window
        if (k > 0) {
            // next k elements from index 0
            for (int i = 1; i <= windowSize; i++) {
                sum += code[i % n];
            }

            // 🔹 Slide window
            for (int i = 0; i < n; i++) {
                ans[i] = sum;

                // remove left
                sum -= code[(i + 1) % n];

                // add right
                sum += code[(i + windowSize + 1) % n];
            }

        } else { // k < 0

            // previous k elements for index 0
            for (int i = 1; i <= windowSize; i++) {
                sum += code[(n - i) % n];
            }

            // 🔹 Slide window
            for (int i = 0; i < n; i++) {
                ans[i] = sum;

                // remove rightmost of previous window
                sum -= code[(i - windowSize + n) % n];

                // add new left element
                sum += code[i % n];
            }
        }

        return ans;        
    }
}
