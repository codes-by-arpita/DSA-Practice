class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set=new HashSet<>();

        int n=nums.length;

        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k = j+1; k<n ;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List <Integer> trip= Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(trip);
                        set.add(trip);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}