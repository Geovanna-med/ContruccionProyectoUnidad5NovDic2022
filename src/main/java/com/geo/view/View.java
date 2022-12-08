package com.geo.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.geo.Employee;
import com.geo.JsonManager;

public class View {

    JFrame f;
    JsonManager jsonManager = new JsonManager();
    Employee[] info = jsonManager.convertJsonToList();

    public View() {

        f = new JFrame();
        f.setTitle("Empleados");

        EmployeeTableManager employeeTableManager = new EmployeeTableManager(info, f);
        JTable table = employeeTableManager.getTable();

        JButton button = employeeTableManager.getButton();

        table.setRowHeight(250);

        JScrollPane scrollPane = new JScrollPane(table);
        f.add(scrollPane);
        // f.add(button, BorderLayout.PAGE_END);

        JPanel btnPnl = new JPanel(new BorderLayout());

        JPanel bottombtnPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton button2 = employeeTableManager.getButton2();

        bottombtnPnl.add(button2);

        btnPnl.add(bottombtnPnl, BorderLayout.CENTER);
        table.getTableHeader().setReorderingAllowed(false);

        JPanel subJP = new JPanel();

        subJP.add(button);
        subJP.add(button2);

        f.add(subJP, BorderLayout.SOUTH);

        f.setTitle("Empleados");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);

        f.setSize(900, 700);

    }

    public static void main(String[] args) {
        System.out.println("Holas");
    }
}
