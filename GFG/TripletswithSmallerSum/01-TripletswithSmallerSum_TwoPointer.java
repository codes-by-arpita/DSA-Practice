import java.util.Arrays;
class Solution {
    int countTriplets(int sum, int arr[]) {
        Arrays.sort(arr);
        int n=arr.length;
        int c=0;
        for(int i =0;i<n-2;i++){
            int l=i+1;
            int r=n-1;
            
            while(l<r){
                int s=arr[i]+arr[l]+arr[r];
                if(s<sum){
                    c+=(r-l);
                    l++;
                }else{
                    r--;
                }
                
            }
        }
        return c;
    }
}