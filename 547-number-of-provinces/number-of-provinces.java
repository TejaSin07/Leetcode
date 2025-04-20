class Solution {
    public int findCircleNum(int[][] isConnected) {
        int len = isConnected.length;
        boolean []  visited = new boolean[len];
        int proviences =0;
        for(int i = 0;i< len;i++){
            if(visited[i] != true ){
                proviences++;
                dfs(i,isConnected,visited);
            }
        }
        return proviences;

    }

    public void dfs(int node,int[][] arr,boolean []  visited){
        visited[node] = true;
        for(int i = 0;i<arr.length;i++){
            if(!visited[i] && arr[node][i]==1){
                dfs(i,arr,visited);
            }
        }
    }
}