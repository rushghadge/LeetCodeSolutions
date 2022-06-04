/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */


public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1;
        int r = n;
        int res=-1;
        while(l < r){
        System.out.println("l:"+l+ " r "+r);
          int mid = l+ (r-l) / 2; 
          System.out.println("MID: "+mid);
            if(isBadVersion(mid)){
               System.out.println("Found bad at : "+mid);
               //Set to mid, because mid could be firse bad version, we have to consoder this
                r= mid;
              
            else{
                l=mid+1;
            }
            
        }
        return l;
        
    }
}