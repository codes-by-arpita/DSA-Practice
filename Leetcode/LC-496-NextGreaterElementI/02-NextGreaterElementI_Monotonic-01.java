import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int [] ans = new int[n];

        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st=new Stack<>();

        for(int i:nums2){
            while(!st.isEmpty() && i>st.peek()){
                map.put(st.pop(),i);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            map.put(st.pop(),-1);
        }

        for(int i = 0 ;i <n ;i++){
            ans[i]=map.get(nums1[i]);
        }

        return ans;
    }
}