package com.example.demo.danli;

/**
 * Created by Administrator on 2019/4/10.
 */
public class SingletonEhan {
    private SingletonEhan(){}
    private static SingletonEhan singletonEhan = new SingletonEhan();
    public static SingletonEhan getInstance(){
        return singletonEhan;
    }
    public void getMessage(){
        System.out.println("这是饿汉式单例模式");
    }

}
