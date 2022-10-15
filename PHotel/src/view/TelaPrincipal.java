package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import view.Aposentos;
import view.Funcionarios;

public class TelaPrincipal extends JFrame{
    private JButton btnAposentos;
    private JButton btnFuncionario;
    private JButton btnConta;
   
    public TelaPrincipal() {
        super("Hotel Arendelle");
        Container cont = getContentPane();
        cont.setBackground(new Color(200,200,200));
       
        btnAposentos = new JButton("Aposentos");
        btnAposentos.addActionListener(
            new ActionListener() {    //classe interna an�nima            
                @Override
                public void actionPerformed(ActionEvent e) {
                    Aposentos aposentos = new Aposentos();
                    aposentos.setVisible(true);
                }
            }
        );
        btnFuncionario = new JButton("Funcionário");
       //Corrigir botão para a tela fucionario
        btnFuncionario.addActionListener(
                new ActionListener() {    //classe interna an�nima            
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Funcionarios funcionario = new Funcionarios();
                        funcionario.setVisible(true);
                    }
                }
            );
        btnConta = new JButton("Conta");
       
        setLayout(null);
        setSize(640,640); 
        cont.add(btnAposentos);
        cont.add(btnFuncionario);
        cont.add(btnConta);
        btnAposentos.setBounds(15, 20, 150, 100);
        btnFuncionario.setBounds(15, 120, 150, 100);
        btnConta.setBounds(165, 20, 150, 100);
           
    }
}