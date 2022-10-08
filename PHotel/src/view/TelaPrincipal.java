package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//import view.Aposentos;

public class TelaPrincipal extends JFrame{
    private JButton btnAposentos;
    private JButton btnFuncionario;
    private JButton btnConta;
   
    public TelaPrincipal() {
        super("Hotel ceKisabe");
        Container cont = getContentPane();
        cont.setBackground(new Color(200,200,200));
       
        btnAposentos = new JButton("Aposentos");
        btnAposentos.addActionListener(
            new ActionListener() {    //classe interna anônima            
                @Override
                public void actionPerformed(ActionEvent e) {
                    Aposentos aposentos = new Aposentos();
                    aposentos.setVisible(true);
                }
            }
        );
        btnFuncionario = new JButton("Funcionário");
        btnConta = new JButton("Conta");
       
        setLayout(null);
        cont.add(btnAposentos);
        cont.add(btnFuncionario);
        cont.add(btnConta);
        btnAposentos.setBounds(15, 20, 200, 100);
        btnFuncionario.setBounds(215, 20, 200, 100);
        btnConta.setBounds(415, 20, 200, 100);
        setSize(640,200);    
    }
}