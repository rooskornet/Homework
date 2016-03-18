package com.ivik.students.week11;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jennie on 12-3-2016.
 */
public class PrintArray {

    public static void main(String[] args) {

        List names = new ArrayList();
        names.add("John");
        names.add("Fred");
        names.add("Ruud");
        names.add(new Integer(1));

        for(Object o: names){
            System.out.print(o);
        }
    }



}
