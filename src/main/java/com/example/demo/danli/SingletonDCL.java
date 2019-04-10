package com.example.demo.danli;

/**
 * Created by Administrator on 2019/4/10.
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * volatile和synchronized同步块的使用
 */
public class SingletonDCL {
    private SingletonDCL(){}
    private volatile static SingletonDCL singletonDCL;
    public static SingletonDCL getInstance(){
        if(singletonDCL == null){
            synchronized (SingletonDCL.class){
                if(singletonDCL == null){
                    singletonDCL = new SingletonDCL();
                }
            }
        }
        return singletonDCL;
    }
}
