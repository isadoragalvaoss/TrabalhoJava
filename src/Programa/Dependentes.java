package Programa;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;

/**
 * Classe Dependentes, armazena os dados dos dependentes dos funcionários
 * @author isadora
 *
 */
public class Dependentes extends Funcionario {

	private String funcionassoc;
	
	public String getFuncionassoc() {
		return funcionassoc;
	}

	public void setFuncionassoc(String funcionassoc) {
		this.funcionassoc = funcionassoc;
	}

	public Dependentes() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Método que faz o cadastro dos dependentes
	 * @param nome do gerente ou operário
	 * @param área do gerente ou operário
	 * @param r1 relação com o funcionário
	 * @param n1 nome do dependentes
	 * @param d1 data de nascimento do dependente
	 * @param r2 relação com o funcionário
	 * @param n2 nome do dependentes
	 * @param d2 data de nascimento do dependente
	 * @param r3 relação com o funcionário
	 * @param n3 nome do dependentes
	 * @param d3 data de nascimento do dependente
	 * @param r4 relação com o funcionário
	 * @param n4 nome do dependentes
	 * @param d4 data de nascimento do dependente
	 * @param r5 relação com o funcionário
	 * @param n5 nome do dependentes
	 * @param d5 data de nascimento do dependente
	 * @param r6 relação com o funcionário
	 * @param n6 nome do dependentes
	 * @param d6 data de nascimento do dependente
	 * @param r7 relação com o funcionário
	 * @param n7 nome do dependentes
	 * @param d7 data de nascimento do dependente
	 */
	public void cadastrodependentes( String nome,String área , String r1, String n1, String d1, String r2, String n2, String d2, String r3, String n3, String d3, String r4, String n4, String d4,String r5, String n5, String d5, String r6, String n6, String d6, String r7, String n7,String d7) {
		// TODO Auto-generated method stub
		try {
			String path = "../dependentes.txt";
			DataOutputStream arquivo = new DataOutputStream(new FileOutputStream(path,true));
			PrintWriter pr = new PrintWriter(arquivo);
			
			pr.println(nome+";"+área+";"+r1+";"+n1+";"+d1+";"+r2+";"+n2+";"+d2+";"+r3+";"+n3+";"+d3+";"+r4+";"+n4+";"+d4+";"+r5+";"+n5+";"+d5+";"+r6+";"+n6+";"+d6+";"+r7+";"+n7+";"+d7);
			pr.flush();
			
			pr.close();
			arquivo.close();
		} catch (IOException e1) {
			e1.printStackTrace();
			System.out.println("erro");
		}
		
	}
	
	/**
	 * Método que abre o Frame do cadastro de dependentes
	 */
	public void novajanela() {
		TelinhaDependentes tela= new TelinhaDependentes();
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		tela.setSize(700,500);
		tela.setVisible(true);
	}

}
