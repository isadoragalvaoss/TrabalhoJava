package Programa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

/**
 * Cadastro de dependentes de funcionários
 * @author isadora
 *
 */
public class TelinhaDependentes extends JFrame implements PropertyChangeListener{
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	JTextField nomeField = new JTextField(30);
	JComboBox<String> checkBox = new JComboBox<String>();
	JTextField dataField1 = new JTextField(30);
	JTextField dataField2 = new JTextField(30);
	JTextField dataField3 = new JTextField(30);
	JTextField dataField4 = new JTextField(30);
	JTextField dataField5 = new JTextField(30);
	JTextField dataField6 = new JTextField(30);
	JTextField dataField7 = new JTextField(30);
	JComboBox<String> depBox1 = new JComboBox<String>();
	JTextField field1 = new JTextField(30);
	
	MaskFormatter dateMask;
	
	/**
	 * Método construtor que chama a função para criar um formulário
	 */
	public TelinhaDependentes() {
		super("cadastro de dependentes");
		criarFormulario();
		
		
	}
	
	/**
	 * Método que recebe o mesmo nome que tava no formulário anterior, para continuar o mesmo
	 * @param recebe String 
	 */
	public void recebendo(String recebe) {
		
		nomeField.setText(recebe);
		nomeField.setEditable(false);
	}
	
	/**
	 * Método que valida cada campo para ver se todos estão preenchidos
	 * Os que estiverem, ficam cinza
	 * Os que não estiverem, ficam vermelho
	 * @return True quando todos estiverem cinza, False quando algum estiver vermelho
	 */
	public boolean valida() {
		
		if(field1.getText().trim().isEmpty())
			field1.setBorder(new LineBorder(Color.red));
		
		if(depBox1.getSelectedIndex()!=0 || depBox1.getSelectedIndex()!=1 || depBox1.getSelectedIndex()!=2 || 
				depBox1.getSelectedIndex()!=3 || depBox1.getSelectedIndex()!=4) 
			depBox1.setBorder(new LineBorder(Color.red));
		
		
		if(dataField1.getText().contains("0")==false || dataField1.getText().contains("1")==false
				|| dataField1.getText().contains("2")==false || dataField1.getText().contains("6")==false
				|| dataField1.getText().contains("3")==false || dataField1.getText().contains("7")==false
				|| dataField1.getText().contains("4")==false || dataField1.getText().contains("8")==false
				|| dataField1.getText().contains("5")==false || dataField1.getText().contains("9")==false)
			dataField1.setBorder(new LineBorder(Color.red));
		
		
		if(field1.getText().trim().isEmpty()==false)
			field1.setBorder(new LineBorder(Color.gray));
		
		if(depBox1.getSelectedIndex()==0 || depBox1.getSelectedIndex()==1 || depBox1.getSelectedIndex()==2 || depBox1.getSelectedIndex()==3 || 
				depBox1.getSelectedIndex()==4) depBox1.setBorder(new LineBorder(Color.gray));
		
		if(dataField1.getText().contains("0")==true || dataField1.getText().contains("1")==true
				|| dataField1.getText().contains("2")==true || dataField1.getText().contains("6")==true
				|| dataField1.getText().contains("3")==true || dataField1.getText().contains("7")==true
				|| dataField1.getText().contains("4")==true || dataField1.getText().contains("8")==true
				|| dataField1.getText().contains("5")==true || dataField1.getText().contains("9")==true)
			dataField1.setBorder(new LineBorder(Color.gray));
		
		
		if(field1.getText().trim().isEmpty()==false 
			&& (depBox1.getSelectedIndex()==0 || depBox1.getSelectedIndex()==1 || depBox1.getSelectedIndex()==2 || 
					depBox1.getSelectedIndex()==3 || depBox1.getSelectedIndex()==4) 
			&& (dataField1.getText().contains("0")==true || dataField1.getText().contains("1")==true
					|| dataField1.getText().contains("2")==true || dataField1.getText().contains("6")==true
					|| dataField1.getText().contains("3")==true || dataField1.getText().contains("7")==true
					|| dataField1.getText().contains("4")==true || dataField1.getText().contains("8")==true
					|| dataField1.getText().contains("5")==true || dataField1.getText().contains("9")==true) ) 
			return true;

		else 
			return false;
		
	}
	
