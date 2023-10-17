package com.Maksim.demo;

import java.util.ArrayList;
import java.util.Arrays;
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

        int[] testList = {1,-1,-5,5,6};


        System.out.println(testList);

        for (int i = 0; i < testList.length; i++) {
            System.out.println(testList);

        }
        Filter filter = new Filter();

        List<Integer> list = new ArrayList<>(Arrays.asList(1,-3,5,19,0,-100)); // (Arrays.asList()) makes a preset ArrayList with provided elements
        System.out.println("list: " + list);
        System.out.println("filter.noNeg(list): " + filter.noNeg(list));
        List<Integer> noNegativesList = new ArrayList<>();
        System.out.println(noNegativesList);
        list.add(-1);
        list.add(-1);
        list.add(-2);
        list.add(-2);
        list.add(-3);
        list.add(3);
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get(0));
        for (int i = 0; i < list.size(); i++) {
           if (list.get(i)>=0) {
              noNegativesList.add(list.get(i));
           }

        }

        list.removeIf( n -> (n < 0) );
        System.out.println(list);
        System.out.println(noNegativesList);



        Integer[] intArray = {1,2,3,4,5};
        printArray(intArray);



        System.out.println(filter.addition(1,2));

        List<Integer> testlist = new ArrayList<>(Arrays.asList(0,-1,-5,3,1-2,5));



        System.out.println( filter.noNeg(testlist)  );
        System.out.println(filter.noNeg1(testlist));



    }

    public static int noNeg(int x, int y){


        return x+y;

    }

    public static void printArray(Integer[] intArray) {
       System.out.println("Array through printed method");
       for (int i = 0; i < intArray.length; i++) {
          System.out.println(i + " ");
       }

    }


    /*public static List noNeg1 (ArrayList<>){

    }*/

}