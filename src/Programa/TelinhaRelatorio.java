package Programa;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

/**
 * Exibe todos os dados dos funcionários
 * @author isadora
 *
 */
public class TelinhaRelatorio extends JFrame {
	
		/**
		 * Método construtor que exibe os dados dos gerentes, operários, dependentes, projetos e trabalhos
		 */
		public TelinhaRelatorio() {
			setLayout(new BorderLayout());
			
			JTabbedPane abas = new JTabbedPane();
			
			TextArea text1 = new TextArea();
			text1.setEditable(false);
			TextArea text2 = new TextArea();
			text2.setEditable(false);
			TextArea text3 = new TextArea();
			text3.setEditable(false);
			TextArea text4 = new TextArea();
			text4.setEditable(false);
			TextArea text5 = new TextArea();
			text5.setEditable(false);
			
			JScrollPane panel1 = new JScrollPane(text1);
			JScrollPane panel2 = new JScrollPane(text2);
			JScrollPane panel3 = new JScrollPane(text3);
			JScrollPane panel4 = new JScrollPane(text4);
			JScrollPane panel5 = new JScrollPane(text5);
			
			add(abas,BorderLayout.CENTER);
			abas.addTab("gerentes", panel1);
			abas.addTab("operários", panel2);
			abas.addTab("dependentes", panel3);
			abas.addTab("projetos", panel4);
			abas.addTab("trabalhos", panel5);
			
			
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
							if(i==0) {text2.append("código: "+ palavras[i]); text2.append("\n");}
							else if(i==1) {text2.append("nome: "+ palavras[i]); text2.append("\n");}
							else if(i==2) {text2.append("telefone: "+ palavras[i]); text2.append("\n");}
							else if(i==3) {text2.append("endereço: "+ palavras[i]); text2.append("\n");}
							else if(i==4) {text2.append("sexo: "+ palavras[i]); text2.append("\n");}
							else if(i==5) {text2.append("data de nascimento: "+ palavras[i]); text2.append("\n");}
							else if(i==6) {text2.append("departamento: "+ palavras[i]); text2.append("\n");}
							else if(i==7) {text2.append("comissão: "+ palavras[i]); text2.append("\n");}
							else if(i==8) {text2.append("carga horária: "+ palavras[i]); text2.append("\n");}
							else if(i==9) {text2.append("salário: "+ palavras[i]); text2.append("\n");}
							else if(i==10) {text2.append("habilidade: "+ palavras[i]); text2.append("\n");}
							else if(i==11) {text2.append("-  "+ palavras[i]); text2.append("\n");}
							else if(i==12) {text2.append("- "+ palavras[i]); text2.append("\n");}
							else if(i==13) {text2.append("- "+ palavras[i]); text2.append("\n");text2.append("\n");}
							
							
						}
						
						}
						}
						
						while(linha!=null) ;
						
						}
						
						catch (IOException e1) {
							e1.printStackTrace();
							System.out.println("erro");
						}
						
				try {
					String path = "../dependentes.txt";
						FileInputStream arquivo = new FileInputStream(path);
						InputStreamReader input = new InputStreamReader(arquivo);
						BufferedReader br = new BufferedReader(input);
						
						String linha;
						
						do {
						linha = br.readLine();
						if(linha!=null) {
						String[] palavras = linha.split(";");
						
						
						for(int i=0;i<palavras.length;i++){
							if(i==0) {text3.append("nome funcionário: "+ palavras[i]); text3.append("\n");}
							else if(i==1) {text3.append("área: "+ palavras[i]); text3.append("\n");}
							else if(i==2) {text3.append("relação: "+ palavras[i]); text3.append("\n");}
							else if(i==3) {text3.append("nome: "+ palavras[i]); text3.append("\n");}
							else if(i==4) {text3.append("data de nascimento: "+ palavras[i]); text3.append("\n");}
							else if(i==5) {text3.append("relação: "+ palavras[i]); text3.append("\n");}
							else if(i==6) {text3.append("nome: "+ palavras[i]); text3.append("\n");}
							else if(i==7) {text3.append("data de nascimento: "+ palavras[i]); text3.append("\n");}
							else if(i==8) {text3.append("relação: "+ palavras[i]); text3.append("\n");}
							else if(i==9) {text3.append("nome: "+ palavras[i]); text3.append("\n");}
							else if(i==10) {text3.append("data de nascimento: "+ palavras[i]); text3.append("\n");}
							else if(i==11) {text3.append("relação: "+ palavras[i]); text3.append("\n");}
							else if(i==12) {text3.append("nome: "+ palavras[i]); text3.append("\n");}
							else if(i==13) {text3.append("data de nascimento: "+ palavras[i]); text3.append("\n");}
							else if(i==14) {text3.append("relação: "+ palavras[i]); text3.append("\n");}
							else if(i==15) {text3.append("nome: "+ palavras[i]); text3.append("\n");}
							else if(i==16) {text3.append("data de nascimento: "+ palavras[i]); text3.append("\n");}
							else if(i==17) {text3.append("relação: "+ palavras[i]); text3.append("\n");}
							else if(i==18) {text3.append("nome: "+ palavras[i]); text3.append("\n");}
							else if(i==19) {text3.append("data de nascimento: "+ palavras[i]); text3.append("\n");}
							else if(i==20) {text3.append("relação: "+ palavras[i]); text3.append("\n");}
							else if(i==21) {text3.append("nome: "+ palavras[i]); text3.append("\n");}
							else if(i==22) {text3.append("data de nascimento: "+ palavras[i]); text3.append("\n");text3.append("\n");}
							
						}
						
						}
						}
						
						while(linha!=null) ;
						
						}
						
						catch (IOException e1) {
							e1.printStackTrace();
							System.out.println("erro");
						}
				
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
							if(i==0) {text1.append("código: "+ palavras[i]); text1.append("\n");}
							else if(i==1) {text1.append("nome: "+ palavras[i]); text1.append("\n");}
							else if(i==2) {text1.append("telefone: "+ palavras[i]); text1.append("\n");}
							else if(i==3) {text1.append("endereço: "+ palavras[i]); text1.append("\n");}
							else if(i==4) {text1.append("sexo: "+ palavras[i]); text1.append("\n");}
							else if(i==5) {text1.append("data de nascimento: "+ palavras[i]); text1.append("\n");}
							else if(i==6) {text1.append("departamento: "+ palavras[i]); text1.append("\n");}
							else if(i==7) {text1.append("comissão: "+ palavras[i]); text1.append("\n");}
							else if(i==8) {text1.append("carga horária: "+ palavras[i]); text1.append("\n");}
							else if(i==9) {text1.append("salário: "+ palavras[i]); text1.append("\n");text1.append("\n");}
							
							
						}
						
						}
						}
						
						while(linha!=null) ;
						
						}
						
						catch (IOException e1) {
							e1.printStackTrace();
							System.out.println("erro");
						}
				
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
							if(i==8) {text4.append("código: "+ palavras[i]); text4.append("\n");}
							else if(i==0) {text4.append("nome do projeto: "+ palavras[i]); text4.append("\n");}
							else if(i==1) {text4.append("nome do gerente: "+ palavras[i]); text4.append("\n");}
							else if(i==2) {text4.append("data de início: "+ palavras[i]); text4.append("\n");}
							else if(i==3) {text4.append("data de finalização: "+ palavras[i]); text4.append("\n");}
							else if(i==4) {text4.append("hisórico de atividades: -"+ palavras[i]); text4.append("\n");}
							else if(i==5) {text4.append("- "+ palavras[i]); text4.append("\n");}
							else if(i==6) {text4.append("- "+ palavras[i]); text4.append("\n");}
							else if(i==7) {text4.append("- "+ palavras[i]); text4.append("\n");text4.append("\n");}
							
							
						}
						
						}
						}
						
						while(linha!=null) ;
						
						}
						
						catch (IOException e1) {
							e1.printStackTrace();
							System.out.println("erro");
						}
				
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
						
						
						for(int i=0;i<palavras.length;i++){
							if(i==0) {text5.append("código: "+ palavras[i]); text5.append("\n");}
							else if(i==1) {text5.append("nome do trabalho: "+ palavras[i]); text5.append("\n");}
							else if(i==2) {text5.append("nome do operário: "+ palavras[i]); text5.append("\n");}
							else if(i==3) {text5.append("data de início: "+ palavras[i]); text5.append("\n");}
							else if(i==4) {text5.append("data de finalização: "+ palavras[i]); text5.append("\n");}
							else if(i==5) {text5.append("histórico de atividades: - "+ palavras[i]); text5.append("\n");}
							else if(i==6) {text5.append("- "+ palavras[i]); text5.append("\n");}
							else if(i==7) {text5.append("- "+ palavras[i]); text5.append("\n");}
							else if(i==8) {text5.append("- : "+ palavras[i]); text5.append("\n");text5.append("\n");}
							
							
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
