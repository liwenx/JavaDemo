package com.liwx.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * @author liwenxing
 * @date 2018/1/2 9:47
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Set<Student> set1 = new HashSet<Student>();
        for (int i = 0; i < 10; i++) {
//            set1.add("aeqweqw");
            Student stu = new Student();
            stu.setAge(10);
            stu.setName("liwenxing");
            set1.add(stu);

        }
        System.out.println(set1.size());
        for (Student stu1 : set1
             ) {
            System.out.println(stu1);
        }
    }
}
