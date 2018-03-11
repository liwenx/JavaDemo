package com.liwx.classdemo;

/**
 * @author liwenxing
 * @date 2018/1/4 18:40
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Human aPerson = new Human();
        Class c1 = aPerson.getClass();
        System.out.println(c1.getName());

        Human anotherPerson = new Woman();
        Class c2 = anotherPerson.getClass();
        System.out.println(c2.getName());
        Class c3 = Class.forName("com.liwx.classdemo.Woman");
        System.out.println(c3.getName());

        Class c4  = Woman.class;
        System.out.println(c4.getName());
        System.out.println(Integer.TYPE.getName());
        System.out.println(int.class.getName());
        System.out.println(double.class.equals(int.class));
    }
}
