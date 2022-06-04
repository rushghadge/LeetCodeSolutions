class Solution {
    public List<String> letterCombinations(String digits) {
          List<String> res = new ArrayList<String>();
        if(digits.length() == 0 || digits == ""){
            return res; 
        }
     String[] map = {
         "0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
         
     };
     
       String curStr = "";
        
        backTrack(digits, res, curStr,0 ,map);
        return res;
        
        
    }
    
    public void backTrack(String digits,List<String> res, String curStr,int index ,String[] map){
        // if curr len == len needed , append in OP
        if(curStr.length() == digits.length()){
            res.add(curStr);
            return;
        }
        //based on index 0, getch letters related to that digit...
        // -'0' converts it to decimal / integer 
        String curLetters =map[digits.charAt(index) -'0'];
        // recursive call, append the letter at i, and try to map with next digits  char 
        for(int i=0;i<curLetters.length();i++){
            backTrack(digits, res, curStr +curLetters.charAt(i),index+1,map);
        }
        
        
    }
}