package com.geo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JsonTest {

    @Test
    public void updateEmployees() {
        boolean exists = false;

        Employee newEmployee = new Employee("3", "Bruice", "Lee", "https://jsonformatter.org/img/tom-cruise.jpg");

        JsonManager manager = new JsonManager();
        for (Employee employee : manager.convertJsonToList()) {
            if (employee.getId().equals(newEmployee.getId())) {
                exists = true;
                break;
            }
        }

        assertTrue(exists);
        assertFalse(newEmployee.getFirstName().isBlank());
        assertFalse(newEmployee.getLastName().isBlank());
        assertFalse(newEmployee.getPhoto().isBlank());
        manager.updateEmployeeInJson(newEmployee);

    }
}