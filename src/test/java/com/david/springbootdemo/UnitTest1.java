package com.david.springbootdemo;

import org.junit.jupiter.api.Test;

import java.util.Properties;

/**
 * @author david
 * @since 2022/6/9
 */
public class UnitTest1 {
    @Test
    public void someTest() {
        Properties properties = new Properties();
        properties.setProperty("a", "aa");
        System.out.println(properties.getProperty("a"));
    }
}
