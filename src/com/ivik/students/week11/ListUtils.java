package com.ivik.students.week11;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jennie on 18-3-2016.
 */
public class ListUtils {

    private ListUtils(){
    }

    public static <T> List findFirst(List<T> items, Predicate<T> predicate) {
        if (items == null || items.isEmpty()){
                return null;
        }

        List<T> list = new ArrayList<T>();


        for(T item : items ){
            if (predicate.evaluate(item)){
                    list.add(item);
            }
        }
        return list;
    }


}
