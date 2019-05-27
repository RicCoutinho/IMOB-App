package command;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.User;
import repository.FakeUserRepository;
import repository.IUserRepository;
import view.TelaPrincipal;


public class LoginCommand extends Command {
    
    private String username;
    private String password;
    private JFrame loginFrame;
    
    public LoginCommand(String username, String password, JFrame loginFrame) {
        this.username = username;
        this.password = password;
        this.loginFrame = loginFrame;
    }
    
    @Override
    public void execute() {
        IUserRepository userRepository = FakeUserRepository.getInstance();
        User user = userRepository.getUser(this.username);
        
        if (user == null) {
            JOptionPane.showMessageDialog(null, "Nome de Usuário ou senha inválidos.");
        } else {
            String pass = new String(this.password);
            if (user.getPassword().equals(pass)) {
                new TelaPrincipal().setVisible(true);
                loginFrame.setVisible(false);
                loginFrame.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta.");
            }
        }
    }
    
}
