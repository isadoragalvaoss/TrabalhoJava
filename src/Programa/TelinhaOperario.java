package Programa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

/**
 * Cadastro de operário
 * @author isadora
 *
 */
public class TelinhaOperario extends JFrame implements PropertyChangeListener{
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
/**
 * Método que valida os campos para conferir se todos estão preenchidos
 * Os que não estiverem, ficam vermelho
 * E os que estiverem, ficam cinza	
 * @return True quando todos estiverem cinza, False quando algum estiver vermelho
 */
public boolean valida() {
		
		if(nomeField.getText().trim().isEmpty())
			nomeField.setBorder(new LineBorder(Color.red));
		
		if(telefoneField.getText().contains("0")==false || telefoneField.getText().contains("1")==false
				|| telefoneField.getText().contains("2")==false || telefoneField.getText().contains("6")==false
				|| telefoneField.getText().contains("3")==false || telefoneField.getText().contains("7")==false
				|| telefoneField.getText().contains("4")==false || telefoneField.getText().contains("8")==false
				|| telefoneField.getText().contains("5")==false || telefoneField.getText().contains("9")==false)
			telefoneField.setBorder(new LineBorder(Color.red));
		
		if(endField.getText().trim().isEmpty())
			endField.setBorder(new LineBorder(Color.red));
		
		if(codField.getText().trim().isEmpty())
			codField.setBorder(new LineBorder(Color.red));
		
		if(sexoBox.getSelectedIndex()!=0 || sexoBox.getSelectedIndex()!=1 || sexoBox.getSelectedIndex()!=2) 
			sexoBox.setBorder(new LineBorder(Color.red));
		
		if(depBox.getSelectedIndex()!=0 || depBox.getSelectedIndex()!=1 || depBox.getSelectedIndex()!=2 || 
				depBox.getSelectedIndex()!=3 || depBox.getSelectedIndex()!=4 || depBox.getSelectedIndex()!=5) 
			depBox.setBorder(new LineBorder(Color.red));
		
		if(cargahBox.getSelectedIndex()!=0 || cargahBox.getSelectedIndex()!=1 ) 
			cargahBox.setBorder(new LineBorder(Color.red));
		
		if(check.isSelected()==false || comissaoField.getText().trim().isEmpty()) 
			comissaoField.setBorder(new LineBorder(Color.red));
		
		if(check1.isSelected()==false || salarioField.getText().trim().isEmpty()) 
			salarioField.setBorder(new LineBorder(Color.red));
		
		if(dataField.getText().contains("0")==false || dataField.getText().contains("1")==false
				|| dataField.getText().contains("2")==false || dataField.getText().contains("6")==false
				|| dataField.getText().contains("3")==false || dataField.getText().contains("7")==false
				|| dataField.getText().contains("4")==false || dataField.getText().contains("8")==false
				|| dataField.getText().contains("5")==false || dataField.getText().contains("9")==false)
			dataField.setBorder(new LineBorder(Color.red));
		
		if(projetosField.getText().trim().isEmpty())
			projetosField.setBorder(new LineBorder(Color.red));
		
		if(nomeField.getText().trim().isEmpty()==false)
			nomeField.setBorder(new LineBorder(Color.gray));
		
		if(telefoneField.getText().contains("0")==true || telefoneField.getText().contains("1")==true
				|| telefoneField.getText().contains("2")==true || telefoneField.getText().contains("6")==true
				|| telefoneField.getText().contains("3")==true || telefoneField.getText().contains("7")==true
				|| telefoneField.getText().contains("4")==true || telefoneField.getText().contains("8")==true
				|| telefoneField.getText().contains("5")==true || telefoneField.getText().contains("9")==true)
			telefoneField.setBorder(new LineBorder(Color.gray)); 
		
		if(endField.getText().trim().isEmpty()==false)
			endField.setBorder(new LineBorder(Color.gray));
		
		if(codField.getText().trim().isEmpty()==false)
			codField.setBorder(new LineBorder(Color.gray));
		
		if(sexoBox.getSelectedIndex()==0 || sexoBox.getSelectedIndex()==1 || sexoBox.getSelectedIndex()==2) 
			sexoBox.setBorder(new LineBorder(Color.gray));
		
		if(depBox.getSelectedIndex()==0 || depBox.getSelectedIndex()==1 || depBox.getSelectedIndex()==2 || depBox.getSelectedIndex()==3 || 
				depBox.getSelectedIndex()==4 || depBox.getSelectedIndex()==5) depBox.setBorder(new LineBorder(Color.gray));
		
		if(cargahBox.getSelectedIndex()==0 || cargahBox.getSelectedIndex()==1 ) 
			cargahBox.setBorder(new LineBorder(Color.gray));
		
		if(check.isSelected()==true || comissaoField.getText().trim().isEmpty()==false) 
			comissaoField.setBorder(new LineBorder(Color.gray));
		
		if(check1.isSelected()==true || salarioField.getText().trim().isEmpty()==false) 
			salarioField.setBorder(new LineBorder(Color.gray));
		
		if(dataField.getText().contains("0")==true || dataField.getText().contains("1")==true
				|| dataField.getText().contains("2")==true || dataField.getText().contains("6")==true
				|| dataField.getText().contains("3")==true || dataField.getText().contains("7")==true
				|| dataField.getText().contains("4")==true || dataField.getText().contains("8")==true
				|| dataField.getText().contains("5")==true || dataField.getText().contains("9")==true)
			dataField.setBorder(new LineBorder(Color.gray));
		
		if(projetosField.getText().trim().isEmpty()==false)
			projetosField.setBorder(new LineBorder(Color.gray));
		
		if(nomeField.getText().trim().isEmpty()==false && 
				(telefoneField.getText().contains("0")==true || telefoneField.getText().contains("1")==true
				|| telefoneField.getText().contains("2")==true || telefoneField.getText().contains("6")==true
				|| telefoneField.getText().contains("3")==true || telefoneField.getText().contains("7")==true
				|| telefoneField.getText().contains("4")==true || telefoneField.getText().contains("8")==true
				|| telefoneField.getText().contains("5")==true || telefoneField.getText().contains("9")==true)
			&& endField.getText().trim().isEmpty()==false 
			&& codField.getText().trim().isEmpty()==false
			&& (sexoBox.getSelectedIndex()==0 || sexoBox.getSelectedIndex()==1 || sexoBox.getSelectedIndex()==2)
			&& (depBox.getSelectedIndex()==0 || depBox.getSelectedIndex()==1 || depBox.getSelectedIndex()==2 || 
			depBox.getSelectedIndex()==3 || depBox.getSelectedIndex()==4 || depBox.getSelectedIndex()==5) 
			&& (cargahBox.getSelectedIndex()==0 || cargahBox.getSelectedIndex()==1 )
			&& (check.isSelected()==true || comissaoField.getText().trim().isEmpty()==false)
			&& (check1.isSelected()==true || salarioField.getText().trim().isEmpty()==false)
			&& (dataField.getText().contains("0")==true || dataField.getText().contains("1")==true
					|| dataField.getText().contains("2")==true || dataField.getText().contains("6")==true
					|| dataField.getText().contains("3")==true || dataField.getText().contains("7")==true
					|| dataField.getText().contains("4")==true || dataField.getText().contains("8")==true
					|| dataField.getText().contains("5")==true || dataField.getText().contains("9")==true) 
			&& projetosField.getText().trim().isEmpty()==false) 
			return true;

		else 
			return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Método construtor que chama a função para criar um formulário
	 */
	public TelinhaOperario() {
		super("cadastro de operário");
		criarFormulario();
		
		
	}
	
	String select;
	
	JTextField nomeField = new JTextField(30);
	JTextField codField = new JTextField(30);
	JTextField telefoneField = new JTextField(30);
	JComboBox<String> sexoBox = new JComboBox<String>();
	JTextField endField = new JTextField(30);
	JComboBox<String> depBox = new JComboBox<String>();
	JTextField comissaoField = new JTextField(30);
	JCheckBox check = new JCheckBox();
	JComboBox<String> cargahBox = new JComboBox<String>();
	JTextField salarioField = new JTextField(30);
	JCheckBox check1 = new JCheckBox();
	JTextField projetosField = new JTextField(30);
	JTextField projetos1Field = new JTextField(30);
	JTextField projetos2Field = new JTextField(30);
	JTextField projetos3Field = new JTextField(30);
	JTextField dataField = new JTextField(30);
	
	TelinhaDependentes envia;
	TelinhaTrabalho envia1;
	
	MaskFormatter telMask;
	MaskFormatter dateMask;
	MaskFormatter nomeMask;
	
	/**
	 * Método que seleciona o que pode entrar no textField
	 * @param tamanho da String
	 * @param caracteres permitidos
	 * @return JTextField mas com limitações
	 */
	public JTextField DefinirTiposCaracteresETamanho(int tamanho,String caracteres)
	{
		try
		{
			String quantidade="";

			for(int i=0 ; i < tamanho; i++)
			{
				quantidade=quantidade+"*";
			}
			javax.swing.text.MaskFormatter nome=new javax.swing.text.MaskFormatter(quantidade);

			nome.setValidCharacters(caracteres);
			

			return new javax.swing.JFormattedTextField(nome);
		}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null,"Ocorreu um erro");
			return new JTextField();
		}
	}
	
	/**
	 * Método que cria formulário de cadastro de operário
	 */
	public void criarFormulario() {
		setLayout(new BorderLayout());
		
		JPanel panelCadastro = new JPanel();
		panelCadastro.setLayout(null);
		
		JLabel titulo = new JLabel("Dados pessoais");
		titulo.setFont(new Font("Verdana", Font.PLAIN,16));
		titulo.setBounds(50, 15, 400, 20);
		
		JLabel nomeLabel = new JLabel("Nome *");
		nomeLabel.setBounds(50, 40, 100, 20);
		nomeField = DefinirTiposCaracteresETamanho(60," abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZçÇéáíúóÁÉÓÍÚãõÃÕ");
		nomeField.setBounds(120, 40, 400, 20);
	
		JLabel codLabel = new JLabel("Código*");
		codLabel.setBounds(540, 40, 100, 20);
		codField.setBounds(590, 40, 50, 20);
		
		JLabel telefoneLabel = new JLabel("Telefone *");
		telefoneLabel.setBounds(50, 70, 100, 20);
		// formato que faz com que o campo do telefone fique no formato pronto para receber o número 
				try {
					telMask = new MaskFormatter("(##)#####-####");
				    
				    telefoneField = new JFormattedTextField(telMask ); 
					
				} catch (ParseException e) {
				    // TODO Auto-generated catch block
				    e.printStackTrace();
				}
		telefoneField.setBounds(120, 70, 100, 20);
		
		JLabel sexoLabel = new JLabel("Sexo*");
		sexoLabel.setBounds(240, 70, 100, 20);

		sexoBox.insertItemAt("feminino", 0);
		sexoBox.insertItemAt("masculino", 1);
		sexoBox.insertItemAt("outros", 2);
		
		sexoBox.setBounds(280, 70, 100, 20);
		
		JLabel dataLabel = new JLabel("Data de nascimento*");
		dataLabel.setBounds(400, 70, 170, 20);
		
		// formato que faz com que o campo da data fique no formato pronto para receber a data no formato adequado 
				try {
				    dateMask = new MaskFormatter("##/##/####");
				    
				    dataField = new JFormattedTextField(dateMask ); 
					
				} catch (ParseException e) {
				    // TODO Auto-generated catch block
				    e.printStackTrace();
				}
		this.dataField.setBounds(530, 70, 80, 20);
		
		
		JLabel endLabel = new JLabel("Endereço *");
		endLabel.setBounds(50, 100, 100, 20);
		endField.setBounds(120, 100, 400, 20);
		
		JButton adcDependentes = new JButton("Adicionar dependentes");
		adcDependentes.setBounds(120, 130, 400, 20);
		
		JLabel titulo1 = new JLabel("Dados empresariais");
		titulo1.setFont(new Font("Verdana", Font.PLAIN,16));
		titulo1.setBounds(50, 180, 400, 20);
		
		JLabel depLabel = new JLabel("Departamento *");
		depLabel.setBounds(50, 210, 100, 20);

		depBox.insertItemAt("RH", 0);
		depBox.insertItemAt("Administrativo", 1);
		depBox.insertItemAt("Comercial", 2);
		depBox.insertItemAt("Financeiro", 3);
		depBox.insertItemAt("Contábil", 4);
		depBox.insertItemAt("Outros", 5);
		
		depBox.setBounds(150,210, 120, 20);
		
		JLabel comissaoLabel = new JLabel("Comissão");
		comissaoLabel.setBounds(290, 210, 100, 20);
		comissaoField.setBounds(350, 210, 100, 20);
		
		JLabel n1= new JLabel("prefiro não dizer");
		n1.setBounds(470, 210, 100, 20);
		check.setBounds(450, 210, 20, 20);
		
		JLabel cargahLabel = new JLabel("Carga horária *");
		cargahLabel.setBounds(50, 240, 100, 20);

		cargahBox.insertItemAt("6 horas", 0);
		cargahBox.insertItemAt("8 horas", 1);
		
		cargahBox.setBounds(150, 240, 100, 20);
		
		JLabel salarioLabel = new JLabel("Salário");
		salarioLabel.setBounds(290, 240, 100, 20);
		salarioField.setBounds(350, 240, 100, 20);
		
		check1.setBounds(450, 240, 50, 20);
		
		JLabel n2= new JLabel("prefiro não dizer");
		n2.setBounds(470, 240, 100, 20);
		check1.setBounds(450, 240, 20, 20);
		
		JLabel projetosLabel = new JLabel("Habilidades *");
		projetosLabel.setBounds(50, 270, 100, 20);
		projetosField.setBounds(150, 270, 400, 20);
		projetos1Field.setBounds(150, 300, 400, 20);
		projetos2Field.setBounds(150, 330, 400, 20);
		projetos3Field.setBounds(150, 360, 400, 20);
		
		JButton adcTrabalho = new JButton("Adicionar trabalho");
		adcTrabalho.setBounds(150, 390, 400, 20);
		
		panelCadastro.add(nomeLabel);
		panelCadastro.add(nomeField);
		panelCadastro.add(codLabel);
		panelCadastro.add(codField);
		panelCadastro.add(endLabel);
		panelCadastro.add(endField);
		panelCadastro.add(sexoLabel);
		panelCadastro.add(sexoBox);
		panelCadastro.add(dataLabel);
		panelCadastro.add(this.dataField);
		panelCadastro.add(adcDependentes);
		panelCadastro.add(check1);
		panelCadastro.add(depLabel);
		panelCadastro.add(depBox);
		panelCadastro.add(comissaoLabel);
		panelCadastro.add(comissaoField);
		panelCadastro.add(cargahLabel);
		panelCadastro.add(cargahBox);
		panelCadastro.add(salarioLabel);
		panelCadastro.add(salarioField);
		panelCadastro.add(projetosLabel);
		panelCadastro.add(projetosField);
		panelCadastro.add(projetos1Field);
		panelCadastro.add(projetos2Field);
		panelCadastro.add(projetos3Field);
		panelCadastro.add(telefoneLabel);
		panelCadastro.add(telefoneField);
		panelCadastro.add(titulo);
		panelCadastro.add(titulo1);
		panelCadastro.add(check);
		panelCadastro.add(n1);
		panelCadastro.add(n2);
		panelCadastro.add(adcTrabalho);
		
		JButton botaoSalvar = new JButton ("Salvar");
		botaoSalvar.setBounds(300, 420, 100, 20);
		
		panelCadastro.add(botaoSalvar);
		
		
		adcDependentes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(envia == null) {
					envia = new TelinhaDependentes();
					envia.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					envia.setSize(700,500);
					envia.setVisible(true);
					envia.recebendo(nomeField.getText());
					envia.checkBox.setSelectedIndex(1);
					
					envia.nomeField.addKeyListener(new KeyAdapter() {
						public void keyPressed(KeyEvent e) {
							envia.nomeField.setText(nomeField.getText());
						}
						});
					
			}
				else {
					envia.setVisible(true);
					envia.setState(TelinhaDependentes.NORMAL);
				}
				
			}
			
		});
		
		adcTrabalho.addActionListener(new ActionListener() {

			@Override
			//essa função além de abrir um novo frame, leva o nome do gerente para o frame do cadastro de projetos
			public void actionPerformed(ActionEvent e) {
				if(envia1 == null) {
					envia1 = new TelinhaTrabalho();
					envia1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					envia1.setSize(700,500);
					envia1.setVisible(true);
					envia1.recebendo(nomeField.getText());
					
					envia1.nomeoperarioField.addKeyListener(new KeyAdapter() {
						public void keyPressed(KeyEvent e) {
							envia1.nomeoperarioField.setText(nomeField.getText());
						}
						});
					
				}
				else {
					envia1.setVisible(true);
					envia1.setState(TelinhaTrabalho.NORMAL);
				}
				
			}
			
		});
		
				check.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(check.isSelected()==true) {
							comissaoField.setEnabled(false);
						}
						else  {
							comissaoField.setEnabled(true);
						}
					}});
				
				check1.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(check1.isSelected()==true) {
							salarioField.setEnabled(false);
						}
						else  {
							salarioField.setEnabled(true);
						}
					}});
				
				botaoSalvar.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						
						Operario g= new Operario();
						String nome = nomeField.getText();
						g.setNome(nome);
						String tel = telefoneField.getText();
						g.setTelefone(tel);
						String end = endField.getText();
						g.setEndereco(end);
						
						String codigo = codField.getText();
						g.setCodigo(codigo);
						
						String sexo=null;
						if(sexoBox.getSelectedIndex()==0)sexo="feminino";g.setSexo(sexo);
						if(sexoBox.getSelectedIndex()==1)sexo="masculino";g.setSexo(sexo);
						if(sexoBox.getSelectedIndex()==2)sexo="outros";g.setSexo(sexo);
						
						String data = dataField.getText();
						g.setDatanasc(data);
						
						
						String depart=null;
						if(depBox.getSelectedIndex()==0)depart="RH";g.setDepartamento(depart);
						if(depBox.getSelectedIndex()==1)depart="Administrativo";g.setDepartamento(depart);
						if(depBox.getSelectedIndex()==2)depart="Comercial";g.setDepartamento(depart);
						if(depBox.getSelectedIndex()==3)depart="Financeiro";g.setDepartamento(depart);
						if(depBox.getSelectedIndex()==4)depart="Contábil";g.setDepartamento(depart);
						if(depBox.getSelectedIndex()==5)depart="Outros";g.setDepartamento(depart);
						
						String comissao;
						if(check.isSelected()==true)comissao="-";
						else comissao=comissaoField.getText();
						g.setComissao(comissao);
						
						String cargah=null;
						if(cargahBox.getSelectedIndex()==0)cargah="6 horas";g.setCargah(cargah);
						if(cargahBox.getSelectedIndex()==1)cargah="8 horas";g.setCargah(cargah);
						
						String salario;
						if(check1.isSelected()==true)salario="-";
						else salario= salarioField.getText();
						g.setSalario(salario);
						
						String habilidade;
						if(projetosField.getText().isEmpty()==true)habilidade="-";
						else habilidade=projetosField.getText();
						g.setHabilidade(habilidade);
						String habilidade1;
						if(projetos1Field.getText().isEmpty()==true)habilidade1="-";
						else habilidade1=projetos1Field.getText();
						g.setHabilidade1(habilidade1);
						String habilidade2;
						if(projetos2Field.getText().isEmpty()==true)habilidade2="-";
						else habilidade2=projetos2Field.getText();
						g.setHabilidade2(habilidade2);
						String habilidade3;
						if(projetos3Field.getText().isEmpty()==true)habilidade3="-";
						else habilidade3=projetos3Field.getText();
						g.setHabilidade3(habilidade3);
						
					
						valida();
						if(valida()==true) {
							g.cadastrooperario(nome,tel,end,codigo,sexo,data,depart,comissao,cargah,salario,habilidade,habilidade1,habilidade2,habilidade3);
							JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
						}
						else {
							JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
							
						}
					}});
				
				
		
		add(panelCadastro,BorderLayout.CENTER);
		
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		
	}

}
