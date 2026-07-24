class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for(int i=0; i<=n; i++){
            adj.add(new ArrayList<int[]>());
        }

        for(int[] time : times){
            adj.get(time[0]).add(new int[]{time[1], time[2]});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);

        pq.add(new int[]{k, 0});

        int[] timeTaken = new int[n+1];
        Arrays.fill(timeTaken, Integer.MAX_VALUE);

        timeTaken[k] = 0;
        while(!pq.isEmpty()){
            int[] currNode = pq.poll();
            int u = currNode[0];
            int t = currNode[1];

            if(t > timeTaken[u]) continue;

            for(int[] time : adj.get(u)){
                int v = time[0];
                int d = time[1];

                if(timeTaken[v] > t+d){
                    pq.add(new int[]{v, t+d});
                    timeTaken[v] = t+d;
                }
            }
        }

        int max = 0;
        for(int i=1; i<=n; i++){
            if(timeTaken[i] == Integer.MAX_VALUE) return -1;
            max = Math.max(max, timeTaken[i]);
        }

        return max;
    }
}
