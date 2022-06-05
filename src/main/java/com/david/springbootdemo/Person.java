package com.david.springbootdemo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author david
 * @since 2022/6/5
 */
@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private Integer id;//id
    private String name; //名称
    private List hobby; //爱好
    private String[] family; //家庭成员
    private Map map;
    private Pet pet; //宠物
}
