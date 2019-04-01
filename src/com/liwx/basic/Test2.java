package com.liwx.basic;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"1");
        System.out.println(map.get(new Integer(1)));
        Interface1Impl interface1 = new Interface1Impl();
        Integer a = null;
        interface1.test1(a);
    }
}
