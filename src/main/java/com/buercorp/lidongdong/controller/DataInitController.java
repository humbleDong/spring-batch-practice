package com.buercorp.lidongdong.controller;

import com.buercorp.lidongdong.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @Author ldd
 * @Date 2024/2/5
 */
@RestController
public class DataInitController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/dataInit")
    public String dataInit() throws IOException {
        employeeService.dataInit();
        return "ok";
    }
}
