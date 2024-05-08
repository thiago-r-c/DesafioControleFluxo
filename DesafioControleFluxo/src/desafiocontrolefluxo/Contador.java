package desafiocontrolefluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args){
		Scanner terminal = new Scanner(System.in);
		System.out.printf("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt(); //recebe somente inteiro pelo terminal
		System.out.printf("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt(); //recebe somente inteiro pelo terminal
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                        System.err.println(e.getMessage()); // Mensagem vem da classe de exessão ParametrosInvalidosException
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm >= parametroDois){
                    throw new ParametrosInvalidosException();
                }else{
                    
                    int contagem = parametroDois - parametroUm; // subtrai para achar a contagem pela diferença
               
                    //realizar o for para imprimir os números com base na variável contagem
                    for(int i=0; i < contagem; i++){
                        System.out.println("Imprimindo o número "+(i+1)); //Imprime as ocorrencias
                    }
                }
	}

}
