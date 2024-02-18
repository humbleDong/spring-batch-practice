package com.buercorp.lidongdong.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author ldd
 * @Date 2024/2/5
 */
@Setter
@Getter
@ToString
public class Employee {
    private Long id;
    private String name;
    private int age;
    private int sex;
}
