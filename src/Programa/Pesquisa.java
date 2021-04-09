package Programa;
import javax.swing.JFrame;

/**
 * Classe Pesquisa
 * @author isadora
 *
 */
public class Pesquisa {
	
	/**
	 * Método que abre Frame de pesquisa
	 */
	public void novajanela() {
		TelinhaPesquisa tela= new TelinhaPesquisa();
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		tela.setSize(700,500);
		tela.setVisible(true);
	}
}
