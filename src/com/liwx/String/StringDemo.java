package com.liwx.String;

/**
 * @author liwenxing
 * @date 2017/12/27 20:42
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ab";
        String s3 = "c";
        String s4 = s2 + s3;

        String st0 = "helloworld";
        String st2 = "hello" + "world";
        String st1 = "helloworld";
        String st3 = new String("helloworld");
        String st4 = new String("helloworld");
        System.out.println("st3 == st4:"+(st3 == st4));
        System.out.println(st0 == st1);
        System.out.println(st0 == st3);
        System.out.println(st3 ==st2);
        System.out.println(st0 == st2);
        System.out.println(s1 == (s2 + s3));
        System.out.println(s1 == s4);

        //
        String ok="apple1";
        final int temp=1;
        String ok1="apple"+1;
        System.out.println(ok==ok1);//true

        String str1 = "ab";
        System.out.println("ab: "+("aaa" instanceof String));
        String str2 = "a";
        String str3  ="b";
        String str4 = str1 + str3;

//        String str2 = "a" + "b";
        System.out.println("str1 == str4 "+ (str1 == str4));

    }

}
