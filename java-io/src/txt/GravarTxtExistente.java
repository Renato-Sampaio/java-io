
package txt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import javax.swing.JOptionPane;

/**
 * Classe responsavel por demonstrar a grava��o de arquivo TXT, se o arquivo for existente, mantem o conteudo, caso n�o exista cria-se um novo.
 * @author Renato Duarte Sampaio
 *
 *@since 8 de mar. de 2021
 *@version 1.0
 */
public class GravarTxtExistente {
	
	/*
	 * M�todo para criar arquivo TXT recebendo o nome 
	 *
	 */
    public void gravarArquivo(String nome) {
    	
    	// classe auxiliar para carregar um arquivo existente ou criar um novo arquivo.
    	File arquivo = new File(nome);
    	

    	try {
    		// classe auxiliar para gerar um objeto de memoria para grava��o do arquivo.
			FileOutputStream arquivoOutput = new FileOutputStream(arquivo, true);
			// classe auxiliar para gerar o arquivo e su conteudo.
	    	PrintStream gravador = new PrintStream(arquivoOutput);
	    	
	    	//gravando o conteudo.
	    	gravador.println("FlieOutputStream");
	    	gravador.println("Utilizando o FileOutputStream � possivel");
	    	gravador.println("abrir um arquivo e gravar os dados");
	    	gravador.println("sem necessariamente sobrescrever o arquivo existente");
	    	gravador.println("");
	    	gravador.println("Neste exemplo al�m de fechar o objeto o objeto com metodo close");
	    	gravador.println("Tamb�m � necessario fechar o arquivoOutput.");
	    	
	    	//fechando o processo de grava��o
	    	gravador.close();
	    	arquivoOutput.close();
	    	//exibindo resultado ao usuario
			JOptionPane.showMessageDialog(null, "Arquivo Gravado com Sucesso", "Grava��o de arquivo", 1);
			//encerrando a execu��o.
			System.exit(0);
	    	
	    	
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.toString(), "Grava��o de Arquivo", 0);

			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.toString(), "Grava��o de Arquivo", 0);

			e.printStackTrace();
		}
    	
    }//fim do metodo
    /*
     * metodo principal para executar a classe
     */
	
	public static void main(String[] args) {
		new GravarTxtExistente().gravarArquivo("saida.txt");
	}
	
}//fim da classe
