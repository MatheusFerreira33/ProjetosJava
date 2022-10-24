package Objetos.Encapsulamento_2;

public interface Esportivo {

    void ligarTurbo();

    void desligarTurbo();

    default int teste() { // nesse caso o metodo não e obrigatorio, para imprementar
        return 1;
    }

    // aqui na interface, voce so colocar os metodos ou coisa que são importe mas,
    // não colocar o corpo, so inicializa
    // implementar ele em uma classe, nessa classe sera obrigatorio puxar o metodo e
    // fazer o corpo

    // classes abstradas não pode ser instanciada, so apenas herança

    /*
     * Em Java, existe um recurso no qual, em uma classe abstrata,
     * podemos escrever que determinado método será sempre escrito
     * pelas classes filhas. Isto é, um método abstrato.
     * 
     * Ele indica que todas as classes filhas (concretas, ou seja, não abstratas)
     * devem reescrever esse método, ou não compilarão. É como se você herdasse a
     * responsabilidade de ter aquele método.
     */

    /*
     * O que exatamente vem a ser a nossa classe Funcionario? Nossa empresa tem
     * apenas Diretores,
     * Gerentes, Secretárias, etc. Ela é uma classe que apenas idealiza um tipo,
     * define somente
     * um rascunho.
     * 
     * Para o nosso sistema, é inadmissível um objeto ser apenas do tipo Funcionario
     * (pode existir um sistema em que faça sentido ter objetos do tipo Funcionario
     * ou
     * apenas Pessoa, mas, no nosso caso, não).
     * 
     * Utilizamos a palavra-chave abstract para impedir que ela possa ser
     * instanciada.
     * Esse é o efeito direto de se usar o modificador abstract na declaração de uma
     * classe:
     * código acima não compila. O problema é instanciar a classe – criar referência
     * você pode. Se ela não pode ser instanciada, para que serve? Serve para o
     * polimorfismo e herança dos atributos e métodos, que são recursos muito
     * poderosos, como já vimos.
     * 
     * Então, herdemos essa classe reescrevendo o método getBonificacao:
     */

}
