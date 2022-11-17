package com.geo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJSON {

    public static JSONArray getJSONContent() {

        JSONParser parser = new JSONParser();

        Object obj = null;
        try {
            obj = parser.parse(new FileReader("src/Empleados.json"));
        } catch (IOException | ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        JSONObject jsonObject = (JSONObject) obj;
        System.out.println("JSON LEIDO: " + jsonObject);

        JSONObject employees = (JSONObject) jsonObject.get("employees");
        JSONArray array = (JSONArray) employees.get("employee");

        return array;

    }

    public static void printJSONContent() {

        JSONArray array = getJSONContent();
        System.out.println("");

        for (int i = 0; i < array.size(); i++) {
            JSONObject jsonObject1 = (JSONObject) array.get(i);

            System.out.println("DATOS DEL EMPLEADO: " + i);
            System.out.println("ID: " + jsonObject1.get("id"));
            System.out.println("First Name: " + jsonObject1.get("firstName"));
            System.out.println("Last Name: " + jsonObject1.get("lastName"));
            System.out.println("Photo: " + jsonObject1.get("photo"));

            System.out.println("");
        }

    }

}