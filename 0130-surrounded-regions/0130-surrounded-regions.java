// class Solution {
//     public void solve(char[][] board) {
        
//     }
// }
class Solution {
    public void solve(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int arr[][] = new int[n][m];

        for (int i = 0; i < m; i++) {

            // first row
            if (arr[0][i] != 1 && grid[0][i] == 'O') {
                dfs(arr, grid, 0, i);
            }

            // last row
            if (arr[n - 1][i] != 1 && grid[n - 1][i] == 'O') {
                dfs(arr, grid, n - 1, i);
            }
        }

        for (int i = 0; i < n; i++) {

            // first column
            if (arr[i][0] != 1 && grid[i][0] == 'O') {
                dfs(arr, grid, i, 0);
            }

            // last column
            if (arr[i][m - 1] != 1 && grid[i][m - 1] == 'O') {
                dfs(arr, grid, i, m - 1);
            }
        }

        // remaining O -> X
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if (grid[i][j] == 'O' && arr[i][j] != 1) {
                    grid[i][j] = 'X';
                }
            }
        }
    }

    void dfs(int[][] arr, char grid[][], int row, int col) {

        int r[] = {0, 0, -1, 1};
        int c[] = {-1, 1, 0, 0};

        arr[row][col] = 1;

        for (int i = 0; i < 4; i++) {

            int nr = row + r[i];
            int nc = col + c[i];

            if (nr >= 0 && nc >= 0 &&
                nr < grid.length &&
                nc < grid[0].length &&
                arr[nr][nc] == 0 &&
                grid[nr][nc] == 'O') {

                dfs(arr, grid, nr, nc);
            }
        }
    }
}