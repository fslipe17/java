import java.util.Scanner;
public class Equacao {
    public static double delta (double a, double b, double c){
        double resultadoDelta = (b * b) - (4 * a * c);
        return resultadoDelta;
    }
    public static void main (String[] args) {
        double a, b, c;


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite valor de A: ");

        a = sc.nextDouble();

        System.out.println("Digite valor de B: ");

        b = sc.nextDouble();

        System.out.println("Digite valor de C: ");

        c = sc.nextDouble();

        if(delta(a,b,c) < 0){
            System.out.println("A equação não pode ser calculada");
        } else if(delta(a,b,c) < 0){
            double raizUnica = -b/(2*a);
            System.out.println("A resposta da equação é: " + raizUnica);
        }



        System.out.println("Resultado é: " + delta(a, b, c));
    }

}
