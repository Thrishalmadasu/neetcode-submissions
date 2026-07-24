class Solution {
    public int leastInterval(char[] tasks, int n) {
        int totalTime = 0;
        int[] freq = new int[26];
        for(char c : tasks){
            freq[c-'A']++;
        }

        int totalTasks = tasks.length;
        while(totalTasks > 0){
            Arrays.sort(freq);
            int cnt = n+1;
            for(int i=25; i>=0; i--){
                if(freq[i] > 0){
                    freq[i]--;
                    cnt--;
                    totalTasks--;

                    if(cnt == 0) break;
                }
            }
            totalTime+=(n+1);
            if(totalTasks == 0) totalTime-=cnt;
        }

        return totalTime;
    }
}
