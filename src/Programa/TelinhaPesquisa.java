package Programa;

import java.awt.BorderLayout;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Pesquisa de gerente, operário, trabalho e projetos
 * @author isadora
 *
 */
public class TelinhaPesquisa extends JFrame {
    private static final long serialVersionUID = -7042997375941726246L;
    private static final int labelsWidth = 80;
    private static final int textFieldColumns = 15;
    private static final int spaceBetweenAllComponents = 10;

    /**
     * Método construtor que faz com que o JFrame fique em formato de GridLayout
     */
    public TelinhaPesquisa() {
        super("Pesquisa");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel contentPane = new JPanel(new GridLayout(1, 2, 50, 50));
        contentPane.setBorder(BorderFactory.createEmptyBorder(spaceBetweenAllComponents, spaceBetweenAllComponents,
                spaceBetweenAllComponents, spaceBetweenAllComponents));
        setContentPane(contentPane);

        add(createLeftPanel());
        add(createRightPanel());

        setLocationByPlatform(true);
        pack();
    }

    JTextArea textArea1 = new JTextArea();
    
    /**
     * Método que cria o painel da direita que é a parte do textArea
     * @return Compontent
     */
    public Component createRightPanel() {
        JPanel mainPanel = new JPanel(new BorderLayout());

        JLabel productListLabel = new JLabel("");
        mainPanel.add(productListLabel, BorderLayout.PAGE_START);

   
        textArea1.setEditable(false);
        textArea1.add(createTextAreaPanel());

        JScrollPane listScrollPane = new JScrollPane(textArea1);
        mainPanel.add(listScrollPane, BorderLayout.CENTER);
        return mainPanel;
    }
    JTextField textField = new JTextField(textFieldColumns);
    JComboBox<String> checkBox = new JComboBox<String>();
    
    /**
     * Método que cria o painel da esquerda que é a parte de inserir os dados
     * @return Component
     */
    public Component createLeftPanel() {

        JPanel mainPanel = new JPanel(new BorderLayout(spaceBetweenAllComponents, spaceBetweenAllComponents));

        JPanel topPanel = new JPanel(new GridLayout(2, 1, spaceBetweenAllComponents, spaceBetweenAllComponents));
        topPanel.add(createStraightPanel("Nome ou código"));
        
        topPanel.add(createStraightPanel("Área"));
        mainPanel.add(topPanel, BorderLayout.PAGE_START);

        JPanel centerPanel = new JPanel(new BorderLayout());

        JLabel label = new JLabel("<html><p style='width:" + labelsWidth );
        label.setVerticalAlignment(JLabel.TOP);
        centerPanel.add(label, BorderLayout.LINE_START);

        centerPanel.add(createTextAreaPanel());
        

        checkBox.insertItemAt("Gerente", 0);
        checkBox.insertItemAt("Operario", 1);
        checkBox.insertItemAt("Projeto", 2);
        checkBox.insertItemAt("Trabalho", 3);
		
        topPanel.add(textField, BorderLayout.CENTER);
        topPanel.add(checkBox,BorderLayout.CENTER);

        mainPanel.add(centerPanel, BorderLayout.CENTER);
        return mainPanel;
    }
    
