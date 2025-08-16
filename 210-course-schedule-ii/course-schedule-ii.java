class Solution {
    public int[] findOrder(int courses, int[][] prereq) {
        int []  ans = new int [courses];
        int curCount = 0;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0;i<courses;i++){
            adj.add(new ArrayList<>());
        }
        int [] indegree = new int[courses];

        for(int [] arr:prereq){
            adj.get(arr[1]).add(arr[0]);
            indegree[arr[0]]++;
        }
        Queue<Integer> que = new LinkedList<>();

        for(int i= 0;i< courses;i++){
            if(indegree[i]==0){
                que.add(i);
                ans[curCount++] = i;
            }
        }
       
       while(!que.isEmpty()){
            int curIdx = que.poll();

            for(int i : adj.get(curIdx)){
                indegree[i]--;
                if(indegree[i] == 0){
                    que.add(i);
                    ans[curCount++] = i;
                }
            }
       }
       if(curCount == courses)return ans;
       return new int[0];
    }
}