//     l   r
//   t 0 1 2
//     3 4 5
//     6 7 8 b
// l = 0, r=m.l-1;
// while(l<r)
//     for(i =  0;i< r; i++)
// tl = m[t][l+i];
// m[t][l+i] = m[b-i][l]
// m[b][l+i]= m[b][r-i]
// m[b][r-i] = m[t-i][r]
// m[t-i][r] = tl;



















class Solution {
    public void rotate(int[][] matrix) {
    //int r = matrix.length;
   //  int c = matrix[0].length();
     int l = 0; int r = matrix.length-1;
        
      while(l<r){
       System.out.println("l: "+l);
      System.out.println("r: "+r);

        for(int i=0;i<r-l;i++){
        System.out.println("i  : "+i);

              int t=l; int b=r;
            int tl= matrix[t][l+i];
            matrix[t][l+i] = matrix[b-i][l];
            matrix[b-i][l]=matrix[b][r-i];
            matrix[b][r-i]=matrix[t+i][r];
            matrix[t+i][r]=tl;
            
        }  
          l+=1;r-=1;
          
          
      }//whike
        
        
        
        
        
        
        
        
        
    }
}