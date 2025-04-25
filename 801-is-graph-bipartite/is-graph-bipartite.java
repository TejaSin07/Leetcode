class Solution {
    public boolean isBipartite(int[][] graph) {
        int len = graph.length;
        int visited [] = new int[len];
        Arrays.fill(visited,-1);
        
        for(int i = 0;i<len;i++){
            if(visited[i] == -1){
                visited[i] =0;
                if(!dfs(i,visited,graph)){
                    return false;
                }
            }
        }
        return true;
        
    }

    public boolean dfs(int cur,int[] visited,int [][] graph){
        
        for(int next : graph[cur]){
            if( visited[next] == -1){
                visited[next] = 1 - visited[cur];
                if(!dfs(next,visited,graph)){
                    return false;
                }

            }
            else if (visited[cur] == visited[next]){
                return false;
            }
        }
        return true;
    }
}