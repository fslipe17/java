import java.util.Scanner;
public class Equacao {
    public static void main (String[] args) {
        double a, b, c;


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite valor de A: ");

        a = sc.nextDouble();
        if(a <= 0){
            System.out.println("A equacao nao pode ser calculada se o valor de a for 0. Tente denovo!!");
            System.exit(0);
        }
        System.out.println("Digite valor de B: ");

        b = sc.nextDouble();

        System.out.println("Digite valor de C: ");

        c = sc.nextDouble();

        if(delta(a,b,c) < 0){
            double raizUnica = -b/(2*a);
            System.out.println("Resultado e: " + delta(a, b, c));
            System.out.println("A equacao nao possui raizes reais: " + raizUnica);
        } else if (delta(a,b,c) == 0){
            System.out.println("A equacao possui duas raizes reais");
            System.out.println("Resultado e: " + delta(a, b, c));
        } else if (delta(a,b,c) > 0){
            System.out.println("A equacao possui duas raizes reais");
            System.out.println("Resultado e: " + delta(a, b, c));
        }



        sc.close();
    }
    public static double delta (double a, double b, double c){
        double resultadoDelta = (4 * a * c) - (b * b);
        return resultadoDelta;
    }
}
