package com.liwx.designpattern.singleton.enumsingleton;

/**
 * @author liwenxing
 * @date 2018/12/3 20:56
 */
public enum Singleton implements MySingleton {
    INSTANCE {
        @Override
        public void doSomething() {
            System.out.println("complete singleton");
        }
    };
    public static MySingleton getInstance() {
      return Singleton.INSTANCE;
    }
}
