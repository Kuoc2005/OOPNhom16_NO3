package studentsystem;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private final JButton loginButton;
    private final JButton registerButton;
    private String registeredUsername;
    private String registeredPassword;
    
    // Constructor nhận giá trị admin đã đăng ký
    public LoginForm(String username, String password) {
        this.registeredUsername = username;
        this.registeredPassword = password;
        
        // Thiết lập giao diện
        setTitle("Login Form");
        setSize(300, 200);
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
        
        loginButton = new JButton("Login");
        loginButton.setBounds(100, 80, 80, 25);
        panel.add(loginButton);
        
        registerButton = new JButton("Register");
        registerButton.setBounds(100, 120, 100, 25);
        panel.add(registerButton);
        
        // Thêm sự kiện cho nút đăng nhập
        loginButton.addActionListener((ActionEvent e) -> {
            String username1 = usernameField.getText();
            String password1 = new String(passwordField.getPassword());
            // Kiểm tra đăng nhập với admin đã đăng ký
            if (username1.equals(registeredUsername) && password1.equals(registeredPassword)) {
                JOptionPane.showMessageDialog(null, "Login successful!");
                openStudentManagement(); // Mở giao diện quản lý sinh viên
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        
        // Thêm sự kiện cho nút đăng ký
        registerButton.addActionListener((ActionEvent e) -> {
            openRegisterForm(); // Mở giao diện đăng ký
        });

        add(panel);
    }
    
    // Phương thức mở giao diện quản lý sinh viên
    private void openStudentManagement() {
        SFStudent studentFrame = new SFStudent();
        studentFrame.setVisible(true);
        this.dispose(); // Đóng màn hình đăng nhập
    }

    // Phương thức mở giao diện đăng ký
    private void openRegisterForm() {
        RegisterForm registerForm = new RegisterForm();
        registerForm.setVisible(true);
        this.dispose(); // Đóng màn hình đăng nhập
    }
}
