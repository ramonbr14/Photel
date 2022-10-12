package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Funcionarios extends JFrame {
	private JButton btNovo;
	private JButton btAlterar;
	private JButton btRemover;
	
	private static JTable tabela;
	private static String [] colunas = {"Codigo", "Nome","cargo",
			"salario","cpf","Telefone"};
	
	private static Objetc [][] dados = {};
	
	public Funcionarios(){
		super("Funcionarios");
		initComponents();
		atualizarTabela();
	}
	
	private void initComponents() {
		btNovo = new JButton("NovoFun");
		btNovo.setToolTipText("Novo");
		btAlterar = new JButton("AlteraFun");
		btAlterar.setToolTipText("Alterar");
		btRemover = new JButton("RemoverFun");
		btRemover.setToolTipText("Remover");
		
		TableModel tableModel = new DefaultTableModel(dados,colunas);
		tabela = new JTable(tableModel);
		JScrollPane barraRolagem =  new JScrollPane(tabela);

		setLayout(null);
		add(btNovo);
		add(btAlterar);
		add(btRemover);
		getContentPane().add(barraRolagem);
		
		btNovo.setBounds(10, 20, 100, 20);
        btAlterar.setBounds(105, 20, 100, 20);
        btRemover.setBounds(205, 20, 100, 20);
        barraRolagem.setBounds(10,40,300,100);
        setSize(400,200);
        
        btNovo.addActionListener(
        		new ActionListener() {
        			@override
        			public void actionPerformed(ActionEvent e) {
        				InserirFuncionario janela =  new InserirFuncionario();
        				janela.setVisible(true);
        			}
        		});
        
        btAlterar.addActionListener(
        		new ActionListener() {
        			@Override
        			public void ActionPerformed(ActionEvent e) {
        				int linhaSelecionada = tabela.getSelectedRow();
        				
        				if(linhaSelecionada >= 0) {
        				//AlterarFuncionario Janela Alterar =  new AlterarFuncionario(linhaSelecionada);
        				//janelaAlterar.setVisible(true);	
        				}else {
        					JOptionPane.showMessageDialog
        				}
        			}
        			
        		})
        
        
	}
	
	private static void atualizarTabela() {
		
	}
}
