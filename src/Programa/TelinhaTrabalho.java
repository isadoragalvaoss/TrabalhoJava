package Programa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

/**
 * Cadastro de trabalho
 * @author isadora
 *
 */
public class TelinhaTrabalho extends JFrame{

private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {

	}
	
	/**
	 * Método construtor que chama o método para criar um formulário de cadastro
	 */
	public TelinhaTrabalho() {
		super("cadastro de trabalho");
		criarFormulario();
	}
	/**
	 * Método que recebe a String do JTextField do formulário anterior
	 * @param recebe String
	 */
	public void recebendo(String recebe) {
		nomeoperarioField.setText(recebe);
		nomeoperarioField.setEditable(false);
	}
	
public boolean valida() {
		
		if(nomeoperarioField.getText().trim().isEmpty())
			nomeoperarioField.setBorder(new LineBorder(Color.red));
		
		if(nomeField.getText().trim().isEmpty())
			nomeField.setBorder(new LineBorder(Color.red));
		
		if(dataField1.getText().contains("0")==false || dataField1.getText().contains("1")==false
				|| dataField1.getText().contains("2")==false || dataField1.getText().contains("6")==false
				|| dataField1.getText().contains("3")==false || dataField1.getText().contains("7")==false
				|| dataField1.getText().contains("4")==false || dataField1.getText().contains("8")==false
				|| dataField1.getText().contains("5")==false || dataField1.getText().contains("9")==false)
			dataField1.setBorder(new LineBorder(Color.red));
		
		if(dataField2.getText().contains("0")==false || dataField2.getText().contains("1")==false
				|| dataField2.getText().contains("2")==false || dataField2.getText().contains("6")==false
				|| dataField2.getText().contains("3")==false || dataField2.getText().contains("7")==false
				|| dataField2.getText().contains("4")==false || dataField2.getText().contains("8")==false
				|| dataField2.getText().contains("5")==false || dataField2.getText().contains("9")==false)
			dataField2.setBorder(new LineBorder(Color.red));
		
		if(text.getText().trim().isEmpty())
			text.setBorder(new LineBorder(Color.red));
		
		if(nomeoperarioField.getText().trim().isEmpty()==false)
			nomeoperarioField.setBorder(new LineBorder(Color.gray));
		
		if(nomeField.getText().trim().isEmpty()==false)
			nomeField.setBorder(new LineBorder(Color.gray));
		
		if(dataField1.getText().contains("0")==true || dataField1.getText().contains("1")==true
				|| dataField1.getText().contains("2")==true || dataField1.getText().contains("6")==true
				|| dataField1.getText().contains("3")==true || dataField1.getText().contains("7")==true
				|| dataField1.getText().contains("4")==true || dataField1.getText().contains("8")==true
				|| dataField1.getText().contains("5")==true || dataField1.getText().contains("9")==true)
			dataField1.setBorder(new LineBorder(Color.gray));
		
		if(dataField2.getText().contains("0")==true || dataField2.getText().contains("1")==true
				|| dataField2.getText().contains("2")==true || dataField2.getText().contains("6")==true
				|| dataField2.getText().contains("3")==true || dataField2.getText().contains("7")==true
				|| dataField2.getText().contains("4")==true || dataField2.getText().contains("8")==true
				|| dataField2.getText().contains("5")==true || dataField2.getText().contains("9")==true)
			dataField2.setBorder(new LineBorder(Color.gray));
		
		if(text.getText().trim().isEmpty()==false)
			text.setBorder(new LineBorder(Color.gray));
		
		if(nomeoperarioField.getText().trim().isEmpty()==false 
			&& nomeField.getText().trim().isEmpty()==false 
			&& (dataField1.getText().contains("0")==true || dataField1.getText().contains("1")==true
					|| dataField1.getText().contains("2")==true || dataField1.getText().contains("6")==true
					|| dataField1.getText().contains("3")==true || dataField1.getText().contains("7")==true
					|| dataField1.getText().contains("4")==true || dataField1.getText().contains("8")==true
					|| dataField1.getText().contains("5")==true || dataField1.getText().contains("9")==true) 
			&& (dataField2.getText().contains("0")==true || dataField2.getText().contains("1")==true
			|| dataField2.getText().contains("2")==true || dataField2.getText().contains("6")==true
			|| dataField2.getText().contains("3")==true || dataField2.getText().contains("7")==true
			|| dataField2.getText().contains("4")==true || dataField2.getText().contains("8")==true
			|| dataField2.getText().contains("5")==true || dataField2.getText().contains("9")==true) 
			&& text.getText().trim().isEmpty()==false) 
			return true;

		else 
			return false;
		
	}
	String select;
	JTextField nomeoperarioField= new JTextField(30);
	JTextField dataField1= new JTextField(30);
	JTextField dataField2= new JTextField(30);
	JTextField nomeField = new JTextField(30);
	
	JTextArea text = new JTextArea(30, 30);
	JTextArea text1 = new JTextArea(30, 30);
	JTextArea text2 = new JTextArea(30, 30);
	JTextArea text3 = new JTextArea(30, 30);
	
	JScrollPane historicoField = new JScrollPane(text);
	JScrollPane historico1Field = new JScrollPane(text1);
	JScrollPane historico2Field = new JScrollPane(text2);
	JScrollPane historico3Field = new JScrollPane(text3);
	
