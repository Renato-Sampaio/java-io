package txt;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import javax.swing.JOptionPane;

/**
 * Classe responsavel por demomstrar a grava��o de arquivos TXT, levando em
 * considera��o que o processo abaixo sem criara um novo arquivo (SOBRESCREVENDO
 * O ANTERIOR)
 * 
 * @author Renato Duarte Sampaio
 * @since 08/03/2021
 * @version 1.0
 */
public class GravarNovoTXT {
	
	/*
	 * M�todo para gerar um arquivo Txt.
	 */
	 public void gerarArquivoTxt ( String nome) {
		 
		 try {
			 //classe auxiliar para gerar o arquivo e seu conteudo 
			PrintStream gravador = new PrintStream(nome);
			//Objeto gravador possui o m�todo print para a escrita do m�todo.
			gravador.println("PrintStream");
			gravador.println("A classe PrintStream possui um contrutor que j�");
			gravador.println("recebe o nome de um arquivo como argumento.");
			gravador.println("");
			gravador.println("� importante lembrar que orquivo de sa�da");
			gravador.println("DEVE SER FECHADO usando o m�todo close().");
			// metodo obrigatorio para encerrar a grava��o do conteudo
			gravador.close();
			JOptionPane.showMessageDialog(null, "Arquivo Gravado com Sucesso", "Grava��o de arquivo", 1);
			//encerrando a execu��o.
			System.exit(0);
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.toString(), "Grava��o de Arquivo", 0);
			e.printStackTrace();
		}
	 
	 }// fim do m�todo
	 
	 /*
	  * M�todo principal para execu��o da classe.
	  */
	 
	 public static void main(String[] args) {
		new GravarNovoTXT().gerarArquivoTxt("saida.txt");
	}
	 
}// fim da classe
