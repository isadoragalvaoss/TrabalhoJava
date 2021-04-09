package Programa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;
public class Interfacemetodos extends JFrame {

	public static final long serialVersionUID = 1L;
	JFormattedTextField dataField = new JFormattedTextField(DateFormat.getDateInstance(DateFormat.DATE_FIELD));
	
	
		public Interfacemetodos() {
			super("Programa");
			criarTelaPrincipal();
		}
		
		
		
		JLabel hora1 = new JLabel();
		
		public void criarTelaPrincipal() {
			JPanel panelBotoes = new JPanel();
			panelBotoes.setBackground(Color.white);
			panelBotoes.setLayout(new BorderLayout());
			
			JPanel panelTitulo = new JPanel();
			JLabel titulo = new JLabel("     SISTEMA OPERACIONAL");
			titulo.setFont(new Font("Verdana", Font.CENTER_BASELINE,20));
			panelTitulo.setLayout(new BorderLayout());
			panelTitulo.setBackground(Color.LIGHT_GRAY);
			
			ImageIcon imagem = new ImageIcon(getClass().getResource("unb.png"));
			JLabel label = new JLabel(imagem);
			
			JButton gerente = new JButton("Gerente");
			JButton operario = new JButton("Operário");
			//JButton dependentes = new JButton("Dependentes");
			//JButton projeto = new JButton("Projeto");
			//JButton trabalho = new JButton("Trabalho");
			JButton pesquisa = new JButton("Pesquisa");
			JButton funcionarios = new JButton("Relatórios");
			
			
			//titulo.setBounds(300,20,400,20);
			titulo.setPreferredSize(new Dimension(50,50));
			label.setPreferredSize(new Dimension(90,60));
			gerente.setBounds(80,130,110,20);
			gerente.setBackground(Color.LIGHT_GRAY);
			operario.setBounds(80,170,110,20);
			operario.setBackground(Color.LIGHT_GRAY);
			pesquisa.setBounds(280,130,110,20);
			pesquisa.setBackground(Color.LIGHT_GRAY);
			funcionarios.setBounds(280,170,110,20);
			funcionarios.setBackground(Color.LIGHT_GRAY);
			
			
			
			panelTitulo.add(titulo);
			panelTitulo.add(BorderLayout.WEST,label);
			
			panelBotoes.add(gerente);
			panelBotoes.add(operario);
			
			panelBotoes.add(pesquisa);
			panelBotoes.add(funcionarios);
			
			
			
			JLabel cadastro = new JLabel("Cadastro");
			
			cadastro.setBounds(95,80,100,20);
			cadastro.setFont(new Font("Verdana", Font.BOLD,16));
			panelBotoes.add(cadastro);
			
			JLabel relatorio = new JLabel("Relatório");
			
			relatorio.setBounds(295,80,100,20);
			relatorio.setFont(new Font("Verdana", Font.BOLD,16));
			panelBotoes.add(relatorio);
			
			JLabel x = new JLabel("");
			
			x.setBounds(80,40,100,20);
			x.setFont(new Font("Verdana", Font.BOLD,16));
			panelBotoes.add(x);
			
			
			JPanel datahora = new JPanel();
			datahora.setLayout(new BorderLayout());
			
			JLabel data1 = new JLabel();
			
			Date data = new Date();
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			data1.setText(formato.format(data));
			
			Timer timer = new Timer(1000,new hora());
			timer.start();
			
			data1.setBounds(410,0,100,20);
			hora1.setBounds(100, 300, 20, 20);
			
			datahora.setPreferredSize(new Dimension(20,20));
			datahora.add(data1);
			datahora.add(hora1);
			
			datahora.setBackground(Color.LIGHT_GRAY);
			add(datahora,BorderLayout.SOUTH);
			add(panelTitulo, BorderLayout.NORTH);
			add(panelBotoes, BorderLayout.CENTER);
			
			
			
			gerente.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					Gerente tela = new Gerente();
					tela.novajanela();
				}
				
			});
			
			operario.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					Operario tela = new Operario();
					tela.novajanela();
				}
				
			});
			
			
			pesquisa.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					Pesquisa tela = new Pesquisa();
					tela.novajanela();
				}
				
			});
			
			funcionarios.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					Funcionario tela = new Funcionario();
					tela.novajanela();
					
				}
				
			});
			
			
			
			
		}
		
		
		
		public JTextField nomeField = new JTextField(30);
		JTextField telefoneField = new JTextField(30);
		JTextField endField = new JTextField(30);
		
		
		/**
		 * Método que mostra hora no rodapé
		 * @author isadora
		 *
		 */
		class hora implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Calendar now = Calendar.getInstance();
				hora1.setText(String.format("%1$tH:%1$tM:%1$tS", now));
				
			}
			
		}
		
	}

