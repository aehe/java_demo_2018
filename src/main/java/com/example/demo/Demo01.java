package com.example.demo;

/*
package.java.util
List
Set
Deque
*/

import java.util.*;

public class Demo01 {
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
//        demo01.demoList();
       // demo01.demoMap();
        demo01.demoSet();
    }

    private void demoSet() {
        Set<String> names = new HashSet();
        names.add("n1");
        names.add("n1");
        names.add("n1");
        for (String name:names)
        {
            System.out.println(name);
        }
    }


    private void demoMap() {
        Map<String, Integer> names = new HashMap<>();
        names.put("n1", 20);
        names.put("n2", 30);
        names.put("n2", 40);  //dup key
        names.put("n0", 20);

        Set<String> keys = names.keySet();
        for (String key : keys){
            System.out.println(names.get(key));
        }

    }

    private void demoList() {
        System.out.println("Call demoList");
//        ArrayList<String> names = new ArrayListL<String>(); //Java1.7
//        ArrayList<String> names = new ArrayList<>(); //Java1.8

        //Generic
//        ArrayList<String> names = new ArrayList<>(); //Don't
        List<String> names = new ArrayList<>(); //Do
        names.add("Name1");
        names.add("Name2");

        for (String name : names)
        {
            System.out.println(name);
        }
        names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);
        for(Iterator<String> i = names.iterator(); i.hasNext();){
            System.out.println(i.next());
        }

    }
}
