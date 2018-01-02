package roulette;

import java.util.*;
import java.io.*;

public class Wheel {
    
    public Wheel() { }
    
    public void spin() {
        int i, j;
        
        record = new int[NUM_SPINS][NUM_TYPES];

        Random generator = new Random();
        for( i=0; i<NUM_SPINS; i++ ) {
            record[i][NUMBER] = generator.nextInt(37) - 1;
            
            // 0
            if( record[i][NUMBER] == ZERO1 )
                for( j=1; j<NUM_TYPES; j++ )
                    record[i][j] = ZERO1;
            else if( record[i][NUMBER] == ZERO2 )
                for( j=1; j<NUM_TYPES; j++ )
                    record[i][j] = ZERO2;
            else {
                
                if( record[i][NUMBER] % 2 == 0 ) record[i][EVEN_ODD] = EVEN;
                else record[i][EVEN_ODD] = ODD;

                if( record[i][NUMBER] == 1 || record[i][NUMBER] == 3 || record[i][NUMBER] == 5 || record[i][NUMBER] == 7 || record[i][NUMBER] == 9 || record[i][NUMBER] == 12 || record[i][NUMBER] == 14 || record[i][NUMBER] == 16 || record[i][NUMBER] == 18 || record[i][NUMBER] == 19 || record[i][NUMBER] == 21 || record[i][NUMBER] == 23 || record[i][NUMBER] == 25 || record[i][NUMBER] == 27 || record[i][NUMBER] == 30 || record[i][NUMBER] == 32 || record[i][NUMBER] == 34 || record[i][NUMBER] == 36 )
                    record[i][RED_BLACK] = RED;
                else record[i][RED_BLACK] = BLACK;

                if( record[i][NUMBER] < 19 ) record[i][HALVES] = HALF_1;
                else record[i][HALVES] = HALF_2;
                
                if( record[i][NUMBER] < 13 ) record[i][THIRDS] = THIRD_1;
                else if( record[i][NUMBER] < 25 ) record[i][THIRDS] = THIRD_2;
                else record[i][THIRDS] = THIRD_3;

                if( record[i][NUMBER] % 3 == 0 ) record[i][COLUMNS] = COL_1;
                else if( record[i][NUMBER] % 3 == 1 ) record[i][COLUMNS] = COL_2;
                else record[i][COLUMNS] = COL_3;
                
            }
        }

        for( i=0; i<NUM_SPINS; i++ ) {
            if( record[i][j] 
        } 
        
    }

    private int[][] record;
    
    private final int NUM_TYPES = 6;
    
    private final int NUM_SPINS = 100000;
    
    private final int NUMBER = 0;
    private final int EVEN_ODD = 1;
    private final int RED_BLACK = 2;
    private final int HALVES = 3;
    private final int THIRDS = 4;
    private final int COLUMNS = 5;
    
    private final int ZERO1 = -1;
    private final int ZERO2 = 0;
    private final int EVEN = 1;
    private final int ODD = 2;
    private final int RED = 3;
    private final int BLACK = 4;
    private final int HALF_1 = 5;
    private final int HALF_2 = 6;
    private final int THIRD_1 = 7;
    private final int THIRD_2 = 8;
    private final int THIRD_3 = 9;
    private final int COL_1 = 10;
    private final int COL_2 = 11;
    private final int COL_3 = 12;
    
}
