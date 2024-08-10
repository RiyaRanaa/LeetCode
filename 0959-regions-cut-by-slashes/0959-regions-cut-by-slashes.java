class Solution {
    class UnionF{
        int []parent;
        int[]rank;
        int count;

        public UnionF(int size){
            parent=new int[size];
            rank=new int[size];
            count=size;
            for(int i=0;i<size;i++){
                parent[i]=i;
                rank[i]=1;
            }
        }
        public int find(int x){
            if(x != parent[x]){
                parent[x]=find(parent[x]);
            }
            return parent[x];
        }
        public void union(int x,int y){
            int rootX=find(x);
            int rootY=find(y);
            if(rootX != rootY){
                if(rank[rootX] > rank[rootY]){
                    parent[rootY]=rootX;
                }
                else if(rank[rootX] < rank[rootY]){
                    parent[rootX]=rootY;
                }
                else{
                    parent[rootY]=rootX;
                    rank[rootX]++;
                }
                count--;
            }
        }
        public int getCount(){
            return count;
        }
    }
    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        int size = n * n * 4;
        UnionF uf = new UnionF(size);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int index = 4 * (i * n + j);
                char c = grid[i].charAt(j);;
                if (c == '/') {
                    uf.union(index + 0, index + 3);
                    uf.union(index + 1, index + 2);
                } else if (c == '\\') {
                    uf.union(index + 0, index + 1);
                    uf.union(index + 2, index + 3);
                } else {
                    uf.union(index + 0, index + 1);
                    uf.union(index + 1, index + 2);
                    uf.union(index + 2, index + 3);
                }
                if (j + 1 < n) {
                    uf.union(index + 1, index + 7);
                }
                if (i + 1 < n) {
                    uf.union(index + 2, index + 4 * n + 0);
                }
            }
        }
        return uf.getCount();
    }
}