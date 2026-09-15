class Solution {
    private long calculatehours(int[] piles, int speed){
        long totalh=0;
        for(int bananas:piles){
            totalh+=(long)Math.ceil((double)bananas/speed);
        }
        return totalh;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxpile=Arrays.stream(piles).max().getAsInt();
        int low=1,high=maxpile;
        int ans=maxpile;
        while(low<=high){
            int mid=(low+high)/2;
            long totalh=calculatehours(piles,mid);
            if(totalh<=h){
                ans=mid;
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }
        return ans;

        
    }
}