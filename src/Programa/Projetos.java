package Programa;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Classe Projetos
 * @author isadora
 *
 */
public class Projetos {
	
	private String nome;
	private String datai;
	private String dataf;
	private String atividades;
	private String historicos;
	private String historicos1;
	private String historicos2;
	private String historicos3;
	
	public Projetos() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getAtividades() {
		return atividades;
	}

	public void setAtividades(String atividades) {
		this.atividades = atividades;
	}

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
	
	/**
	 * Método de cadastro de projetos
	 * @param nome do projeto
	 * @param nomegerente
	 * @param datai do projeto
	 * @param dataf do projeto
	 * @param area do projeto
	 * @param area1 do projeto
	 * @param area2 do projeto
	 * @param area3 do projeto
	 */
	public void cadastroprojeto(String nome,String nomegerente,String datai,String dataf,String area,String area1,String area2,String area3) {
		try {
			String path = "../projeto.txt";
			DataOutputStream arquivo = new DataOutputStream(new FileOutputStream(path,true));
			PrintWriter pr = new PrintWriter(arquivo);
			
			pr.println(nome+";"+nomegerente+";"+datai+";"+dataf+";"+area+";"+area1+";"+area2+";"+area3);
			pr.flush();
			
			pr.close();
			arquivo.close();
		} catch (IOException e1) {
			e1.printStackTrace();
			System.out.println("erro");
		}
	
	}

		/**
		 * Método que abre Frame do cadastro de projetos
		 */
	public void novajanela() {
		TelinhaProjetos tela= new TelinhaProjetos();
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		tela.setSize(700,500);
		tela.setVisible(true);
	}
	
	


}