	String select;
	
	/**
	 * Método que cria um formulário de cadastro de dependentes
	 */
	public void criarFormulario() {
		setLayout(new BorderLayout());
		
		JPanel panelCadastro = new JPanel();
		panelCadastro.setLayout(null);
		
		JLabel titulo = new JLabel("Dados do funcionário");
		titulo.setFont(new Font("Verdana", Font.PLAIN,16));
		titulo.setBounds(50, 15, 400, 20);
		
		JLabel nomeLabel = new JLabel("Nome");
		nomeLabel.setBounds(50, 40, 100, 20);
		
		nomeField.setBounds(120, 40, 400, 20);
		
		checkBox.insertItemAt("gerente", 0);
		checkBox.insertItemAt("operário", 1);
		checkBox.setBounds(540, 40, 100, 20);

		JLabel titulo1 = new JLabel("Dados dos dependentes");
		titulo1.setFont(new Font("Verdana", Font.PLAIN,16));
		titulo1.setBounds(50, 70, 400, 20);
		
		JLabel relacao = new JLabel("Relação");
		relacao.setBounds(60, 95, 400, 20);
		
		JLabel nome = new JLabel("Nome");
		nome.setBounds(290, 95, 400, 20);
		

		depBox1.insertItemAt("cônjuge", 0);
		depBox1.insertItemAt("filho", 1);
		depBox1.insertItemAt("filha", 2);
		depBox1.insertItemAt("pai", 3);
		depBox1.insertItemAt("mãe", 4);
		depBox1.setBounds(50, 120, 80, 20);
		
		field1.setBounds(180, 120, 300, 20);
		
		JComboBox<String> depBox2 = new JComboBox<String>();

		depBox2.insertItemAt("cônjuge", 0);
		depBox2.insertItemAt("filho", 1);
		depBox2.insertItemAt("filha", 2);
		depBox2.insertItemAt("pai", 3);
		depBox2.insertItemAt("mãe", 4);
		depBox2.setBounds(50, 160, 80, 20);
		
		JTextField field2 = new JTextField(30);
		field2.setBounds(180, 160, 300, 20);
		
		JComboBox<String> depBox3 = new JComboBox<String>();

		depBox3.insertItemAt("cônjuge", 0);
		depBox3.insertItemAt("filho", 1);
		depBox3.insertItemAt("filha", 2);
		depBox3.insertItemAt("pai", 3);
		depBox3.insertItemAt("mãe", 4);
		depBox3.setBounds(50, 200, 80, 20);
		
		JTextField field3 = new JTextField(30);
		field3.setBounds(180, 200, 300, 20);
		
		JComboBox<String> depBox4 = new JComboBox<String>();

		depBox4.insertItemAt("cônjuge", 0);
		depBox4.insertItemAt("filho", 1);
		depBox4.insertItemAt("filha", 2);
		depBox4.insertItemAt("pai", 3);
		depBox4.insertItemAt("mãe", 4);
		depBox4.setBounds(50, 240, 80, 20);
		
		JTextField field4 = new JTextField(30);
		field4.setBounds(180, 240, 300, 20);
		
		JComboBox<String> depBox5 = new JComboBox<String>();

		depBox5.insertItemAt("cônjuge", 0);
		depBox5.insertItemAt("filho", 1);
		depBox5.insertItemAt("filha", 2);
		depBox5.insertItemAt("pai", 3);
		depBox5.insertItemAt("mãe", 4);
		depBox5.setBounds(50, 280, 80, 20);
		
		JTextField field5 = new JTextField(30);
		field5.setBounds(180, 280, 300, 20);
		
		JComboBox<String> depBox6 = new JComboBox<String>();

		depBox6.insertItemAt("cônjuge", 0);
		depBox6.insertItemAt("filho", 1);
		depBox6.insertItemAt("filha", 2);
		depBox6.insertItemAt("pai", 3);
		depBox6.insertItemAt("mãe", 4);
		depBox6.setBounds(50, 320, 80, 20);
		
		JTextField field6 = new JTextField(30);
		field6.setBounds(180, 320, 300, 20);
		
		JComboBox<String> depBox7 = new JComboBox<String>();

		depBox7.insertItemAt("cônjuge", 0);
		depBox7.insertItemAt("filho", 1);
		depBox7.insertItemAt("filha", 2);
		depBox7.insertItemAt("pai", 3);
		depBox7.insertItemAt("mãe", 4);
		depBox7.setBounds(50, 360, 80, 20);
		
		JTextField field7 = new JTextField(30);
		field7.setBounds(180, 360, 300, 20);
		
		
		JLabel dataLabel1 = new JLabel("Data de nascimento");
		dataLabel1.setBounds(500, 95, 400, 20);
		
		// formato que faz com que o campo da data fique no formato pronto para receber a data no formato adequado 
				try {
				    dateMask = new MaskFormatter("##/##/####");
				    dataField1 = new JFormattedTextField(dateMask); 
					
				} catch (ParseException e) {
				    // TODO Auto-generated catch block
				    e.printStackTrace();
				}
		dataField1.setBounds(530, 120, 80, 20);
				
		
			try {
				dateMask = new MaskFormatter("##/##/####");
				dataField2 = new JFormattedTextField(dateMask); 
			
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		dataField2.setBounds(530, 160, 80, 20);
		
		
			try {
				dateMask = new MaskFormatter("##/##/####");
				dataField3 = new JFormattedTextField(dateMask); 
		
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		dataField3.setBounds(530, 200, 80, 20);
		
		
			try {
				dateMask = new MaskFormatter("##/##/####");
				dataField4 = new JFormattedTextField(dateMask); 
		
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		dataField4.setBounds(530, 240, 80, 20);
		
		
			try {
				dateMask = new MaskFormatter("##/##/####");
				dataField5 = new JFormattedTextField(dateMask); 
		
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		dataField5.setBounds(530, 280, 80, 20);
		
		
			try {
				dateMask = new MaskFormatter("##/##/####");
				dataField6 = new JFormattedTextField(dateMask); 
		
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		dataField6.setBounds(530, 320, 80, 20);
		
		
			try {
				dateMask = new MaskFormatter("##/##/####");
				dataField7 = new JFormattedTextField(dateMask); 
		
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		dataField7.setBounds(530, 360, 80, 20);
		
		

		panelCadastro.add(nomeLabel);
		panelCadastro.add(nomeField);
		panelCadastro.add(checkBox);
		panelCadastro.add(depBox1);
		panelCadastro.add(depBox2);
		panelCadastro.add(depBox3);
		panelCadastro.add(depBox4);
		panelCadastro.add(depBox5);
		panelCadastro.add(depBox6);
		panelCadastro.add(depBox7);
		panelCadastro.add(field1);
		panelCadastro.add(field2);
		panelCadastro.add(field3);
		panelCadastro.add(field4);
		panelCadastro.add(field5);
		panelCadastro.add(field6);
		panelCadastro.add(field7);
		panelCadastro.add(relacao);
		panelCadastro.add(nome);
		panelCadastro.add(dataLabel1);
		panelCadastro.add(dataField1);
		panelCadastro.add(dataField2);
		panelCadastro.add(dataField3);
		panelCadastro.add(dataField4);
		panelCadastro.add(dataField5);
		panelCadastro.add(dataField6);
		panelCadastro.add(dataField7);
		panelCadastro.add(titulo);
		panelCadastro.add(titulo1);
		
		JButton botaoSalvar = new JButton ("Salvar");
		botaoSalvar.setBounds(300, 420, 100, 20);
		
		panelCadastro.add(botaoSalvar);
		//panelCadastro.add(botaoData);
	
				
				botaoSalvar.addActionListener(new ActionListener() {


					public void actionPerformed(ActionEvent e) {
						
						Dependentes g= new Dependentes();
						
						String nome = nomeField.getText();
						g.setNome(nome);
						
						String check=null;
						if(checkBox.getSelectedIndex()==0)check="gerente";g.setSexo(check);
						if(checkBox.getSelectedIndex()==1)check="operário";g.setSexo(check);
						
						String n1=field1.getText();
						String n2=field2.getText();
						String n3=field3.getText();
						String n4=field4.getText();
						String n5=field5.getText();
						String n6=field6.getText();
						String n7=field7.getText();
						
						String r1=null,r2=null,r3=null,r4=null,r5=null,r6=null,r7=null;
						
						if(depBox1.getSelectedIndex()==0)r1="cônjuge";g.setSexo(r1);
						if(depBox1.getSelectedIndex()==1)r1="filho";g.setSexo(r1);
						if(depBox1.getSelectedIndex()==2)r1="filha";g.setSexo(r1);
						if(depBox1.getSelectedIndex()==3)r1="pai";g.setSexo(r1);
						if(depBox1.getSelectedIndex()==4)r1="mãe";g.setSexo(r1);
						
						if(depBox2.getSelectedIndex()==0)r2="cônjuge";g.setSexo(r2);
						if(depBox2.getSelectedIndex()==1)r2="filho";g.setSexo(r2);
						if(depBox2.getSelectedIndex()==2)r2="filha";g.setSexo(r2);
						if(depBox2.getSelectedIndex()==3)r2="pai";g.setSexo(r2);
						if(depBox2.getSelectedIndex()==4)r2="mãe";g.setSexo(r2);
						
						if(depBox3.getSelectedIndex()==0)r3="cônjuge";g.setSexo(r3);
						if(depBox3.getSelectedIndex()==1)r3="filho";g.setSexo(r3);
						if(depBox3.getSelectedIndex()==2)r3="filha";g.setSexo(r3);
						if(depBox3.getSelectedIndex()==3)r3="pai";g.setSexo(r3);
						if(depBox3.getSelectedIndex()==4)r3="mãe";g.setSexo(r3);
						
						if(depBox4.getSelectedIndex()==0)r4="cônjuge";g.setSexo(r4);
						if(depBox4.getSelectedIndex()==1)r4="filho";g.setSexo(r4);
						if(depBox4.getSelectedIndex()==2)r4="filha";g.setSexo(r4);
						if(depBox4.getSelectedIndex()==3)r4="pai";g.setSexo(r4);
						if(depBox4.getSelectedIndex()==4)r4="mãe";g.setSexo(r4);
						
						if(depBox5.getSelectedIndex()==0)r5="cônjuge";g.setSexo(r5);
						if(depBox5.getSelectedIndex()==1)r5="filho";g.setSexo(r5);
						if(depBox5.getSelectedIndex()==2)r5="filha";g.setSexo(r5);
						if(depBox5.getSelectedIndex()==3)r5="pai";g.setSexo(r5);
						if(depBox5.getSelectedIndex()==4)r5="mãe";g.setSexo(r5);
						
						if(depBox6.getSelectedIndex()==0)r6="cônjuge";g.setSexo(r6);
						if(depBox6.getSelectedIndex()==1)r6="filho";g.setSexo(r6);
						if(depBox6.getSelectedIndex()==2)r6="filha";g.setSexo(r6);
						if(depBox6.getSelectedIndex()==3)r6="pai";g.setSexo(r6);
						if(depBox6.getSelectedIndex()==4)r6="mãe";g.setSexo(r6);
						
						if(depBox7.getSelectedIndex()==0)r7="cônjuge";g.setSexo(r7);
						if(depBox7.getSelectedIndex()==1)r7="filho";g.setSexo(r7);
						if(depBox7.getSelectedIndex()==2)r7="filha";g.setSexo(r7);
						if(depBox7.getSelectedIndex()==3)r7="pai";g.setSexo(r7);
						if(depBox7.getSelectedIndex()==4)r7="mãe";g.setSexo(r7);
						
						String d1 = dataField1.getText();
						g.setDatanasc(d1);
						String d2 = dataField2.getText();
						g.setDatanasc(d2);
						String d3 = dataField3.getText();
						g.setDatanasc(d3);
						String d4 = dataField4.getText();
						g.setDatanasc(d4);
						String d5 = dataField5.getText();
						g.setDatanasc(d5);
						String d6 = dataField6.getText();
						g.setDatanasc(d6);
						String d7 = dataField7.getText();
						g.setDatanasc(d7);
						
						
						valida();
						if(valida()==true) {
							g.cadastrodependentes(nome,check,r1,n1,d1,r2,n2,d2,r3,n3,d3,r4,n4,d4,r5,n5,d5,r6,n6,d6,r7,n7,d7);
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
