import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String text = "texto";

        double numeroComDecimal = 0.1;

        char a = 'a';

        int n1;
        int n2;

        int resultadoPorcentagem;

        double valorProduto, porcentagemDesconto;


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero a ser Calculado");

        n1 = sc.nextInt();

        System.out.println("Digite outro numero a ser Calculado");

        n2 = sc.nextInt();

//        System.out.println("Digite o Valor do produto");
//
//        valorProduto = sc.nextDouble();
//
//        System.out.println("Digite a porcentagem");
//
//        porcentagemDesconto = sc.nextDouble();


        System.out.println("Resultado da Soma: " + Soma(n1, n2));
        System.out.println("Resultado da Subtracao: " + Subtração(n1, n2));
        System.out.println("Resultado da Multiplicacao: " + Multiplicação(n1, n2));
        System.out.println("Resultado da Divisao: " + Divisão(n1, n2));
        System.out.println("Resultado do Resto: " + Resto(n1, n2));
//          System.out.println(PorcentagemDeProduto(valorProduto, porcentagemDesconto));
        sc.close();

    }

    /**
     *Essa Função é responsavel por retornar a Soma de dois numeros inteiros.
     *@param n1 Primeiro numero inteiro.
     * @param n2 Segundo numero inteiro.
     * @return retorna a Soma dos numero inteiros.
     *
     */
    public static int Soma(int n1, int n2){
        return n1 + n2;
    }

    /**
     *Essa Função é responsavel por retornar a Subtração de dois numeros inteiros.
     *@param n1 primeiro numero inteiro.
     * @param n2 Segundo numero inteiro.
     * @return retorna a Subtração dos numero inteiros.
     *
     */
    public static int Subtração(int n1, int n2){
        return n1 - n2;
    }

    /**
     *Essa Função é responsavel por retornar a Multiplicação de dois numeros inteiros.
     *@param n1 Primeiro numero inteiro.
     * @param n2 Segundo numero inteiro.
     * @return retorna a Multiplicação dos numero inteiros.
     *
     */
    public static int Multiplicação(int n1, int n2){
        return n1 * n2;
    }

    /**
     *Essa Função é responsavel por retornar a Divisão de dois numeros inteiros.
     *@param n1 Primeiro numero inteiro.
     * @param n2 Segundo numero inteiro.
     * @return retorna a Divisão dos numero inteiros.
     *
     */
    public static double Divisão(double n1, double n2){
        return n1 / n2;
    }

    /**
     *Essa Função é responsavel por retornar a Resto de dois numeros inteiros.
     *@param n1 Primeiro numero inteiro.
     * @param n2 Segundo numero inteiro.
     * @return retorna o Resto da divisão dos numero inteiros.
     *
     */
    public static int Resto(int n1, int n2){
        return n1 % n2;
    }

    /**
     *Essa Função é responsavel por retornar a Valor de um Produto com desconto usando dois numeros double.
     *@param porcentagemProduto Porcentagem do Produto.
     * @param valorProduto Valor do Produto.
     * @return Essa função ira retornar o valor de um produto com desconto.
     */
//    public static double PorcentagemDeProduto(double valorProduto, double porcentagemProduto){
//        double resultado = porcentagemProduto / 100 * valorProduto;
//
//        return resultado;
//    }
}