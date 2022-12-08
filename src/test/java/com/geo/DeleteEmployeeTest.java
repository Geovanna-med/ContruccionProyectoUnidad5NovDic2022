package com.geo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.text.ParseException;

import org.junit.Test;

public class DeleteEmployeeTest {
    @Test
    public void deleteEmployee() throws ParseException {
        JsonManager jm = new JsonManager();
        Employee[] em = jm.convertJsonToList();

        String idOfEmployeeToDelete = em[0].getId();

        jm.deleteEmployeeFromJson(idOfEmployeeToDelete);

        assertNotEquals(jm.convertJsonToList(), em);
    }
}
