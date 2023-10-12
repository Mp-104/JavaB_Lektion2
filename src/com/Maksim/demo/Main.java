package com.Maksim.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        TestLists testLists = new TestLists();

        testLists.arrayListMethod();
        System.out.println(testLists);


        List<Student> studentList = new ArrayList<>();

        System.out.println("studentList: "+studentList);

        studentList.size();

        System.out.println("studentList.size(): "+studentList.size());

        /*for (int i = 0; i <5 ; i++) {
            Student student = new Student("student "+ (i+1), i+18);

            studentList.add(student);
            System.out.println(studentList.get(i).name);

        }*/
        System.out.println(studentList);

        List<Integer> numberList = new ArrayList();

        numberList.add(1);
        numberList.add(7);
        numberList.add(3);
        numberList.add(10);
        numberList.add(5);
        numberList.add(9);
        numberList.add(2);
        numberList.add(8);
        numberList.add(6);
        numberList.add(4);

        System.out.println("unsorted numberList: " + numberList);

        Collections.sort(numberList);
        System.out.println("Sorted numberList: " + numberList);


        Collections.sort(numberList, Collections.reverseOrder());

        System.out.println("sorted in reverse numberList: "+numberList);

        System.out.println("studentList: "+studentList);
        Student student = new Student();
        student.name = "benny";
        student.age = 18;

        Student student1 = new Student();
        student1.name = "frida";
        student1.age = 19;

        studentList.add(student);
        studentList.add(student1);

        studentList.set(0,student1);
        studentList.set(1, student);

        System.out.println("studentList, swapping manually" + studentList);

        Collections.swap(studentList, 0,1);

        System.out.println("studentList, swapping using the Collections.swap" + studentList);

        System.out.println(noNeg(1,4));
        //noNeg();




    }

    public static int noNeg(int x, int y){


        return x+y;

    }

    /*public static List noNeg1 (ArrayList<>){

    }*/

}