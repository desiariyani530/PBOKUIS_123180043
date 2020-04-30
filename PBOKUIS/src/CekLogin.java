
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;



//123180043
public class CekLogin {
    FormLogin formlogin;
    public CekLogin (FormLogin formlogin){
        this.formlogin = formlogin;
        
        formlogin.login.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String uname = formlogin.getUname();
                String pw = formlogin.getPw();
                
                if(uname.isEmpty() || pw.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Username atau Password kosong");
                } else if (uname.equals("admin") && pw.equals("adm")){
                    formlogin.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Login Berhasil");
                    new DataFilm ();
                } else {
                    JOptionPane.showMessageDialog(null, "Username atau Password salah");
                }
            }
        });
    }
}
