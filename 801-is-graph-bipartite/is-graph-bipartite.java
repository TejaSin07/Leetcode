class Solution {
    public boolean isBipartite(int[][] graph) {
        int row = graph.length;
        boolean vis [] = new boolean[row];
        int color [] = new int[row];

        for (int i = 0; i < row; i++) {
            if (!vis[i]) {
                vis[i] = true;
                color[i] = 0;
                if (!helper(i, graph, vis, row, color)) return false;
            }

    }

        return true;
    }

    private static boolean helper(int idx,int[][] graph,boolean[] vis,int row,int[] color){
        boolean status = true;
        for(int i = 0;i<graph[idx].length;i++){
            int curNode = graph[idx][i];
            if(vis[curNode] == true && color[curNode] == color[idx]){
                return false;
            }
            color[curNode] = Math.abs(color[idx]-1);
            if(!vis[curNode]){
                vis[curNode] = true;
                if(!helper(curNode,graph,vis,row,color))return false;
               
            }
        }
        return true;
    }
}