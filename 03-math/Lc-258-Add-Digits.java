https://leetcode.com/problems/add-digits/

Keep adding digits until a single digit remains.

🔹 Idea

Repeatedly sum digits until num < 10

🔹 Approach

Extract digits using % 10
Add them
Repeat until single digit

🔹 Code

class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int dig = 0;
            
            while (num > 0) {
                dig += num % 10;
                num /= 10;
            }
            
            num = dig;
        }
        return num;
    }
}

⏱ Time: O(log n)
📦 Space: O(1)
