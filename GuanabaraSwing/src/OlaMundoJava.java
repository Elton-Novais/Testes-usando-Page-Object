/*import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class OlaMundoJava extends javax.swing.JFrame {
    private JPanel lblMensagem;
    private JButton btnClick;

    private void createUIComponents(java.awt.event.ActionEvent evt) {
        lblMensagem.setToolTipText("Olá Mundo!!!");

    }
}*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class OlaMundoJava implements ActionListener {
    private JButton btnClick;

    public OlaMundoJava(JButton btnClick){
        this.btnClick = btnClick;

    }

    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource() == btnClick)
            JOptionPane.showMessageDialog(null, "O botão OK foi clicado");


    }

}


