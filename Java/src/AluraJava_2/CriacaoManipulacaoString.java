package AluraJava_2;
public class CriacaoManipulacaoString {

    public static void main(String[] args) {

        System.out.println("FERREIRA".equals("FERREIRA")); // equals faz a comparação se for igual e true e não for e false 
        System.out.println("FERREIRA".equalsIgnoreCase("FERREIRA")); // aqui ele ignora os maisculos
        System.out.println("texto aqui voce se encontra bem apertado,vou parar com isso".indexOf("em")); // indexOf encontra a primeira letra, se ele não encontrar e menos -1
        System.out.println("texto aqui voce se encontra bem apertado,vou parar com isso".lastIndexOf("em")); // procura de tras pra frente
        System.out.println("texto aqui voce se encontra bem apertado,vou parar com isso".indexOf("em", 7)); // aqui ele vai encontrar a partir do numero indicado



        System.out.println("texto aqui voce se encontra bem apertado,vou parar com isso".startsWith("em"));
        System.out.println("texto aqui voce se encontra bem apertado,vou parar com isso".startsWith("texto")); // startswicth mostra qual palavra começa e o endWith fala qual e o final 






        String teste2 = new String("null");
        System.out.println(teste2);
        System.out.println(teste2.substring(3));


        String filme = "vingadores";
        filme = filme.toUpperCase(); // toUpperCase faz com que fico maiusculo
        System.out.println(filme);
        System.out.println(filme.charAt(5)); // esse charAt mostra a posição do numero digitado
        System.out.println(filme.length()); // O lenght mostra quantos caracteres tem no valor
        System.out.println(filme.isEmpty()); // esse isEmpty mostra se o tipo esta vazio (verdadeiro), ou se tiver acima de 0 ( False)
        String teste = new String("");
        System.out.println(teste.isEmpty());

        System.out.println("     teste     ".trim());
        System.out.println(filme.replace('V', 'a')); // aqui ele troca

        //  e tambem tem o TolowerCase() - tudo em minúsculo
        // trim() tira os espaços da esquerda quanto na direita
        // substring ele tira uma determinada letra da String
        // contat adciona String na nossa atual
        // String replace troca o caracter por outra
        // String replace que recebe String



        
        String NomeDireto = "java";
        String NomeIndireto = new String("java");

        char[] nome = new char[] { 'j', 'a', 'v', 'a' };
        char[] nome2 = { 'j', 'a', 'v', 'a' };

        // String [] nome3 =  { 'j', 'a', 'v', "carro" }; apenas o "char" poder ser array 

        StringBuffer sb = new StringBuffer("java ");

        sb.append("Ele puxa tudo o que foi criado");
        String buffer = new String(sb);

        String nomeNulo = null;

        String nomeDaProva = "certificação" + " " + "Java";
        String nomeDaProvaComNulo = nomeDaProva + " " + nomeDaProva;

        System.out.println("Certificação " + 1500);
        System.out.println(1500 + " Certificação");
        System.out.println(15 + (0 + (00 + " Certificação")));
        System.out.println(1 + 500 + " Certificação");
        System.out.println("olha o teste".concat(" i entrou"));


        

    }
    
}
