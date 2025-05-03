class Solution {
    public int[] findOrder(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for(int i = 0;i< V;i++){
            arr.add(new ArrayList<>());
        }
//try with uncomenting below line
        for(int [] temp : edges){
            arr.get(temp[0]).add(temp[1]);
            // arr.get(temp[1]).add(temp[0]);
        }

        int [] indgre =new int[V];
        for(int i = 0;i<V;i++){
            for(int tmp: arr.get(i)){
                indgre[tmp]++;
            }
        }
        Queue<Integer>que = new LinkedList<>();
        for(int i =0;i< V;i++){
            if(indgre[i]==0)que.add(i);
        }
        int [] res = new int[V];
        int i = V-1;
        int count=0;
        //int i = 0;
        while(!que.isEmpty()){
            int node = que.peek();
            que.remove();
            res[i--] = node;
            count++;
            //res[i++] = node

            for(int tmp : arr.get(node)){
                indgre[tmp]--;
                if(indgre[tmp]==0)que.add(tmp);
            }
        }
        if(count == V)return res;
        System.gc();
        return new int[0];
    }
}