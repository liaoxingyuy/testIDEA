package com.ModuleDemo.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 模板
 *
 *
 */
public class Test2 {

//  psf
    public static final String STR = "测试str";

//    prsf
    private static final String STR2 = "测试str2";





//    psvm
    public static void main(String[] args) {
        moudelSout(args);


        moudelArray();


        moudelList();


        modelIf();


    }

    /**
     * sout的模板
     */
    public static void moudelSout(String[] args) {
        //sout
        System.out.println("hello");

        //soutp
        System.out.println("args = [" + args + "]");

        //soutm
        System.out.println("Test2.main");

        //soutv
        int num = 10;
        System.out.println("num = " + num);
    }

    /**
     * list的模板
     */
    public static void moudelList() {
        List<String> strList = new ArrayList<>();
        strList.add("yyy");
        strList.add("xxx");
        strList.add("www");
        strList.add("eee");

//      strList.for
        for (String s : strList) {
            System.out.println("s = " + s);
        }
//      strList.fori
        for (int i = 0; i < strList.size(); i++) {

        }
//      strList.forr
        for (int i = strList.size() - 1; i >= 0; i--) {

        }
    }


    /**
     *  数组模板
      */
    public static void moudelArray() {
        Integer[] strArray = new Integer[]{1,2,1,3,1,5};

//        fori
        for (int i = 0; i < strArray.length; i++) {
            System.out.println("i = " + strArray[i]);
        }
//        iter
        for (Integer s : strArray) {
            System.out.println("s = " + s);
        }
    }

    public static void modelIf(){
        Integer num = 0;

//        ifn
        if (num == null) {

        }

//        inn
        if (num != null) {
            
        }

//        num.nn
        if (num != null) {

        }

//        num.null
        if (num == null) {

        }


    }



}
