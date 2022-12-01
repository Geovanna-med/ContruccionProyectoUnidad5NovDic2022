package com.geo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class EmployeeTest {
    @Test
    @DisplayName("Json convertion")
    public void shouldCreateArrayOfEmployees() {
        JsonManager jsonReader = new JsonManager();
        assertFalse(jsonReader.convertJsonToList() == null);
        assertEquals(3, jsonReader.convertJsonToList().length);
    }

}
