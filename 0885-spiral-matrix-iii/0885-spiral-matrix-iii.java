class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        List<int[]> result=new ArrayList<>();
        int[][]dir={{0,1},{1,0},{0,-1},{-1,0}};
        int r=rStart, c=cStart, dirIndex=0, step=1,visit=0;
        while(visit < rows*cols){
            for(int i=0;i<2;i++){
                for(int j=0;j<step;j++){
                    if(r>=0 && r<rows && c>=0 && c<cols){
                        result.add(new int[]{r,c});
                        visit++;
                    }
                    if(visit == rows*cols) break;
                    r +=dir[dirIndex][0];
                    c +=dir[dirIndex][1];
                }
                if(visit == rows*cols) break;
                dirIndex=(dirIndex+1)%4;
            }
            step++;
        }
        return result.toArray(new int[result.size()][]);
    }
}