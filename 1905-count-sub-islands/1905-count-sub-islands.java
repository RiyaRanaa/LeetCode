class Solution {
    int[] delr = { 1, -1, 0, 0 };
    int[] delc = { 0, 0, 1, -1 };

    private void dfs(int[][] grid1, int[][] grid2, int i, int j, boolean[] flag) {
        if (grid1[i][j] == 0) {
            flag[0] = false;
            return;
        }

        grid2[i][j] = 0;
        int row = grid1.length;
        int col = grid1[0].length;
        for (int k = 0; k < 4; k++) {
            int r = i + delr[k];
            int c = j + delc[k];
            if (r < row && r >= 0 && c < col && c >= 0 && grid2[r][c] == 1) {
                dfs(grid1, grid2, r, c, flag);
            }
        }
    }

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int row = grid1.length;
        int col = grid1[0].length;

        // sub-Iland count...
        int sub = 0;
        for (int i = 0; i < row; i++) {
            boolean[] flag = { true };
            for (int j = 0; j < col; j++) {
                if (grid2[i][j] == 1) {
                    dfs(grid1, grid2, i, j, flag);
                    if (flag[0]) {
                        sub++;
                    }
                    flag[0] = true;
                }
            }
        }
        return sub;
    }
}