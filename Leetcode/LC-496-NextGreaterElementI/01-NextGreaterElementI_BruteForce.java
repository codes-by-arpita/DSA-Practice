class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] ans=new int[n];

        for(int i=0; i<n ;i++){
            int target=nums1[i];
            int j=0;

            while(j<m && nums2[j]!=target){
                j++;
            }

            j++;

            while(j<m && nums2[j]<=target){
                j++;
            }

            if(j<m){
                ans[i] = nums2[j];
            }else{
                ans[i] = -1;
            }
        }
        return ans;
    }
}