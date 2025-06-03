package org.example;

import java.util.ArrayList;
import java.util.List;

//ouput format
//[
// [1],
// [1, 1],
// [1, 2, 1],
// [1, 3, 3, 1],
// [1, 4, 6, 4, 1]
//]
public class PascalTriangle {
    public static List<List<Integer>> generate( int rows){
        List<List<Integer>> mainTriangle = new ArrayList<>();
        for (int i = 0; i < rows; i++){
            List<Integer> singleRow = new ArrayList<>();
            for (int j = 0; j <= i; j++){
                if( j == 0|| j == i){
                    singleRow.add(1);
                }else {
                    int value = mainTriangle.get(i-1).get(j - 1) + mainTriangle.get(i-1).get(j);
                    singleRow.add(value);
                }
            }
            mainTriangle.add(singleRow);

        }
        return mainTriangle;
    }
    public static void main(String[] args) {
        System.out.println( PascalTriangle.generate(5));
    }
}