    /**
     * Método que cria TextArea
     * @return JPanel
     */
    public JPanel createTextAreaPanel() {
        JPanel mainPanel = new JPanel(new BorderLayout(spaceBetweenAllComponents, spaceBetweenAllComponents));


        JPanel buttonsPanel = new JPanel(new BorderLayout());

        JButton addButton = new JButton("Pesquisar");
        buttonsPanel.add(addButton, BorderLayout.LINE_START);
        
        addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(checkBox.getSelectedIndex()==0) {
				textArea1.setText("");
				String a = textField.getText();
				
				try {
				String path = "../gerente.txt";
					FileInputStream arquivo = new FileInputStream(path);
					InputStreamReader input = new InputStreamReader(arquivo);
					BufferedReader br = new BufferedReader(input);
					
					String linha;
					
					do {
					linha = br.readLine();
					if(linha!=null) {
					String[] palavras = linha.split(";");
					
					
					for(int i=0;i<palavras.length;i++){
						
						if(palavras[i].contains(a)) {
							textArea1.append("código: "+ palavras[0]); textArea1.append("\n");
							textArea1.append("nome: "+ palavras[1]); textArea1.append("\n");
							textArea1.append("telefone: "+ palavras[2]); textArea1.append("\n");
							textArea1.append("endereço: "+ palavras[3]); textArea1.append("\n");
							textArea1.append("sexo: "+ palavras[4]); textArea1.append("\n");
							textArea1.append("data de nascimento: "+ palavras[5]); textArea1.append("\n");
							textArea1.append("departamento: "+ palavras[6]); textArea1.append("\n");
							textArea1.append("comissão: "+ palavras[7]); textArea1.append("\n");
							textArea1.append("carga horária: "+ palavras[8]); textArea1.append("\n");
							textArea1.append("salário: "+ palavras[9]); textArea1.append("\n");textArea1.append("\n");
							
						}
					}
					}
					}
					
					while(linha!=null) ;
					
					}
					
					catch (IOException e1) {
						e1.printStackTrace();
						System.out.println("erro");
					}
			}
				if(checkBox.getSelectedIndex()==1) {
					textArea1.setText("");
					String a = textField.getText();
					
					try {
					String path = "../operario.txt";
						FileInputStream arquivo = new FileInputStream(path);
						InputStreamReader input = new InputStreamReader(arquivo);
						BufferedReader br = new BufferedReader(input);
						
						String linha;
						
						do {
						linha = br.readLine();
						if(linha!=null) {
						String[] palavras = linha.split(";");
						
						
						for(int i=0;i<palavras.length;i++){
							
							if(palavras[i].contains(a)) {
								textArea1.append("código: "+ palavras[0]); textArea1.append("\n");
								textArea1.append("nome: "+ palavras[1]); textArea1.append("\n");
								textArea1.append("telefone: "+ palavras[2]); textArea1.append("\n");
								textArea1.append("endereço: "+ palavras[3]); textArea1.append("\n");
								textArea1.append("sexo: "+ palavras[4]); textArea1.append("\n");
								textArea1.append("data de nascimento: "+ palavras[5]); textArea1.append("\n");
								textArea1.append("departamento: "+ palavras[6]); textArea1.append("\n");
								textArea1.append("comissão: "+ palavras[7]); textArea1.append("\n");
								textArea1.append("carga horária: "+ palavras[8]); textArea1.append("\n");
								textArea1.append("salário: "+ palavras[9]); textArea1.append("\n");
								textArea1.append("habilidade: "+ palavras[10]); textArea1.append("\n");
								textArea1.append("-  "+ palavras[11]); textArea1.append("\n");
								textArea1.append("- "+ palavras[12]); textArea1.append("\n");
								textArea1.append("- "+ palavras[13]); textArea1.append("\n");textArea1.append("\n");
								
							}
							
						}
						
						}
						}
						
						while(linha!=null) ;
						
						}
						
						catch (IOException e1) {
							e1.printStackTrace();
							System.out.println("erro");
						}
				}
				
				
				if(checkBox.getSelectedIndex()==2) {
					textArea1.setText("");
					String a = textField.getText();
					
					try {
					String path = "../projeto.txt";
						FileInputStream arquivo = new FileInputStream(path);
						InputStreamReader input = new InputStreamReader(arquivo);
						BufferedReader br = new BufferedReader(input);
						
						String linha;
						
						do {
						linha = br.readLine();
						if(linha!=null) {
						String[] palavras = linha.split(";");
						
						
						for(int i=0;i<palavras.length;i++){
							
							if(palavras[i].contains(a)) {
								textArea1.append("nome do projeto: "+ palavras[0]); textArea1.append("\n");
								textArea1.append("nome do gerente: "+ palavras[1]); textArea1.append("\n");
								textArea1.append("data de início: "+ palavras[2]); textArea1.append("\n");
								textArea1.append("data de finalização: "+ palavras[3]); textArea1.append("\n");
								textArea1.append("hisórico de atividades: -"+ palavras[4]); textArea1.append("\n");
								textArea1.append("- "+ palavras[5]); textArea1.append("\n");
								textArea1.append("- "+ palavras[6]); textArea1.append("\n");
								textArea1.append("- "+ palavras[7]); textArea1.append("\n");textArea1.append("\n");
								
								
							}
							
						}
						
						}
						}
						
						while(linha!=null) ;
						
						}
						
						catch (IOException e1) {
							e1.printStackTrace();
							System.out.println("erro");
						}
				}
			
				if(checkBox.getSelectedIndex()==3) {
					textArea1.setText("");
					String a = textField.getText();
					
					try {
					String path = "../trabalho.txt";
						FileInputStream arquivo = new FileInputStream(path);
						InputStreamReader input = new InputStreamReader(arquivo);
						BufferedReader br = new BufferedReader(input);
						
						String linha;
						
						do {
						linha = br.readLine();
						if(linha!=null) {
						String[] palavras = linha.split(";");
						
						
						for(int i=0;i<palavras.length ;i++){
						
							if(palavras[i].contains(a)) {
								textArea1.append("código: "+ palavras[8]); textArea1.append("\n");
								textArea1.append("nome do trabalho: "+ palavras[0]); textArea1.append("\n");
								textArea1.append("nome do operário: "+ palavras[1]); textArea1.append("\n");
								textArea1.append("data de início: "+ palavras[2]); textArea1.append("\n");
								textArea1.append("data de finalização: "+ palavras[3]); textArea1.append("\n");
								textArea1.append("hisórico de atividades: -"+ palavras[4]); textArea1.append("\n");
								textArea1.append("- "+ palavras[5]); textArea1.append("\n");
								textArea1.append("- "+ palavras[6]); textArea1.append("\n");
								textArea1.append("- "+ palavras[7]); textArea1.append("\n");textArea1.append("\n");
								
							}
							
						}
						
						}
						}
						
						while(linha!=null) ;
						
						}
						
						catch (IOException e1) {
							e1.printStackTrace();
							System.out.println("erro");
						}
				}
			
			}
        	
        });

        
        
        mainPanel.add(buttonsPanel, BorderLayout.PAGE_END);
        return mainPanel;
    }
    	
    public Component createStraightPanel(String labelText) {
        JPanel mainPanel = new JPanel(new BorderLayout());

        JLabel label = new JLabel("<html><p style='width:" + labelsWidth + "px';>" + labelText);
        mainPanel.add(label, BorderLayout.LINE_START);

        return mainPanel;
    }

    public static void main(String[] args) {
    }
}
