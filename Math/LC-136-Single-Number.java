🟦 LC 136 – Single Number

https://leetcode.com/problems/single-number/

Every element appears twice except one. Find that single one.

🔹 Key Idea (XOR)

a ^ a = 0  
a ^ 0 = a  

So, duplicates cancel out and only the unique number remains.

🔹 Approach

Take XOR of all elements
Result = single number
------------------------------
code:

class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for (int n : nums){
            ans=ans^n;
        }
        return ans;
    }
}
-----------------------------------
⏱ Time: O(n)
📦 Space: O(1)
