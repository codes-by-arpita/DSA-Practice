class Solution {
    public int maxDigitRange(int[] nums) {
        int mr=-1;

        for(int n:nums){
            int range = digitrange(n);
            mr=Math.max(mr,range);
        }

        int sum=0;
        for(int n:nums){
            if(digitrange(n)==mr){
                sum+=n;
            }
        }
        return sum;
    }
    private int digitrange(int n){
        int min=9;
        int max=0;

        while(n>0){
            int d=n%10;
            min=Math.min(min,d);
            max=Math.max(max,d);
            n/=10;
        }
        return max-min;
    }
}