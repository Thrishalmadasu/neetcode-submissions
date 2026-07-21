class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones){
            maxHeap.add(i);
        }

        while(maxHeap.size() > 1){
            int max = maxHeap.poll();
            int nextMax = maxHeap.poll();

            int diff = max-nextMax;

            if(diff!=0) maxHeap.add(diff);
        }

        if(maxHeap.size()==0) return 0;
        return maxHeap.peek();
    }
}
