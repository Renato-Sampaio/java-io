package txt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Classe responsavel por demonstrar a leitura de arquivo txt
 * 
 * @author Renato Sampaio
 * @since 05/03/2021
 * @version 1.0
 */
public class LerArquivo {
	/*
	 * método para ler um arquivo recebendo o seu nome
	 */

	public void lerArquivo(String nome) {

		try {
			// declarando atributo para ler o arquivo e informar o seu nome para leitura
			Scanner leitor = new Scanner(new FileReader(nome));

			// laço de repetição para leitura do arquivo com o comando hasNext
			while (leitor.hasNext()) {
				// exibindo no console o conteudo armazenado no arquivo txt
				System.err.println(leitor.nextLine());
			}

		} catch (FileNotFoundException e) {
			//exibindo para o usuario uma mensagem de erro
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "LER ARQUIVO", 0);
			//exibe no console o log de erro no java
			e.printStackTrace();
		}
	}// fim método
	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		new LerArquivo().lerArquivo("entrada.txt");
	}
}// fim classe