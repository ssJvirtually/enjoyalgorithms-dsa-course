import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {


    public static void main(String[] args) {

        int[][] rott = {{2,1,1},{1,1,1},{0,1,2}};

        System.out.println(orangesRotting(rott));

    }

    public static int orangesRotting(int[][] grid) {

        int freshOranges = 0;

        Queue<Integer[]> rotten = new LinkedList();

        int m = grid.length;
        int n = grid[0].length;

        // count fresh oranges and rotten oranges and push rotten oranges to queue;
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1) {
                    freshOranges++;
                } else if (grid[i][j] == 2) {
                    rotten.add(new Integer[] { i, j }); // push rotten orange position to the queue
                }
            }
        }

        int minCount = 0;

        while (!rotten.isEmpty() && freshOranges > 0) {

            int[][] directions = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } }; // directions to visit
            int size = rotten.size();
            // for rotten oranges go in all directions and keep adding the newly rotted
            // oranges to the queue
            for (int i = 0; i < size; i++) {

                Integer[] cell = rotten.poll();
                int row = cell[0];
                int col = cell[1];

                for (int[] direction : directions) {
                    int x = row + direction[0];
                    int y = col + direction[1];

                    if (x < 0 || y < 0 || x == m || y == n || grid[x][y] != 1) {
                        continue;
                    }
                    freshOranges--;
                    grid[x][y] = 2;
                    rotten.add(new Integer[] { x, y });
                }
            }
            minCount++;
        }

        // if fresh oranges count greater than 0 that mean some orange sorrounded by the
        // empty cells which cant be rotted
        if (freshOranges > 0) {
            return -1;
        }

        return minCount;
    }
}
