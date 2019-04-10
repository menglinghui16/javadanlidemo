package com.example.demo.danli;

/**
 * Created by Administrator on 2019/4/10.
 */
public class SingletonDCLTest {
    public static void main(String[] args) {
        SingletonDCL singletonDCL = SingletonDCL.getInstance();
        singletonDCL.getMessage();
    }
}
