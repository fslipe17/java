import java.util.Scanner;

public class Casado {
    public static void main (String[] args) {
        String nome, sexo;
        int tempoCasado;
        boolean casado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome?");

        nome = sc.next();

        System.out.println("Insira seu sexo:");

        sexo = sc.next();

        System.out.println("Voce e casado(a)?");
        System.out.println("Responda com 'true' = verdadeiro e 'false' = falso ");

        casado = sc.nextBoolean();

        if(casado == true) {
            System.out.println("Quanto tempo de casado(a)?");

            tempoCasado = sc.nextInt();

            System.out.println("Seu nome e: " + nome);
            System.out.println("Seu sexo e: " + sexo);
            System.out.println("Voce é casado a: " + tempoCasado + "anos");
        }else{
            System.out.println("Seu nome e: " + nome);
            System.out.println("Seu sexo e: " + sexo);
            System.out.println("Voce não é casado!");
        }

        sc.close();
    }
}
