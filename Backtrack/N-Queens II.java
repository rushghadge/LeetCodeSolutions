class Solution {
    private int size;
    
    public int totalNQueens(int n) {
        size = n;
        return backtrack(0, new HashSet<>(), new HashSet<>(), new HashSet<>());
    }
    
    private int backtrack(int row, Set<Integer> diagonals, Set<Integer> antiDiagonals, Set<Integer> cols) {
        // Base case - N queens have been placed
 System.out.println("in method row "+row +" diagonals "+diagonals+ " antiDiagonals "+antiDiagonals +" cols "+cols );
// if row = 4 means we placed all Q, return 1 
        if (row == size) {
            System.out.println("HI ");
            return 1;
        }
        // else 
        int solutions = 0;
        // for each row, check placement for every column 
        for (int col = 0; col < size; col++) {
           System.out.println("Start of for "+ col );

            int currDiagonal = row - col;
            int currAntiDiagonal = row + col;
 // backtrack if does not satisfy condition
   //constraint         
            // If the queen is not placeable
            if (cols.contains(col) || diagonals.contains(currDiagonal) || antiDiagonals.contains(currAntiDiagonal)) {
                 System.out.println("Q not placed " );
 System.out.println("Not placed as  "+" currDiagonal "+currDiagonal+ " currAntiDiagonal "+currAntiDiagonal +" cols "+col );

                continue;    
            }
            
 // else add column in set. 
            // "Add" the queen to the board
            cols.add(col);
            diagonals.add(currDiagonal);
            antiDiagonals.add(currAntiDiagonal);
 System.out.println("add Q row "+row +" diagonals "+diagonals+ " antiDiagonals "+antiDiagonals +" cols "+cols );
                 //System.out.println("solutions "+ solutions);

 // Move on to the next row with the updated board state
            solutions += backtrack(row + 1, diagonals, antiDiagonals, cols);
                 System.out.println("solutions "+ solutions);

            // "Remove" the queen from the board since we have already
            // explored all valid paths using the above function call
             System.out.println("B4 Removing   " +cols +diagonals+antiDiagonals );

            cols.remove(col);
            diagonals.remove(currDiagonal);
            antiDiagonals.remove(currAntiDiagonal); 
             System.out.println("Af Removing   " +cols +diagonals+antiDiagonals );

 System.out.println("end for "+ col );

        }
        
        return solutions;
    }
}