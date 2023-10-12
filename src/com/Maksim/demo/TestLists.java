package com.Maksim.demo;

import java.util.ArrayList;
import java.util.List;

public class TestLists {

    public void arrayListMethod() {
        List<Integer> scoreList = new ArrayList<>();

        scoreList.add(1);
        scoreList.add(3);
        scoreList.add(4);
        //scoreList.remove(1);
        //scoreList.set(0,100);
        //scoreList.get(0);

        System.out.println(scoreList);
        System.out.println(scoreList.get(1));
    }

    public void linkedListMethod() {}

}
