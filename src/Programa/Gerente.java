package Programa;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;

/**
 * Classe Gerente
 * @author isadora
 *
 */
public class Gerente extends Funcionario {
	
	private String projeto;
	private String projeto1;
	private String projeto2;
	private String projeto3;
	
	public String getProjeto() {
		return projeto;
	}
	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}
	public String getProjeto1() {
		return projeto1;
	}
	public void setProjeto1(String projeto1) {
		this.projeto1 = projeto1;
	}
	public String getProjeto2() {
		return projeto2;
	}
	public void setProjeto2(String projeto2) {
		this.projeto2 = projeto2;
	}
	public String getProjeto3() {
		return projeto3;
	}
	public void setProjeto3(String projeto3) {
		this.projeto3 = projeto3;
	}
	public Gerente() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Método que faz o cadastro do gerente
	 * @param nome do gerente
	 * @param telefone do gerente
	 * @param endereco do gerente
	 * @param codigo do gerente
	 * @param sexo do gerente
	 * @param data do gerente
	 * @param depart do gerente
	 * @param comissao do gerente
	 * @param cargah do gerente
	 * @param salario do gerente
	 */
	public void cadastrogerente(String nome,String telefone,String endereco,String codigo,String sexo,String data,String depart,String comissao,String cargah,String salario) {
		try {
			String path = "../gerente.txt";
			DataOutputStream arquivo = new DataOutputStream(new FileOutputStream(path,true));
			PrintWriter pr = new PrintWriter(arquivo);
			
			pr.println(codigo+";"+nome+";"+telefone+";"+endereco+";"+sexo+";"+data+";"+depart+";"+comissao+";"+cargah+";"+salario);
			pr.flush();
			
			pr.close();
			arquivo.close();
		} catch (IOException e1) {
			e1.printStackTrace();
			System.out.println("erro");
		}
	
	}
	
	/**
	 * Método que abre o Frame do cadastro de gerente
	 */
	public void novajanela() {
		TelinhaGerente tela= new TelinhaGerente();
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		tela.setSize(700,500);
		tela.setVisible(true);
	}

}
