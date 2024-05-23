package View;

import javax.swing.*;

public class Login extends JFrame {
    JPanel panel = new JPanel();
    JLabel lbl = new JLabel("Usuario");
    JLabel lbl2 = new JLabel("Clave");
    JTextField txt = new JTextField();
    JPasswordField txt2 = new JPasswordField();
    JButton btn = new JButton("Limpiar");
    JButton btn2 = new JButton("Enviar");

    public Login () {
        Contenido();
        Iniciar();
    }

    void Iniciar () {
        setTitle("Login");
        setSize(300,300);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    void Contenido () {
        panel.setLayout(null);

        lbl.setBounds(50,50,100,50);
        lbl2.setBounds(50,100,100,50);

        txt.setBounds(150,65,100,25);
        txt2.setBounds(150,115,100,25);

        btn.setBounds(50,165,90,25);
        btn2.setBounds(150,165,90,25);

        panel.add(lbl);
        panel.add(lbl2);
        panel.add(txt);
        panel.add(txt2);
        panel.add(btn);
        panel.add(btn2);

        add(panel);
    }

    public void Limpiarlabels() {
        lbl.setText("");
        lbl2.setText("");
    }

}
