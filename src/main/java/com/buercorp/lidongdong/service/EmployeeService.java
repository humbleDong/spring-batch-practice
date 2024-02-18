package com.buercorp.lidongdong.service;

import com.buercorp.lidongdong.pojo.Employee;

import java.io.IOException;

/**
 * @Author ldd
 * @Date 2024/2/5
 */
public interface EmployeeService {
    /**
     * 保存
     */
    void save(Employee employee);

    /**
     * 初始化数据：生成50w数据
     */
    void dataInit() throws IOException;

    /**
     * 清空数据
     */
    void truncateAll();

    /**
     * 清空employee_temp数据
     */
    void truncateTemp();
}
