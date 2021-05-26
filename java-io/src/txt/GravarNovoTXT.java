package txt;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import javax.swing.JOptionPane;

/**
 * Classe responsavel por demomstrar a gravação de arquivos TXT, levando em
 * consideração que o processo abaixo sem criara um novo arquivo (SOBRESCREVENDO
 * O ANTERIOR)
 * 
 * @author Renato Duarte Sampaio
 * @since 08/03/2021
 * @version 1.0
 */
public class GravarNovoTXT {
	
	/*
	 * Método para gerar um arquivo Txt.
	 */
	 public void gerarArquivoTxt ( String nome) {
		 
		 try {
			 //classe auxiliar para gerar o arquivo e seu conteudo 
			PrintStream gravador = new PrintStream(nome);
			//Objeto gravador possui o método print para a escrita do método.
			gravador.println("PrintStream");
			gravador.println("A classe PrintStream possui um contrutor que já");
			gravador.println("recebe o nome de um arquivo como argumento.");
			gravador.println("");
			gravador.println("É importante lembrar que orquivo de saída");
			gravador.println("DEVE SER FECHADO usando o método close().");
			// metodo obrigatorio para encerrar a gravação do conteudo
			gravador.close();
			JOptionPane.showMessageDialog(null, "Arquivo Gravado com Sucesso", "Gravação de arquivo", 1);
			//encerrando a execução.
			System.exit(0);
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.toString(), "Gravação de Arquivo", 0);
			e.printStackTrace();
		}
	 
	 }// fim do método
	 
	 /*
	  * Método principal para execução da classe.
	  */
	 
	 public static void main(String[] args) {
		new GravarNovoTXT().gerarArquivoTxt("saida.txt");
	}
	 
}// fim da classe
