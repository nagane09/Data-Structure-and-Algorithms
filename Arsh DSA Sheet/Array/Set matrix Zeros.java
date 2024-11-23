import java.util.*;

class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> zeroRows=new HashSet<>();
        HashSet<Integer> zeroCols=new HashSet<>();

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(zeroRows.contains(i)||zeroCols.contains(j))
                {
                    matrix[i][j]=0;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Solution sc=new Solution();
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
        for(int i=0;i<matrix.size();i++)
        {
            ArrayList<Integer> row = matrix.get(i); 
            for(int j=0;j<matrix.size();j++)
            {
                System.out.print(row.get(j)+" ");
            }
        }
        System.out.println();
    }
}
