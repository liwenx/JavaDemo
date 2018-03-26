package com.liwx.demo.loaddemo;

/**
 * @author liwenxing
 * @date 2018/3/26 14:44
 */
public class A extends B {
    public int a = 100;
    public A(){
        System.out.println("I am A Constructor"+a);
        a = 200;
    }

    static {
        System.out.println("static port");
    }

    public static void main(String[] args) {
        System.out.println("I am main method:"+new A().a);
    }
}
