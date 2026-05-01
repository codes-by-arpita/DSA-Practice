class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int l=0,r=n-1;

        int lm=0,rm=0,w=0;

        while(l<r){
            lm=Math.max(lm,height[l]);
            rm=Math.max(rm,height[r]);

            if(lm<rm){
                w+=lm-height[l];
                l++;
            }else{
                w+=rm-height[r];
                r--;
            }
        }
        return w;
    }
}