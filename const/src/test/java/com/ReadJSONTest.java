package com;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.geo.ReadJSON;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

public class ReadJSONTest {

    @Test
    @DisplayName("Checar si el archivo JSON existe")
    public void checarExistenciaJSON() {
        File file = new File("src/Empleados.json");
        assertTrue(file.exists());
    }

    @Test
    @DisplayName("Checar si el archivo JSON es válido.")
    public void validacionJSON() {
        JSONParser parser = new JSONParser();
        String txtJSON = ReadJSON.getJSONContent();
        try {
            JSONObject obj = new JSONObject((JSONObject) parser.parse(txtJSON));
            assertTrue(obj.containsKey("employees"));
        } catch (ParseException e) {
            fail("Validation failed with: " + e.getMessage());
        }

    }

}
