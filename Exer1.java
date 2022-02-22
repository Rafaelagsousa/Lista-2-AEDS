
import java.util.Scanner;
import java.util.Stack;

public class Exer1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<Integer>();

        String n;
        String regex = "-?[0-9]+";

        do {
            System.out.println("\nDigite X para finalizar:\nInforme o número:");
            n = in.next().toUpperCase().trim();

            if ((n.matches(regex) != true) && (n.equals("X") != true)) {
                System.out.println("Entrada invalida, informe novamente!!!");
            } else {
                if (n.equals("X") != true) {
                    pilha.push(Integer.parseInt(n));
                }
            }
        } while (n.equals("X") != true);

        int soma = 0, tam = pilha.size(), num;
        double media;

        System.out.print("\nImprimindo valores da Pilha:");
        for (int i = 0; i < tam; i++) {
            num = pilha.pop();            
            System.out.print(num +" |");
            soma+= num;
        }
        media = soma / tam;
                
        System.out.println("\nO valor da soma é: "+ soma);
        System.out.println("O valor da media é: "+ media);
    }
}
