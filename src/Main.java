public class Main {
    public static void main(String[] args){
        int n1 = 20;
        int n2 = 15;

        double resultado = .1 + .2;


        System.out.println(Soma(n1, n2));
        System.out.println(Subtração(n1, n2));
        System.out.println(Multiplicação(n1, n2));
        System.out.println(Divisão(n1, n2));
        System.out.println(Resto(n1, n2));
        System.out.println(resultado);

    }

    public static int Soma(int n1, int n2){
        return n1 + n2;
    }
    public static int Subtração(int n1, int n2){
        return n1 - n2;
    }
    public static int Multiplicação(int n1, int n2){
        return n1 * n2;
    }
    public static double Divisão(double n1, double n2){
        return n1 / n2;
    }
    public static int Resto(int n1, int n2){
        return n1 % n2;
    }
}
