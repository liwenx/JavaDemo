package com.liwx.basic;

/**
 * @author liwenxing
 * @date 2018/1/31 21:27
 */
public class Test1 {
    public static void main(String[] args) {
        Test test1 = new Test();
        Test test2 = new Test();
        System.out.println(test1.value);
        System.out.println(test2.value);
        test2.value = 10;
        System.out.println(test1.value);
        System.out.println(test2.value);
        test1.value = 100;
        System.out.println(test1.value);
        System.out.println(test2.value);
    }

}

class Test{
    static int value = 0;
    public Test(){}
}
