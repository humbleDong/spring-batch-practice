package com.buercorp.lidongdong.mapper;

import com.buercorp.lidongdong.pojo.Employee;

/**
 * @Author ldd
 * @Date 2024/2/5
 */
public interface EmployeeMapper {

    /**
     * 添加
     */
    int save(Employee employee);

    /**
     * 添加临时表
     * @param employee
     * @return
     */
    int saveTemp(Employee employee);

    /**
     * 清空数据
     */
    void truncateAll();

    /**
     * 清空临时表数据
     */
    void truncateTemp();
}
