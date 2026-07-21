class Solution {

    public boolean canEat(int[] piles, int k, int h){
        int reqHrs = 0;
        for(int i : piles){
            reqHrs+=(i+k-1)/k;
        }
        return reqHrs <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        
        int min = 1, max = piles[0];

        for(int i : piles){
            max = Math.max(max, i);
        }

        while(min <= max){
            int mid = min + (max-min)/2;
            if(canEat(piles, mid, h)) max = mid-1;
            else min = mid + 1;
        }

        return min;
    }
}
