/*
5                        n 
[[0,1],[1,2],[3,4]]     edges

// adj list [[1], [0,2], [1]  [4] [3]
nodes          0    1      2   3  4


*/


class Solution {
    public int countComponents(int n, int[][] edges) {
        int count = 0;
        int[] visited = new int[n];
        //generate adj  list
        List<Integer>[] adj = new ArrayList[n];
        // instantiate with list
        for(int i = 0; i< n; i++){
            adj[i]= new ArrayList<Integer>();
            
        }
        //map the edges for respective nodes 
        for(int i = 0 ; i < edges.length; i++){
            adj[edges[i][0]].add(edges[i][1]);
            adj[edges[i][1]].add(edges[i][0]);
            
        }
        
        // generated ADJ list!
        for(int i=0;i<adj.length;i++)
        System.out.println("AJlist "+adj[i]);
        
        // goal is to traverse the list and call dfs and mark visited. update count if node is unvisited thus 
        for(int i = 0 ; i <adj.length;i++){
            // start from first node 
            if(visited[i]== 0){
               count++;
            
                dfs(adj, visited, i);
            }
            
        } 
        
        return count; 
    }
    
    public void dfs(List<Integer>[] adj, int[] visited, int node){
        //mark visited of node 
        visited[node] = 1;
        // for each nodes neighbour check visited if not then call dfs recursively 
        
         for (int i = 0; i < adj[node].size(); i++) { 
            if (visited[adj[node].get(i)] == 0){
                
              dfs(adj,visited,adj[node].get(i));

            }//if 
        }//for
        
    } //method
   
}