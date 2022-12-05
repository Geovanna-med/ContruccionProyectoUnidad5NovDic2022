package com.geo.view;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

import com.geo.Employee;
import com.geo.JsonManager;

public class View {

    JFrame f;
    JsonManager jsonManager = new JsonManager();
    Employee[] info = jsonManager.convertJsonToList();

    public View() {

        f = new JFrame();
        f.setTitle("IU employees");

        EmployeeTableManager employeeTableManager = new EmployeeTableManager(info);
        JTable table = employeeTableManager.getTable();

        table.setRowHeight(150);

        JScrollPane scrollPane = new JScrollPane(table);
        f.add(scrollPane);

        f.setSize(500, 200);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Holas");
    }
}
