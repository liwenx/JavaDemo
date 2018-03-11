package com.liwx.classdemo;

/**
 * @author liwenxing
 * @date 2018/1/4 18:40
 */
public class Woman  extends Human{
    /**
     * new method
     */
    public Human giveBirth()
    {
        System.out.println("Give birth");
        return (new Human());
    }
}
