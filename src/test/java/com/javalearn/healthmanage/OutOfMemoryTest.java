package com.javalearn.healthmanage;

/**
 * @author king-pan
 * @date 2019/11/17 15:50
 */
public class OutOfMemoryTest {


    public static final int _1MB = 1024 * 1024;


    public static void main(String[] args) {
        testHandlePromation();
    }

    /**
     * JVM参数: -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
     * 默认新生代与老年代的比例是1：2，通过-Xms -Xmx 和-Xmn强制设置新生代与老年代的比例为1:1 而且都是10MB
     */
    public static void testHandlePromation(){
        byte[] b1 =new byte[2*_1MB];
        byte[] b2 =new byte[2*_1MB];
        byte[] b3 =new byte[2*_1MB];
        byte[] b4 =new byte[4*_1MB];
        //byte[] b5 =new byte[4*_1MB];
        //byte[] b6 =new byte[4*_1MB];
        //byte[] b7 =new byte[4*_1MB];
        String endForm = "";
    }

}
