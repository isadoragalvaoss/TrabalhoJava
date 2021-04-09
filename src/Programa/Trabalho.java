package Programa;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;

/**
 * Classe Trabalho
 * @author isadora
 *
 */
public class Trabalho {
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNometrab() {
		return nometrab;
	}

	public void setNometrab(String nometrab) {
		this.nometrab = nometrab;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDatai() {
		return datai;
	}

	public void setDatai(String datai) {
		this.datai = datai;
	}

	public String getDataf() {
		return dataf;
	}

	public void setDataf(String dataf) {
		this.dataf = dataf;
	}

	private String nome;
	private String nometrab;
	private String codigo;
	private String datai;
	private String dataf;
	private String historicos;
	private String historicos1;
	private String historicos2;
	private String historicos3;


	public String getHistoricos() {
		return historicos;
	}

	public void setHistoricos(String historicos) {
		this.historicos = historicos;
	}

	public String getHistoricos1() {
		return historicos1;
	}

	public void setHistoricos1(String historicos1) {
		this.historicos1 = historicos1;
	}

	public String getHistoricos2() {
		return historicos2;
	}

	public void setHistoricos2(String historicos2) {
		this.historicos2 = historicos2;
	}

	public String getHistoricos3() {
		return historicos3;
	}

	public void setHistoricos3(String historicos3) {
		this.historicos3 = historicos3;
	}

	public Trabalho() {
		// TODO Auto-generated constructor stub
	}
	public void novajanela() {
		TelinhaTrabalho tela= new TelinhaTrabalho();
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		tela.setSize(700,500);
		tela.setVisible(true);
	}
	
	/**
	 * Método que realiza cadastro do trabalho
	 * @param codigo do trabalho
	 * @param nome do operário
	 * @param nometrabalho do trabalho
	 * @param datai do trabalho
	 * @param dataf do trabalho
	 * @param area do trabalho
	 * @param area1 do trabalho
	 * @param area2 do trabalho
	 * @param area3 do trabalho
	 */
	public void cadastrotrabalho(String codigo,String nome,String nometrabalho,String datai,String dataf,String area,String area1,String area2,String area3) {
		try {
			String path = "../trabalho.txt";
			DataOutputStream arquivo = new DataOutputStream(new FileOutputStream(path,true));
			PrintWriter pr = new PrintWriter(arquivo);
			
			pr.println(codigo+";"+nome+";"+nometrabalho+";"+datai+";"+dataf+";"+area+";"+area1+";"+area2+";"+area3);
			pr.flush();
			
			pr.close();
			arquivo.close();
		} catch (IOException e1) {
			e1.printStackTrace();
			System.out.println("erro");
		}
	
	}

}
