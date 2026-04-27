class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        
        for(int i : nums){
            int dig=0;

            while(i>0){
                i/=10;
                dig++;
            }
            if(dig%2==0){
                ans++;
            }
        }
        return ans;
    }
}
