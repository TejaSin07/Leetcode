class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = graph.length;
        int [] indegree = new int [V];
        for(int i = 0;i< V;i++){
            adj.add(new ArrayList<>());
        }
        int count = 0;
       
        for(int [] arr : graph ){
            for(int i : arr ){
                adj.get(i).add(count);
                indegree[count]++;
            }
            count++;
        }
        Queue<Integer> que = new LinkedList<>();

        for(int i = 0;i < V;i++){
            if(indegree[i]== 0){
                que.add(i);
                ans.add(i);
            }
        }

        while(!que.isEmpty()){
            int curNode = que.poll();
            for(int node : adj.get(curNode)){
                indegree[node]--;
                if(indegree[node]==0){
                    que.add(node);
                    ans.add(node);
                }
            }
        }

        Collections.sort(ans);
        return ans;
    }
}