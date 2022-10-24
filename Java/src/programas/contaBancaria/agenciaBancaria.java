package programas.contaBancaria;

import java.util.Scanner;

public class agenciaBancaria {

    public static void main(String[] args) {

        criarConta c = new criarConta();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo a nossa Agencia!!!");
        System.out.println("Voce ja possui alguma conta? Sim: 1 ou Não: 2");
        int escolhaClinte = entrada.nextInt();

        if (escolhaClinte == 2) {
            System.out.println("Nome Completo");
            c.nomeCompleto = entrada.next();

            System.out.println("Digite o seu CPF");
            c.cpf = entrada.nextLong();

            System.out.println("Data de nacimento");
            c.nascimento = entrada.nextLong();

            System.out.println("Digite o seu endereço");
            c.endereco = entrada.next();

            System.out.println("Pareabens informações registradas com Sucesso");
            System.out.println("Agora que voce ja tem uma conta, inicia o programa novamente com a escolha 1");
            
        } else {
            System.out.println("Legal, agora qual atividade voce quer fazer?");
        }

        System.out.println("Depositar: d, Sacar: s, Consultar Saldo: c");
        String escolhaAtividade = entrada.nextLine();

    }

}
