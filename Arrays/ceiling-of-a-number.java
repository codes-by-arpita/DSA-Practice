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
