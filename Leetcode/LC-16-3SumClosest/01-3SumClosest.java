import java.util.Arrays;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);

        int closest =nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;

            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];

                if(Math.abs(sum-target)<Math.abs(closest-target)){
                    closest=sum;
                }
                if(sum<target){
                    l++;
                }else if(sum>target){
                    r--;
                }else{  //(sum==target then sum is the closest because it is the target)
                    return sum;
                }
            }
        }
        return closest;
    }
}