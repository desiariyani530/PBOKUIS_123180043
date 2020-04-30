
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

//123180043


public class FormLogin extends JFrame{
    
   JButton login;
   JLabel user,pass,judul;
   TextField uname;
   JPasswordField pw;
    
    public void FormLogin(){
        setTitle("LOGIN");
        judul = new JLabel("LOGIN ADMIN");
        user = new JLabel("Username:");
        pass = new JLabel("Password:");
        uname = new TextField();
        pw = new JPasswordField();
        login = new JButton("Login");
        
        setLayout(null);
        add(judul);
        add(user);
        add(pass);
        add(uname);
        add(pw);
        add(login);
        
        judul.setBounds(110, 20, 90, 20);
        user.setBounds(50, 60, 100, 20);
        uname.setBounds(150, 60, 100, 20);
        pass.setBounds(50, 90, 100, 20);
        pw.setBounds(150, 90, 100, 20);
        login.setBounds(105, 130, 80, 20);
        
        setSize(320,220);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public String getUname(){
        return uname.getText();
    }
    
    public String getPw(){
         String pass = new String(pw.getPassword());
         return pass;

    }

   
}
