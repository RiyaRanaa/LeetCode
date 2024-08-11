class Solution {
    private static int [] direction={-1,0,1,0,-1};
    public int minDays(int[][] grid) {
        if(isDisconn(grid)){
            return 0;
        }
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    grid[i][j]=0;
                    if(isDisconn(grid)){
                        return 1;
                    }
                    grid[i][j]=1;
                }
            }
        }
        return 2;
    }
    private boolean isDisconn(int [][]grid){
        int m=grid.length;
        int n=grid[0].length;
        boolean[][]visit=new boolean[m][n];
        int islandCount=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && !visit[i][j]){
                    if(islandCount > 0) return true;
                    dfs(grid,visit,i,j);
                    islandCount++;
                }
            }
        }
        return islandCount !=1;
    }
    private void dfs(int [][]grid, boolean[][]visit,int i,int j){
        int m=grid.length;
        int n=grid[0].length;
        visit[i][j]=true;

        for(int d=0;d<4;d++){
            int x=i+direction[d];
            int y=j+direction[d+1];
            if(x>=0 && y>=0 && x<m && y<n && grid[x][y]==1 && !visit[x][y]){
                dfs(grid, visit, x, y);
            }
        }
    }
}