
package com.chuongnqh.mathutil.core;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    @Parameterized.Parameters
    public static Object[][] iniitData(){
        int a[] = {5, 10, 15, 20, 25};
        int b[][]= {{1, 0}, {1, 1}, {2, 2}, {3, 6}, {24, 4}, {120, 5 }, {720, 6 }}; 
        int c[][]= {{1, 0},
            {1, 1},
            {2, 2}, 
            {3, 6},
            {24, 4}, 
            {120, 5 }, 
            {720, 6 }}; 

        return new Integer [][] {{1, 0},
            {1, 1},
            {2, 2}, 
            {3, 6},
            {24, 4}, 
            {120, 5 }, 
            {720, 6 }};
        
        
    }
//     ta phải map 2 cột của từng dòng vào 2 đầu > của hàm so sánh 

        @Parameterized.Parameter(value = 0)
        public long expected ;   // map vào cột 0 
        @Parameterized.Parameter(value = 1)
        public int n; // map vào cột 1 
        @Test 
        public void testFactorialGivenRightArgumentReturn(){
           
        }
}
