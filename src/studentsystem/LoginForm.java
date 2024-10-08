package studentsystem;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class LoginForm extends JFrame {

    private final JTextField usernameField;
    private final JPasswordField passwordField;

    public LoginForm() {
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

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 80, 80, 25);
        panel.add(loginButton);

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(200, 80, 80, 25);
        panel.add(registerButton);
        
        // Thêm sự kiện cho nút đăng nhập
        loginButton.addActionListener((ActionEvent _) -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            
            // Kiểm tra đăng nhập bằng cách đọc từ file
            if (isValidLogin(username, password)) {
                JOptionPane.showMessageDialog(null, "Login successful!");
                openStudentManagement(); // Mở giao diện quản lý sinh viên
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        
        // Thêm sự kiện cho nút đăng ký
        registerButton.addActionListener((ActionEvent _) -> {
            openRegisterForm(); // Mở giao diện đăng ký
        });

        add(panel);
    }
    
    // Phương thức kiểm tra đăng nhập hợp lệ
    private boolean isValidLogin(String username, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/File/login.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(username) && parts[1].equals(password)) {
                    return true;
                }
            }
        } catch (IOException _) {
        }
        return false;
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
