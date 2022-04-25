 

class Solution {
    public String longestDiverseString(int a, int b, int c) {
    //String buffer to store result  
    StringBuilder sb = new StringBuilder();
    //holds an array for a b c, for a [0, countofA],  b[1, count B] Sort queue to get max count first
    PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> y[1] - x[1]);
    pq.add(new int[] {0, a}); pq.add(new int[] {1, b}); pq.add(new int[] {2, c});
// loop breaks if most or second most countof char exhausts
while (true) {

	int[] most = pq.poll(); // returns [2,7 (count of c)]
    System.out.println("most [0] :"+most[0]+" most[1] "+most[1]);
	int N = sb.length();
    System.out.println("len :"+N);
    
    
    // try to fetch actual char based on asci 
	char ch = (char) (most[0] + 'a');
    System.out.println("ch :"+ch);
    
    
	if (most[1] == 0) break;  // break when largest char reaches zero

	// append char to result, check 2 prev values, they should not be equal to current char 
	if (N < 2 || (sb.charAt(N - 2) != ch || sb.charAt(N - 1) != ch)) {
        System.out.println("IN IF ");
		sb.append(ch);
		--most[1];
         System.out.println("RES  "+sb.toString());
	} else {  // otherwise, try to add the one with second largest number
        System.out.println("IN ELSE");

		if (pq.peek()[1] == 0) break;  // break when second largest char reaches zero

		int[] secondMost = pq.poll();
        System.out.println("secondMost[0] "+secondMost[0] +" secondMost[1] "+secondMost[1]);

		ch = (char) (secondMost[0] + 'a');
        System.out.println("Ch "+ ch);

		sb.append(ch);
		--secondMost[1];
		pq.add(secondMost);
        System.out.println("RES  "+sb.toString());
	}

	pq.add(most);

}

return sb.toString(); 
    }
}