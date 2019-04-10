package com.example.demo.danli;

/**
 * Created by Administrator on 2019/4/10.
 */
public class SingletonLanhan {
    private void SingletonLanhan(){}
    private static SingletonLanhan singletonLanhan = null;
    public static SingletonLanhan getInstance(){
        if(singletonLanhan == null){
            singletonLanhan = new SingletonLanhan();
            return singletonLanhan;
        }else{
            return singletonLanhan;
        }
    }
    public void getMessage(){
        System.out.println("这是懒汉式单例模式");
    }
}
