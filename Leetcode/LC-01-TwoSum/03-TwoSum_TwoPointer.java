class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        // store value + original index
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];   // value
            arr[i][1] = i;         // original index
        }

        // sort by value
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0;
        int right = n - 1;

        while (left < right) {

            int sum = arr[left][0] + arr[right][0];

            if (sum == target) {
                return new int[]{arr[left][1], arr[right][1]};
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return new int[]{};
    }
}


/*
LeetCode 1: Two Sum
Approach: Sorting + Two Pointer (Correct Version)

Why normal two pointer fails:
If we sort the original array directly, indices are lost.
LeetCode 1 asks for original indices.

Idea:
1. Store each number with its original index.
2. Sort by number value.
3. Use two pointers:
   - left at start
   - right at end
4. If sum == target, return original indices.
5. If sum < target, move left++
6. If sum > target, move right--

Example:
nums = [3,2,4], target = 6

Stored as:
[3,0], [2,1], [4,2]

After sorting:
[2,1], [3,0], [4,2]

left = 0, right = 2
2 + 4 = 6

Return:
[1,2]

Time Complexity: O(n log n)
- sorting takes O(n log n)

Space Complexity: O(n)
- extra array used for value + index

Note:
HashMap solution is faster for LC1: O(n)
This approach is useful to learn two pointers.
*/