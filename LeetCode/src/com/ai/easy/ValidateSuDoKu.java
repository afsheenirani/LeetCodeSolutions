package com.ai.easy;

import java.util.*;

public class ValidateSuDoKu {
    public boolean isValidSudoku(char[][] board) {
        // Checking lengths
        if(board == null) 
            return(false);
            
        if(board.length != 9) 
            return(false);
        
        for(int i=0; i<board.length; i++) {
            if(board[i].length !=9 )
                return(false);
        }
        
        // Check for valid character values 0-9 and '.'
        
        // Checking sum totals
        for(int i=0; i<9; i++) {
            Map<Character,Integer> row = new HashMap<>();
            for(int j=0; j<9; j++) {
                if(board[i][j] == '.')
                    continue;
                
                if(row.containsKey(board[i][j])) {
                    return(false);
                }
                else {
                    row.put(new Character(board[i][j]), new Integer(0));
                }
            }
            
            Map<Character,Integer> col = new HashMap<>();
            for(int j=0; j<9; j++) {
                if(board[j][i] == '.')
                    continue;
                
                if(col.containsKey(board[j][i])) {
                    return(false);
                }
                else {
                    col.put(new Character(board[j][i]), new Integer(0));
                }
            }
        }
        
        for(int i=0; i< 9; i+=3) {
            for(int j=0; j<9; j+=3) {
                Map<Character,Integer> square = new HashMap<>();
                for(int k=0; k<3; k++) {
                    for(int l=0; l<3; l++) {
                        char cell = board[i+k][j+l];
                        if(cell == '.')
                            continue;
                        
                        if(square.containsKey(cell)) {
                            return(false);
                        }
                        else {
                            square.put(new Character(cell), new Integer(0));
                        }
                    }
                }
            }
        }
        
        return(true);
    }
}
