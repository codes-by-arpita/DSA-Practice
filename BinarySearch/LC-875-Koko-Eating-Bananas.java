class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high=0,low=1;
        for(int i:piles){
            high = Math.max(high,i);
        }

        while(low<=high){
            int mid = low+(high-low)/2;
            long Th=0 ;
            for(int p:piles){
                Th+=(p+mid-1)/mid;  
            }
            if(Th<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
