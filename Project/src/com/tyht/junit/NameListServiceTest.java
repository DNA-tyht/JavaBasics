package com.tyht.junit;

import com.tyht.domain.Employee;
import com.tyht.service.NameListService;
import com.tyht.service.TeamException;
import org.junit.Test;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/4/10 14:57
 */
public class NameListServiceTest {
    @Test
    public void testGetAllEmployees() {
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    @Test
    public void testGetEmployee() {
        NameListService service = new NameListService();
        int id = 1;
        Employee employee = null;
        try {
            employee = service.getEmployee(1);
        } catch (TeamException e) {
            e.printStackTrace();
        }
        System.out.println(employee);
    }
}
