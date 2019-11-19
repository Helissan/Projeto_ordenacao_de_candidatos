package projeto2unidade;

import java.util.Scanner;

public class Candidatomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, qtdcandidatos, o, j;
		Candidato aux;
		Candidato c[];
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Informe a quantidade de candidatos a serem cadastrados: ");
		qtdcandidatos = entrada.nextInt();
		
		c = new Candidato[qtdcandidatos];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new Candidato();
			System.out.println("Informe o nome do candidato: ");
			c[i].setNome(entrada.next());
			System.out.println("Informe o sexo do candidato: ");
			c[i].setSexo(entrada.next());
			System.out.println("Informe a idade do candidato: ");
			c[i].setIdade(entrada.nextInt());
			System.out.println("Informe o número do candidato cadastrado: ");
			c[i].setNumero(entrada.nextInt());
			System.out.println("Informe o partido do candidato a ser cadastrado: ");
			c[i].setPartido(entrada.next());
		}
		
		for (int i = 0; i < c.length; i++) {
			c[i].Exibe();
		}
		
		System.out.println("---Digite -99 para acabar a votação---");
		
		do {
			
		System.out.println("Informe o número da sua candidato da sua escolha: ");
		n = entrada.nextInt();
		
		for (int i = 0; i < c.length; i++) {
			if(c[i].getNumero() == n) {
				c[i].incrementovotos();
				c[i].Exibe();
			}
		}
		
		} while(n != -99);
		
		for (o = c.length - 1; o > 0; o--) {
			for (j = 0; j < o; j++) {
				if (c[j].getVotos() < c[j+1].getVotos()) {
					aux = c[j];
					c[j] = c[j + 1];
					c[j + 1] = aux;
				}				
			}
		}
		
		System.out.println("----Candidato vencedor----");
		System.out.println(c[0].getNome());
		
		System.out.println("----Resultado da votação do candidato em ordem decrescente----");
		
		for (int i = 0; i < c.length; i++) {
			c[i].Exibefinal();
		}
		
		entrada.close();
	}

}
