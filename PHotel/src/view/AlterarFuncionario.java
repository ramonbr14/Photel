package view;

import java.util.ArrayList;
import java.util.List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import bdhotel.BancoDados;
import model.Aposento;
import model.Funcionario;

public class AlterarFuncionario extends JFrame{
	private JLabel lblCodigo;
	private JLabel lblNome;
	private JLabel lblCargo;
	private JLabel lblSalario;
	private JLabel lblCpf;
	private JLabel lblTelefone;  
	private JButton btnOk;
    private JButton btnCancelar;
    private JTextField txtCodigo;
    private JTextField txtNome;
    private JTextField txtCargo;
    private JTextField txtSalario;
    private JTextField txtCpf;
    private JTextField txtTelefone;
    
    public AlterarFuncionario(int linhaSelecionada) {
    	super("Inserir Funcionario");
    	lblCodigo = new JLabel("Codigo");
    	lblNome = new JLabel("Nome");
    	lblCargo = new JLabel("Cargo");
    	lblSalario = new JLabel("Salario");
    	lblCpf = new JLabel("CPF");
    	lblTelefone = new JLabel("Telefone");
    	
    	txtCodigo = new JTextField();
    	txtNome = new JTextField();
    	txtCargo = new JTextField();
    	txtSalario = new JTextField();
    	txtCpf = new JTextField();
    	txtTelefone = new JTextField();

    	btnOk = new JButton("OK");
    	btnCancelar = new JButton("Cancelar");
    	
    	setLayout(null);
    	add(lblCodigo);
    	add(txtCodigo);
    	add(lblNome);
    	add(txtNome);
    	add(lblCargo);
    	add(txtCargo);
    	add(lblSalario);
    	add(txtSalario);
    	add(lblCpf);
    	add(txtCpf);
    	add(lblTelefone);
    	add(txtTelefone);
    	add(btnOk);
        add(btnCancelar);
    	
    	lblCodigo.setBounds(10, 10, 70, 20);
    	txtCodigo.setBounds(70, 10, 70, 20);
    	lblNome.setBounds(150, 10, 70, 20);
    	txtNome.setBounds(220, 10, 70, 20);
    	lblCargo.setBounds(10, 40, 70, 20);
    	txtCargo.setBounds(70, 40, 70, 20);
    	lblSalario.setBounds(150, 40, 70, 20);
    	txtSalario.setBounds(220, 40, 70, 20);
    	lblCpf.setBounds(10, 80, 70, 20);
    	txtCpf.setBounds(70, 80, 70, 20);
    	lblTelefone.setBounds(150, 80, 70, 20);
    	txtTelefone.setBounds(220, 80, 70, 20);

        btnOk.setBounds(70, 150, 70, 20);
        btnCancelar.setBounds(160, 150, 100, 20);
    	
    	setSize(300,250);
    	
    	inserirCampoTexto(linhaSelecionada);
    	
    	btnOk.addActionListener(
                new ActionListener() {
                   
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int iCodigo = Integer.parseInt(txtCodigo.getText());
                        String sNome = txtNome.getText();
                        String sCargo = txtCargo.getText();
                        double dSalario = Double.parseDouble(txtSalario.getText());
                        String sCpf = txtCpf.getText();
                        String sTelefone = txtTelefone.getText();
                        
                        Funcionario funcionario = new Funcionario();
                        	funcionario.setCodigo(iCodigo);
                        	funcionario.setNome(sNome);
                        	funcionario.setCargo(sCargo);
                        	funcionario.setSalario(dSalario);
                        	funcionario.setCpf(sCpf);
                        	funcionario.setTelefone(sTelefone);

                        BancoDados.atualizaFuncionario(linhaSelecionada,funcionario);
                        Funcionarios.atualizaTabela();
                        dispose();                        
                    }
                });
       
        btnCancelar.addActionListener(
                new ActionListener() {
                   
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dispose();
                       
                    }
                });
 }
	public void inserirCampoTexto(int linha) {
		List<Funcionario> funcio = BancoDados.getFuncionario();
		Funcionario funcionario = funcio.get(linha);
		txtCodigo.setText(Integer.toString(funcionario.getCodigo()));
		txtNome.setText(funcionario.getNome());
		txtCargo.setText(funcionario.getCargo());
		txtSalario.setText(Double.toString(funcionario.getSalario()));
		txtCpf.setText(funcionario.getCpf());
		txtTelefone.setText(funcionario.getCpf());
	
	}
}
