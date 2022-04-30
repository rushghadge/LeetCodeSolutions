//BDF SOLUTION
class Solution {
    //hm Node, NewCloned 
    HashMap<Node, Node> v = new HashMap<>();
    public Node cloneGraph(Node node) {
    
        //check for null always
        if(node ==null){
            return node;
        }

        // MAP of original node and cloned one 
        HashMap<Node, Node> v = new HashMap<>();
        
        // queue 
        LinkedList<Node> q = new LinkedList<>();
        // add first node 
        q.add(node);
        // add first node in hm , with empty meighbours
        v.put(node, new Node(node.val, new ArrayList()));
        
        // unless all nodes are traversed 
        while(!q.isEmpty()){
            //remove element 
            Node n = q.remove();
            //scan all neighbours of the removed elemeny 
            for(Node nbr: n.neighbors){
                if(!v.containsKey(nbr)){
                    //add in queue
                    q.add(nbr);
                    v.put(nbr, new Node(nbr.val, new ArrayList()));
                    
                }
                v.get(n).neighbors.add(v.get(nbr));
                
            }
            
            
            
            
        }
            
            return v.get(node);
        
        
        
        
        
        
    }
}