package com.ai.medium;

public class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] zeroCols = new boolean[n];
        for(int i = 0; i < m; i++) {
            boolean zeroRow = false;
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    zeroCols[j] = true;
                    zeroRow = true;
                }
            }
            
            if(zeroRow) {
                for(int k=0;k<n;k++) {
                    matrix[i][k] = 0;
                }
            }
        }
        
        for(int j=0; j<n; j++) {
            if(zeroCols[j]) {
                for(int i=0; i<m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }	
}
