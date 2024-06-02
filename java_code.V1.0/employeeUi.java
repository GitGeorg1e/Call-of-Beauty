
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class employeeUi extends JFrame {
    private JTextField nameField;
    private JTextField emailField;
    private JTextField phoneField;
    private JTextField roleField;
    private JButton addButton;
    private DefaultListModel<String> employeeListModel;
    private JList<String> employeeList;
    private List<employee> employee;

    public employeeUi() {
        employee = new ArrayList<>();

        setTitle("Add Employee");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(5, 2));

        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Email:"));
        emailField = new JTextField();
        inputPanel.add(emailField);

        inputPanel.add(new JLabel("Phone:"));
        phoneField = new JTextField();
        inputPanel.add(phoneField);

        inputPanel.add(new JLabel("Role:"));
        roleField = new JTextField();
        inputPanel.add(roleField);

        addButton = new JButton("Add Employee");
        inputPanel.add(addButton);

        add(inputPanel, BorderLayout.NORTH);

        employeeListModel = new DefaultListModel<>();
        employeeList = new JList<>(employeeListModel);
        JScrollPane scrollPane = new JScrollPane(employeeList);
        add(scrollPane, BorderLayout.CENTER);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addEmployee();
            }
        });

        setVisible(true);
    }

    private void addEmployee() {
        String name = nameField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        String role = roleField.getText();

        if (validateInput(name, email, phone, role)) {
            employee employee = new employee(name, email, phone, role);
            employee.add(employee);
            employeeListModel.addElement(employee.toString());
            clearFields();
        } else {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean validateInput(String name, String email, String phone, String role) {
        return !name.isEmpty() && !email.isEmpty() && !phone.isEmpty() && !role.isEmpty();
    }

    private void clearFields() {
        nameField.setText("");
        emailField.setText("");
        phoneField.setText("");
        roleField.setText("");
    }

    public static void main(String[] args) {
        new employeeUi();
    }
}
