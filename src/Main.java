/* Projeto : Sistema de verificação de par ou impar

Este projeto consiste em um Analisador Numérico desenvolvido em Java, com o objetivo principal de aplicar conceitos fundamentais de Programação Orientada a Objetos (POO).
A aplicação recebe um número inteiro via terminal e processa a lógica para determinar se ele é par ou ímpar. */

// Importações :


import java.util.Scanner;

// Classe que executa o código :
public class Main {


    // Função que é responsável por executar o sistema:
    public static void main( String[] args ) {



    }
}


// Classe que roda o sistema de verificação :
class SistemaVerificacao {


    // Atributos :

    int numeroEscolhido = 0;
    int restoDaDivisao  = 0;
    String verificacaoEncerrametno = "";


    // Métodos :

    public void funcaoExibicao () {


        // Criando o objeto de input para o usuário :
        Scanner input = new Scanner( System.in );


        // Texto de apresentação :
        System.out.println( "Olá, seja bem-vindo ao sistema de verificacao se é par ou impar!" );
        System.out.println( "Escreva 1 para iniciar e 2 para encerrar o sistema :." );
        verificacaoEncerrametno = input.nextLine();



    }

    public void funcaoVerificarNumero () {



    }


}