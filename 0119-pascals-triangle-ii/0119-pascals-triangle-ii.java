class Solution {

    // BRUTE FORCE

    // public static long nCr(int n, int r) {
    //      long res = 1;
    //     // calculating nCr:
    //     for (int i = 0; i < r; i++) {
    //         res = res * (n - i);
    //         res = res / (i + 1);
    //     }
    //     return res;
    // }
    // public List<Integer> getRow(int rowIndex) {
        // List<Integer> row = new ArrayList<>();
        // // Generate the specified row of Pascal's Triangle
        // for (int c = 0; c <= rowIndex; c++) {
        //     row.add((int)nCr(rowIndex, c));
        // }
        
        // return row;
    // }


        // OPTIMAL
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long ans = 1;
        // Generate the row
        for (int i = 0; i <= rowIndex; i++) {
            row.add((int)ans); // Add the current element to the row
            ans = ans * (rowIndex - i) / (i+1); // Update ans for the next element
        }
        return row;
    }
}