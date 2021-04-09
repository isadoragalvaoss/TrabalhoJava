package Programa;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;

/**
 * Classe de Funcionário
 * @author isadora
 *
 */
public class Funcionario extends Interfacemetodos {

	private String nome;
	private String sexo;
	private String telefone;
	private String endereco;
	private String datanasc;
	private String codigo;
	private String mae;
	private String pai;
	private String cargah;
	private String comissao;
	private String cargo;
	private String salario;
	private String departamento;
	private String box;
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getDatanasc() {
		return datanasc;
	}


	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	
	public String getCargah() {
		return cargah;
	}


	public void setCargah(String cargah) {
		this.cargah = cargah;
	}


	public String getComissao() {
		return comissao;
	}


	public void setComissao(String comissao) {
		this.comissao = comissao;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getSalario() {
		return salario;
	}


	public void setSalario(String salario) {
		this.salario = salario;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void relatoriofunc() {}


	public String getMae() {
		return mae;
	}


	public void setMae(String mae) {
		this.mae = mae;
	}


	public String getPai() {
		return pai;
	}


	public void setPai(String pai) {
		this.pai = pai;
	}


	public String getBox() {
		return box;
	}


	public void setBox(String box) {
		this.box = box;
	}
	
	/**
	 * Método que abre o Frame do relatório de funcionários, projetos e trabalho
	 */
	public void novajanela() {
		TelinhaRelatorio tela= new TelinhaRelatorio();
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		tela.setSize(700,500);
		tela.setVisible(true);
	}

}
