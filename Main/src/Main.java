import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> idade = new ArrayList();

        int n;

        do {
            System.out.println("Digite valor negativo para finalizar!!");
            System.out.println("Informe a idade:");
            n = in.nextInt();

            if (n > 0) {
                idade.add(n);
            }

        } while (n > 0);

        int contMaior = 0;
        int contMenor = 0;

        for (int i = 0; i < idade.size(); i++) {
            if (idade.get(i) > 18) {
                contMaior++;
            } else {
                contMenor++;
            }
        }

        System.out.println("Idades maiores que 18: " + contMaior);
        System.out.println("Idades menores que 18: " + contMenor);

        System.out.println("A maior idade é: " + Collections.max(idade));
        System.out.println("A maior idade é: " + Collections.min(idade));
    }
}