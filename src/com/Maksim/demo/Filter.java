package com.Maksim.demo;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    public int addition (int x, int y) {

        return x+y;

    }

    public List<Integer> noNeg1 (List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.remove(i);            // List gets distorted if index is removed, won't filter properly
                i--;                       // i--; is added in order to get the index counter on track, and prevent distortion
            }

        }
        return list;
    }


    public List<Integer> noNeg (List<Integer> list) {
        List<Integer> noNegativesList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >=0) {
                noNegativesList.add(list.get(i));
            }
        }
        return noNegativesList;
    }

}
