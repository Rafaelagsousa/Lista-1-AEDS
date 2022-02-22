package ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Double> valorProduto = new ArrayList();
        ArrayList<Integer> quantCompra = new ArrayList();

        double valor, total=0;
        int quant;

        do {
            System.out.println("\nDigite valor negativo para finalizar!!");
            System.out.println("Informe o valor do produto:");
            valor = in.nextDouble();

            if (valor > 0) {

                System.out.println("Informe a quantidade do produto:");
                quant = in.nextInt();

                valorProduto.add(valor);
                quantCompra.add(quant);
            }

        } while (valor > 0);

        System.out.println("\n. . . Imprimindo lista . . .\n");
        System.out.println("Preço             Quant.");
        for (int i = 0; i < valorProduto.size(); i++) {
            total+= valorProduto.get(i)*quantCompra.get(i);
            System.out.println(valorProduto.get(i) + "                " + quantCompra.get(i));
        }
       
        System.out.println("\nTotal ............... R$" + total);
    }
}

