package com.example.demo.danli;

/**
 * Created by Administrator on 2019/4/10.
 */
public class SingletonLanhanTest {
    public static void main(String[] args) {
        SingletonLanhan singletonLanhan = SingletonLanhan.getInstance();
        singletonLanhan.getMessage();
    }
}
