//SLIDING WINDOW 
/*
1 2 3 4 5 6 1
        s s  s  = store sum 
-------       < window slides
1  ------- 6 1    < sum add[left] and sub [right]  > store max
1 2  ------- 1     < add add[left] and sub r ....
    
    
    */
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        //
        int len=cardPoints.length;
        int sum=0;
        //initialize pointers 
        int l = 0; int r = len-k;
       
        // sum of last k elements 
        for(int i = r ; i<len;i++){
            sum+=cardPoints[i];
        }
        System.out.println("sum: "+sum);
        // assign sum of last k elements to maxSum
        int maxS = sum;
        // check right , do not allow outofbounds
        while(r<len){
           //from left=0 and r=(len-k) we are moving window to right, so add in sum left element, and sub right thus
            // here we consider a[0](first el of array),--- a[l-2] a[l-1] last two
            sum = sum+cardPoints[l]-cardPoints[r];
            maxS = Math.max(maxS,sum);
             l++; r++;
        }
         
        return maxS;
        
    }
}