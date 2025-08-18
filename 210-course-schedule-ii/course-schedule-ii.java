class Solution {
    public int[] findOrder(int courses, int[][] prereq) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i =0;i< courses;i++){
            adj.add(new ArrayList<>());
        }

        for(int [] temp : prereq){
            adj.get(temp[1]).add(temp[0]);
        }

        boolean [] vis = new boolean[courses];
        boolean [] pathVis= new boolean[courses];

        Stack<Integer> stk = new Stack<>();

        for(int i = 0;i<courses;i++){
            if(!vis[i]){
                dfs(i,stk,vis,pathVis,adj);
            }
        }

        int [] sol = new int[courses];
        int i  = 0;
        if(stk.size() != courses)return new int[0];
        while(!stk.isEmpty()){
            sol[i++] = stk.pop();
        }
        return sol;
    }

    private static boolean dfs(int node,Stack<Integer>stk,boolean[] vis,boolean[] pathVis,ArrayList<ArrayList<Integer>> adj){
        vis[node] = true;
        pathVis[node] = true;

        for(int childNode : adj.get(node)){
            if(!vis[childNode] ){
                if(dfs(childNode,stk,vis,pathVis,adj)){
                    return true;
                }
            }
            else if(pathVis[childNode]){
                return true;
            }
        }
        stk.push(node);
        pathVis[node] = false;
        return false;
    }
}