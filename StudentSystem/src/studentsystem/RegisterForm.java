package studentsystem;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;

public class RegisterForm extends JFrame {

    private final JTextField usernameField;
    private final JPasswordField passwordField;
    private ActionEvent _1;
    private ActionEvent _2;
    private ActionEvent _3;

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

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(100, 80, 100, 25);
        panel.add(registerButton);
        
        // Thêm sự kiện khi nhấn nút đăng ký
        registerButton.addActionListener(this::actionPerformed);

        add(panel);
    }
    
    // Phương thức mở giao diện đăng nhập sau khi đăng ký thành công
    private void openLoginForm() {
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
        this.dispose(); // Đóng màn hình đăng ký
    }

    /**
     * @param _
     */
    private void actionPerformed(final ActionEvent _) {
       
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter both username and password", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Lưu thông tin admin vào tệp tin login.txt
            try (FileWriter writer = new FileWriter("src/File/login.txt", true)) { // Mở file và ghi nối
                writer.write(username + "," + password + "\n");
                JOptionPane.showMessageDialog(null, "Registration successful!");
                openLoginForm(); // Mở giao diện đăng nhập sau khi đăng ký thành công
            } catch (IOException ioException) {
                JOptionPane.showMessageDialog(null, "Error saving to file", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
