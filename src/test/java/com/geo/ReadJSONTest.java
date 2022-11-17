package com.geo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;

public class ReadJSONTest {

    @Test
    @DisplayName("Verificar la existencia del archivo JSON")
    public void checarExistenciaJSON() {
        File file = new File("src/Empleados.json");
        assertTrue(file.exists());
    }

    @Test
    @DisplayName("Verificar la validez del archivo JSON")
    public void validacionJSON() {
        JSONArray txtJSONArray = ReadJSON.getJSONContent();
        if (txtJSONArray.size() == 0) {
            assertEquals(0, txtJSONArray.size());
        } else {
            for (Object object : txtJSONArray) {
                JSONObject testArray = (JSONObject) object;
                assertTrue(testArray.containsKey("id"));
                assertTrue(testArray.containsKey("firstName"));
                assertTrue(testArray.containsKey("lastName"));
                assertTrue(testArray.containsKey("photo"));
                assertEquals(4, testArray.size());
            }
        }
    }
}