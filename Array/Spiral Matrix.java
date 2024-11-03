class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0)
        {
            return result;
        } 

        int srow = 0, erow = matrix.length - 1;
        int scol = 0, ecol = matrix[0].length - 1;

        while (srow <= erow && scol <= ecol) {
            // Traverse from left to right
            for (int j = scol; j <= ecol; j++) {
                result.add(matrix[srow][j]);
            }
            srow++; // Move down to the next row

            // Traverse from top to bottom
            for (int i = srow; i <= erow; i++) {
                result.add(matrix[i][ecol]);
            }
            ecol--; // Move left to the previous column

            if (srow <= erow) {
                // Traverse from right to left
                for (int j = ecol; j >= scol; j--) {
                    result.add(matrix[erow][j]);
                }
                erow--; // Move up to the previous row
            }

            if (scol <= ecol) {
                // Traverse from bottom to top
                for (int i = erow; i >= srow; i--) {
                    result.add(matrix[i][scol]);
                }
                scol++; // Move right to the next column
            }
        }
        return result;
    }
}
