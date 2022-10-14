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

import bdhotel.BancoDados;
import model.Aposento;
import model.Funcionario;

public class Funcionarios extends JFrame {
	private JButton btNovo;
	private JButton btAlterar;
	private JButton btRemover;
	private static JTable tabela;
	private static String [] colunas = {"Codigo", "Nome","cargo",
			"salario","cpf","Telefone"};
	
	private static Object [][] dados = {};
	
	public Funcionarios(){
		super("Funcionarios");
		initComponents();
		atualizaTabela();
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
        			@Override
        			public void actionPerformed(ActionEvent e) {
        				InserirFuncionario janelafun =  new InserirFuncionario();
        				//janelafun.setVisible(true);
        			}
        		});
        
        btAlterar.addActionListener(
        		new ActionListener() {
        			@Override
        			public void actionPerformed(ActionEvent e) {
        				int linhaSelecionada = tabela.getSelectedRow();
        				
        				if(linhaSelecionada >= 0) {
        				//AlterarFuncionario Janela Alterar =  new AlterarFuncionario(linhaSelecionada);
        				//janelaAlterar.setVisible(true);	
        				}else {
        					JOptionPane.showMessageDialog(null,"Necessario selecionar um usuario","Funcionario",JOptionPane.INFORMATION_MESSAGE);
        				}
        			}
        			
        		});
        
        btRemover.addActionListener(
        		new ActionListener() {
        			@Override
        			public void actionPerformed(ActionEvent e) {
        				int linhaSelecionada = tabela.getSelectedRow();
                       
                        if(linhaSelecionada >= 0) {
                            int resposta = JOptionPane.showConfirmDialog(null, "Deseja excluir o aposento?");
                           
                            if(resposta == JOptionPane.YES_OPTION) {
                                 Funcionario funcionario = BancoDados.getFuncionario().get(linhaSelecionada);
                                 BancoDados.removeFuncionario(funcionario);

                                 atualizaTabela();
                            }
                        }else {
                            JOptionPane.showMessageDialog(null, "� necess�rio selecionar um aposento", "Aposento",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                });
        
        
	}
	
	private static void atualizaTabela() {
		TableModel tTabela = (DefaultTableModel) tabela.getModel();
        ((DefaultTableModel) tTabela).setNumRows(0);

        List<Funcionario> funcionarios = BancoDados.getFuncionario();

        for (int linha = 0; linha < funcionarios.size(); linha++){
            Funcionario funcionario = funcionarios.get(linha);

            ((DefaultTableModel) tTabela).addRow(new Object[]{1});

            tabela.setValueAt(funcionario.getCodigo(), linha, 0);
            tabela.setValueAt(funcionario.getNome(), linha, 1);
            tabela.setValueAt(funcionario.getCargo(), linha, 2);
            tabela.setValueAt(funcionario.getSalario(), linha, 3);
            tabela.setValueAt(funcionario.getCpf(), linha, 4);
            tabela.setValueAt(funcionario.getTelefone(), linha, 5);
        }
	}
}