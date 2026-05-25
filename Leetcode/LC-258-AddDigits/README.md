https://leetcode.com/problems/add-digits/

Keep adding digits until a single digit remains.

🔹 Idea

Repeatedly sum digits until num < 10

🔹 Approach

Extract digits using % 10
Add them
Repeat until single digit


⏱ Time: O(log n)
📦 Space: O(1)