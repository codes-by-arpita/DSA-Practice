class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int water=0;

        for(int i=0;i<n;i++){

            int lm=0;
            int rm=0;

            for(int j=0;j<=i;j++){
                lm=Math.max(lm,height[j]);
            }

            for(int j=i;j<n;j++){
                rm=Math.max(rm,height[j]);
            }

            water+=Math.min(lm,rm)-height[i];
        }
        return water;
    }
}