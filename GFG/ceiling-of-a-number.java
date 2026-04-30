Find the smallest number ≥ x in a sorted array.
🔹 Idea
If arr[mid] >= x → possible answer → move left
Else → move right
🔹 Approach
Use binary search
Store potential answer in ans
Keep minimizing it
🔹 Code
class Solution {
    public int findCeil(int[] arr, int x) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        
        while (s <= e) {
            int mid = s + (e - s) / 2;
            
            if (arr[mid] >= x) {
                ans = arr[mid];
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
}  
⏱ Time: O(log n)
📦 Space: O(1)
