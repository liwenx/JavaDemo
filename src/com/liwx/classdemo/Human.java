package com.liwx.classdemo;

/**
 * @author liwenxing
 * @date 2018/1/4 18:39
 */
public class Human {
    /**
     * accessor
     */
    public int getHeight()
    {
        return this.height;
    }

    /**
     * mutator
     */
    public void growHeight(int h)
    {
        this.height = this.height + h;
    }
    private int height;
}
