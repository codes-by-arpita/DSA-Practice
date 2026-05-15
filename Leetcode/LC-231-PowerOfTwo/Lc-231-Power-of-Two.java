https://leetcode.com/problems/power-of-two/description/
LC 231 – Power of Two
Power of 2 numbers have exactly one 1 in binary

Example:
1 → 1
2 → 10
4 → 100
8 → 1000

🔹 Key Trick
n & (n - 1) == 0
🔹 Why it works
n → has one 1
n-1 → turns that 1 into 0 and makes all right bits 1
AND → removes the only 1 → becomes 0

Example:

8  = 1000
7  = 0111
------------
     0000

code:

class Solution {
    public boolean isPowerOfTwo(int n) {
        if( n<= 0) return false;
        return ((n & (n-1))==0);
    }
}
-----------------------------------
Time: O(1)
Space: O(1)
