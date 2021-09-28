package example;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmployeeName {
    private JList employeeList;
    private JTextField editEmpid;
    private JTextField editEmpname;
    private JTextField editEmpdig;
    private JTextField editEmpaddr;
    private JTextField editEmpPhone;
    private JTextField editEmpSalary;
    private JButton addButton;
    private JButton deleteButton;
    private JButton refreshButton;
    private JPanel formpanel;

    public EmployeeName() {
        DatabaseHelper dbhelper = new DatabaseHelper();
        ResultSet empdata = dbhelper.gelEmployees();
        ArrayList<EmpModel> empArrayList = new ArrayList<>();
        try {
            while (employees.next()) {
                int id = employees.getInt(DatabaseHelper.E_ID);
                String name = employees.getString(DatabaseHelper.E_NAME);
                String address = employees.getString(DatabaseHelper.E_ADDR);
                String desig = employees.getString(DatabaseHelper.E_DESIG);
                String phone = employees.getString(DatabaseHelper.E_PHONE);
                float salary = employees.getFloat(DatabaseHelper.E_SALARY);
                empArrayList.add(new EmpModel(id, name, desig, salary, address, phone));

            }
        }catch

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("EmployeeName");
        frame.setContentPane(new EmployeeName().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 300));
        frame.pack();
        frame.validate();
        frame.setVisible(true);

    }
}
