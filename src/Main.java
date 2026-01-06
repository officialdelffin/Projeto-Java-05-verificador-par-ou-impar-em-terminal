/* Projeto : Sistema de verificação de par ou impar

Este projeto consiste em um Analisador Numérico desenvolvido em Java, com o objetivo principal de aplicar conceitos fundamentais de Programação Orientada a Objetos (POO).
A aplicação recebe um número inteiro via terminal e processa a lógica para determinar se ele é par ou ímpar. */

// Importações :


import java.util.Scanner;

// Classe que executa o código :
public class Main {


    // Função que é responsável por executar o sistema:
    public static void main( String[] args ) {

        SistemaVerificacao execucao = new SistemaVerificacao();

        execucao.funcaoVerificarNumero();

    }
}


// Classe que roda o sistema de verificação :
class SistemaVerificacao {


    // Atributos :

    int numeroEscolhido        = 0;
    int restoDaDivisao         = 0;
    String numeroEncerrametno  = "";


    // Métodos :

    // Função onde o sistema vai roda :
    public void funcaoVerificarNumero () {


        // Criando o objeto de input para o usuário :
        Scanner inputUsuario = new Scanner( System.in );


        // Texto de apresentação :
        System.out.println( "Olá, seja bem-vindo ao sistema de verificacao se é par ou impar!" );


        // Texto pedindo para o usuário digitar o número escolhido :
        System.out.println( "Me informe o número que deseja verificar: " );


        // Recebendo número que o usuário escreveu :
        numeroEscolhido = inputUsuario.nextInt();


        // Calculando o resto da divisão do número escolhido :
        restoDaDivisao = numeroEscolhido % 2;


        // Se o resto da divisão for 0 notifica que o número é par :
        if (restoDaDivisao == 0 ) {


            System.out.println( "O número " + numeroEscolhido + " é um numero par!" );


        }

        else  {


            System.out.println( "O número " + numeroEscolhido + " é um numero impar!" );


        }



    }


}