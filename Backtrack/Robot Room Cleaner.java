/**
 * // This is the robot's control interface.
 * // You should not implement it, or speculate about its implementation
 * interface Robot {
 *     // Returns true if the cell in front is open and robot moves into the cell.
 *     // Returns false if the cell in front is blocked and robot stays in the current cell.
 *     public boolean move();
 *
 *     // Robot will stay in the same cell after calling turnLeft/turnRight.
 *     // Each turn will be 90 degrees.
 *     public void turnLeft();
 *     public void turnRight();
 *
 *     // Clean the current cell.
 *     public void clean();
 * }
 */

class Solution {
  // going clockwise : 0: 'up', 1: 'right', 2: 'down', 3: 'left'
 // int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
  Set<Pair<Integer, Integer>> visited = new HashSet();
  Robot robot;

  public void goBack() {
    robot.turnRight();
    robot.turnRight();
    robot.move();
    robot.turnRight();
    robot.turnRight();
  }

  public void backtrack(int x, int y, int d) {
    visited.add(new Pair(x, y));
    robot.clean();
    // going clockwise : 0: 'up', 1: 'right', 2: 'down', 3: 'left'
    for (int i = 0; i < 4; ++i) {
     int nx = x; int ny=y;
        int nd=(d+i)%4; // since there are only 4, then mod it with 4 assumung if d=2,i=3, then nd=1
        if(nd==0)
            nx-=1;
        if(nd==1)
            ny+=1;
        if(nd==2)
            nx+=1;
        if(nd==3)
            ny-=1;
        if(!visited.contains(new Pair(nx,ny)) && robot.move()){
            backtrack(nx,ny,nd);
            goBack();
        }
        
        robot.turnRight();
        
        
    }
  }

  public void cleanRoom(Robot robot) {
    this.robot = robot;
    backtrack(0, 0, 0); // x, y, direction
  }
}