class KthLargest {

    PriorityQueue<Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            pq.add(num);
        }
        this.k = k;
    }
    
    public int add(int val) {
        pq.add(val);
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<k; i++){
            q.add(pq.poll());
        }

        int ans = pq.peek();

        while(!q.isEmpty()){
            pq.add(q.poll());
        }

        return ans;
    }
}
