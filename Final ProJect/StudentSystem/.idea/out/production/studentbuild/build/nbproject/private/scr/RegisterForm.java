package studentsystem;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class RegisterForm extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private final JButton registerButton;
    private static String adminUsername = null;
    private static String adminPassword = null;
    
    public RegisterForm() {
        // Thiết lập giao diện
        setTitle("Register Admin");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(10, 10, 80, 25);
        panel.add(usernameLabel);
        
        usernameField = new JTextField(20);
        usernameField.setBounds(100, 10, 160, 25);
        panel.add(usernameField);
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 40, 80, 25);
        panel.add(passwordLabel);
        
        passwordField = new JPasswordField(20);
        passwordField.setBounds(100, 40, 160, 25);
        panel.add(passwordField);
        
        registerButton = new JButton("Register");
        registerButton.setBounds(100, 80, 100, 25);
        panel.add(registerButton);
        
        // Thêm sự kiện khi nhấn nút đăng ký
        registerButton.addActionListener((ActionEvent e) -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            
            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter both username and password", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Lưu thông tin admin
                adminUsername = username;
                adminPassword = password;
                JOptionPane.showMessageDialog(null, "Registration successful!");
                openLoginForm(); // Mở giao diện đăng nhập sau khi đăng ký thành công
            }
        });

        add(panel);
    }
    
    // Phương thức mở giao diện đăng nhập sau khi đăng ký thành công
    private void openLoginForm() {
        LoginForm loginForm = new LoginForm(adminUsername, adminPassword);
        loginForm.setVisible(true);
        this.dispose(); // Đóng màn hình đăng ký
    }
    
    // Getter cho admin
    public static String getAdminUsername() {
        return adminUsername;
    }

    public static String getAdminPassword() {
        return adminPassword;
    }
}
