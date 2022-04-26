/*
since rows n col are in ascending form, we consider the row [0], r[1], r[2] , and col[0] for all, and store the val 
in min heap

next, we pop k-1 val from heap 
until pointer reaches c-1.

in the last we return final value by popping value from heap




*/


class Solution {
    class Node{
        public int r;
        public int c;
        public int v;
        public Node(int r, int c, int v){
            this.r = r;
            this.c = c;
            this.v = v;
        }
        
    }
    public int kthSmallest(int[][] matrix, int k) {
        
    // Find len of matric
        int l = matrix.length;
        System.out.println("len: "+l);
        
        PriorityQueue<Node> minH = new PriorityQueue<>(new Comparator<Node>(){
            @Override
            public int compare(Node n1, Node n2){
                // sort asc , min val first
                return n1.v - n2.v;
            }
            
        }
        
        );
        
        // initialise heap with all 1st values in row 0, r 1,r  2,
        
        for(int i = 0; i< l; i++){
            // add node in heap, 
            minH.add(new Node(i,0,matrix[i][0]));
            
        }
        
        // Now we hav to poll / remove values from heap,if value from r0c0 is removed
        // we move to r0 c1 and add value present at r0c1 in heap!!
        // if k =7, then pop 6 times 
        for(int i = 0; i < (k-1); i++){
            // Pop node
            Node n = minH.poll();
            // thus we add new Node 
            //check for index 
            if(n.c < l-1)
            minH.add(new Node(n.r, n.c+1, matrix[n.r][n.c+1]));
            
        }
        // return the last kth value by popping from heap
        Node n = minH.poll();
        
        return n.v;
     
        
    }
}