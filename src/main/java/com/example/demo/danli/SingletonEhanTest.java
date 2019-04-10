package com.example.demo.danli;

/**
 * Created by Administrator on 2019/4/10.
 */
public class SingletonEhanTest {
    public static void main(String[] args) {
        SingletonEhan singletonEhan = SingletonEhan.getInstance();
        singletonEhan.getMessage();
    }
}