	MaskFormatter dateMask;
	
	/**
	 * Método que cria um formulário de cadastro
	 */
	public void criarFormulario() {
		
		
		setLayout(new BorderLayout());
		
		JPanel panelTitulo= new JPanel();
		panelTitulo.setLayout(null);
	
		
		JPanel panelCadastro = new JPanel();
		panelCadastro.setLayout(null);
		
		JLabel titulo = new JLabel("Dados do trabalho ");
		titulo.setFont(new Font("Verdana", Font.PLAIN,16));
		titulo.setBounds(50,20,400,20);
	
		JLabel nomegerenteLabel = new JLabel("Operário");
		
		nomegerenteLabel.setBounds(50,50,100,20);
		nomeoperarioField.setBounds(150,50,400,20);
		
		JLabel nomeLabel = new JLabel("Trabalho");
		nomeLabel.setBounds(50,80,100,20);
		nomeField.setBounds(150,80,300,20);
		
		JLabel codigoLabel = new JLabel("Código");
		JTextField codigoField = new JTextField(30);
		codigoLabel.setBounds(480,80,100,20);
		codigoField.setBounds(530,80,50,20);
		
		JLabel dataLabel1 = new JLabel("Data de início");
		dataLabel1.setBounds(50, 110, 170, 20);
		// formato que faz com que o campo da data fique no formato pronto para receber a data no formato adequado 
		try {
		    dateMask = new MaskFormatter("##/##/####");
		    
		    dataField1 = new JFormattedTextField(dateMask ); 
			
		} catch (ParseException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		dataField1.setBounds(150, 110, 80, 20);
		//this.dataField1.setValue(new Date());
		
		JButton botaoData = new JButton ("*");
		botaoData.setBounds(600, 360, 20, 18);
		
		JLabel dataLabel2 = new JLabel("Data de finalização");
		dataLabel2.setBounds(260, 110, 170, 20);
		try {
		    dateMask = new MaskFormatter("##/##/####");
		    
		    dataField2 = new JFormattedTextField(dateMask ); 
			
		} catch (ParseException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		dataField2.setBounds(380, 110, 80, 20);
		//this.dataField2.setValue(new Date());
		
		text.setLineWrap(true);
		text1.setLineWrap(true);
		text2.setLineWrap(true);
		text3.setLineWrap(true);
		
		JLabel historicoLabel = new JLabel("Histórico de atividades"); 
		historicoLabel.setBounds(50,140,150,40);
		historicoField.setBounds(190,140,400,40);
		historico1Field.setBounds(190,180,400,40);
		historico2Field.setBounds(190,220,400,40);
		historico3Field.setBounds(190,260,400,40);
		
		panelCadastro.add(titulo);
		panelCadastro.add(nomeLabel);
		panelCadastro.add(nomeField);
		panelCadastro.add(codigoLabel);
		panelCadastro.add(codigoField);
		panelCadastro.add(nomegerenteLabel);
		panelCadastro.add(nomeoperarioField);
		panelCadastro.add(dataLabel1);
		panelCadastro.add(dataField1);
		panelCadastro.add(dataLabel2);
		panelCadastro.add(dataField2);
		panelCadastro.add(historicoLabel);
		panelCadastro.add(historicoField);
		panelCadastro.add(historico1Field);
		panelCadastro.add(historico2Field);
		panelCadastro.add(historico3Field);
		
		JButton botaoSalvar = new JButton ("Salvar");
		botaoSalvar.setBounds(300, 420, 100, 20);
		
		panelCadastro.add(botaoSalvar);
		
		//add(panelTitulo);
		add(panelCadastro);
		
		botaoSalvar.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent e) {
				
				Trabalho g= new Trabalho();
				String nome = null;
				nome=nomeField.getText();
				g.setNome(nome);
				
				String codigo = codigoField.getText();
				g.setCodigo(codigo);
				
				String nome1 = null;
				nome1=nomeoperarioField.getText();
				g.setNome(nome1);
				
				String data = dataField1.getText();
				g.setDatai(data);
				
				String data1 = dataField2.getText();
				g.setDataf(data1);
				
				
				String area=null;
				if(text.getText().isEmpty()==true)area="-";
				else area= text.getText();
				g.setHistoricos(area);
				
				String area1=null;
				if(text1.getText().isEmpty()==true)area1="-";
				else area1= text1.getText();
				g.setHistoricos(area1);
				
				String area2=null;
				if(text2.getText().isEmpty()==true)area2="-";
				else area2= text2.getText();
				g.setHistoricos(area2);
				
				String area3=null;
				if(text3.getText().isEmpty()==true)area3="-";
				else area3= text3.getText();
				g.setHistoricos(area3);
				
				//chama o método valida para conferir se todos os campos estão preenchidos
				//se tudo for preenchido corretamente aparece a mensagem "salvo com sucesso!"
				//se algum campo não tiver preenchido, aparece outro alerta para preencher
				valida();
				if(valida()==true) {
					g.cadastrotrabalho(codigo,nome, nome1, data, data1, area,area1,area2,area3);
					JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
					
				}
			}
		});
		
	}

}
