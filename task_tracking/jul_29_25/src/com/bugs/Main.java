package com.bugs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> PascalTriangle= new ArrayList<List<Integer>>();

        List<Integer> firstElement = new ArrayList<>();

        firstElement.add(1);
        PascalTriangle.add(firstElement);

        for (int i = 1; i < 5; i++) {
            List<Integer> prevRow = PascalTriangle.get(i-1);
            List<Integer> item = new ArrayList<>();
            item.add(1);

            for (int j = 1; j < i; j++){
//                if (j==0 || j == i){
//                    item.add(1);
//                }else{
                    item.add(prevRow.get(j-1) + prevRow.get(j));
//                }
            }

            item.add(1);
            PascalTriangle.add(item);
        }

        System.out.println(PascalTriangle);
    }
}
