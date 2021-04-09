package Programa;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;

/**
 * Classe Operário
 * @author isadora
 *
 */
public class Operario extends Funcionario {

	private String habilidade;
	private String habilidade1;
	private String habilidade2;
	private String habilidade3;
	
	public String getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}

	public String getHabilidade1() {
		return habilidade1;
	}

	public void setHabilidade1(String habilidade1) {
		this.habilidade1 = habilidade1;
	}

	public String getHabilidade2() {
		return habilidade2;
	}

	public void setHabilidade2(String habilidade2) {
		this.habilidade2 = habilidade2;
	}

	public String getHabilidade3() {
		return habilidade3;
	}

	public void setHabilidade3(String habilidade3) {
		this.habilidade3 = habilidade3;
	}

	public Operario() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Método de cadastro do operário
	 * @param nome do operário
	 * @param telefone do operário
	 * @param endereco do operário
	 * @param codigo do operário
	 * @param sexo do operário
	 * @param data do operário
	 * @param depart do operário
	 * @param cargo do operário
	 * @param cargah do operário
	 * @param salario do operário
	 * @param habilidade do operário
	 * @param habilidade1 do operário
	 * @param habilidade2 do operário
	 * @param habilidade3 do operário
	 */
	public void cadastrooperario(String nome,String telefone,String endereco,String codigo,String sexo,String data,String depart,String cargo,String cargah,String salario,String habilidade,String habilidade1,String habilidade2,String habilidade3) {
		try {
			String path = "../operario.txt";
			DataOutputStream arquivo = new DataOutputStream(new FileOutputStream(path,true));
			PrintWriter pr = new PrintWriter(arquivo);
			
			pr.println(codigo+";"+nome+";"+telefone+";"+endereco+";"+sexo+";"+data+";"+depart+";"+cargo+";"+cargah+";"+salario+";"+habilidade+";"+habilidade1+";"+habilidade2+";"+habilidade3);
			pr.flush();
			
			pr.close();
			arquivo.close();
		} catch (IOException e1) {
			e1.printStackTrace();
			System.out.println("erro");
		}
	
	}

	/**
	 * Método que abre Frame de cadastro do operário
	 */
	public void novajanela() {
		TelinhaOperario tela= new TelinhaOperario();
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		tela.setSize(700,500);
		tela.setVisible(true);
	}
}
