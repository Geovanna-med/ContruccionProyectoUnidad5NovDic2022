package com.geo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AddEmployeeTest {
    @Test
    public void AddEmployee() {

        JsonManager manager = new JsonManager();

        int longitudAntes, longitudDespues;
        longitudAntes = manager.convertJsonToList().length;
        Employee newEmployee = new Employee("4", "Fer", "CAstillo", "https://jsonformatter.org/img/tom-cruise.jpg");

        manager.AddEmployeeFromJson(newEmployee);
        longitudDespues = manager.convertJsonToList().length;

        assertTrue(longitudAntes + 1 == longitudDespues);

    }
}
