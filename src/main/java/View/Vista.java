package View;
import javax.swing.*;


public class Vista extends JFrame {

    public Vista() {
        Contenido();
        Iniciar();
    }

    void Contenido () {
        JPanel panel = new JPanel();
        JLabel lbl = new JLabel("Nombre:");
        JLabel lbl2 = new JLabel("Apellido:");
        JLabel lbl3 = new JLabel("Cedula:");
        JLabel lbl4 = new JLabel("Telefono:");
        JLabel lbl5 = new JLabel("Direccion:");
        JLabel lbl6 = new JLabel("Profesion:");
        JLabel lbl7 = new JLabel("Edad:");


        JSpinner spinner = new JSpinner();

        JButton enviar = new JButton("Guardar");
        JButton Limpiar = new JButton("Buscar");
        JButton eliminar = new JButton("Eliminar");
        JButton actualizar = new JButton("Actualizar");
        JLabel sesion = new JLabel("Formulario de Inscripcion");
        JButton recuperar = new JButton("Recuperar Contraseña");


        JTextField password = new JTextField(" ");
        JTextField txtfield = new JTextField(" ");
        JTextField txtfield2 = new JTextField(" ");
        JTextField txtfield3 = new JTextField(" ");
        JTextField txtfield4 = new JTextField(" ");
        JTextField txtfield5 = new JTextField(" ");
        JTextField txtfield6 = new JTextField(" ");
        JTextField txtfield7 = new JTextField(" ");




        txtfield.setBorder(txtfield.getBorder());

        panel.setLayout(null);
        lbl.setBounds(125,100,100,25);
        lbl2.setBounds(125,130,100,25);
        lbl3.setBounds(125,160,100,25);
        lbl4.setBounds(125,190,100,25);
        lbl5.setBounds(125,220,100,25);
        lbl6.setBounds(125,250,100,25);
        lbl7.setBounds(125,280,100,25);




        password.setBounds(250,100,100,25);
        txtfield.setBounds(250,130,100,25);
        txtfield2.setBounds(250,160,100,25);
        txtfield3.setBounds(250,190,100,25);
        txtfield4.setBounds(250,220,100,25);
        txtfield5.setBounds(250,250,100,25);
        spinner.setBounds(250,280,100,25);

        sesion.setBounds(200,50,200,25);

        enviar.setBounds(250,330,100,25);
        Limpiar.setBounds(125,330,100,25);
        actualizar.setBounds(250,360,100,25);
        eliminar.setBounds(125,360,100,25);


        panel.add(lbl);
        panel.add(lbl2);
        panel.add(lbl3);
        panel.add(lbl4);
        panel.add(lbl5);
        panel.add(lbl6);
        panel.add(lbl7);

        panel.add(txtfield);
        panel.add(txtfield2);
        panel.add(txtfield3);
        panel.add(txtfield4);
        panel.add(txtfield5);
        panel.add(txtfield6);
        panel.add(txtfield7);

        panel.add(spinner);

        panel.add(password);
        panel.add(actualizar);
        panel.add(eliminar);
        panel.add(enviar);
        panel.add(Limpiar);
        panel.add(sesion);
        panel.add(recuperar);
        getContentPane().add(panel);

    }


    void Iniciar() {
        setDefaultCloseOperation(3);
        setSize(500,500);
        setTitle("Login");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
