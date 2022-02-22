
import java.util.Scanner;
import java.util.Stack;

public class Exer2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Double> pilha = new Stack<Double>();

        Stack<Double> pilhaMaior = new Stack<Double>(); // Para valores maiores ou iguais a 60
        Stack<Double> pilhaMenor = new Stack<Double>(); // Para valores menores que 60

        String n;
        String regex = "-?[0-9]+.[0-9]+$"; //Regex para double
        String regex2 = "-?[0-9]+"; //Regex para int

        do {
            System.out.println("\nDigite X para finalizar:\nInforme o número:");
            n = in.next().toUpperCase().trim();

            if (((n.matches(regex) != true) && (n.matches(regex2) != true)) && (n.equals("X") != true)) {
                System.out.println("Entrada invalida, informe novamente!!!");
            } else {
                if (n.equals("X") != true) {
                    pilha.push(Double.parseDouble(n));
                }
            }
        } while (n.equals("X") != true);

        int tam = pilha.size();
        double num,num2, num3;

        System.out.print("\nImprimindo valores da Pilha: ");
        for (int i = 0; i < tam; i++) {
            num = pilha.pop();
            
            if (num >= 60.0) {
                pilhaMaior.push(num);
            } else{
                pilhaMenor.push(num);
            }
            
            System.out.print(num + " | ");
            
        }

        int tamMaior = pilhaMaior.size(), tamMenor = pilhaMenor.size();

        System.out.print("\nImprimindo valores da pilha maiores ou iguais a 60: ");
        for (int i = 0; i < tamMaior; i++) {
            num2= pilhaMaior.pop();
            System.out.print(num2 + " | ");
        }
        System.out.println("\nTamanho da pilha a cima: "+ tamMaior);
        
        System.out.print("\nImprimindo valores da pilha menores que 60: ");
        for (int i = 0; i < tamMenor; i++) {
            num3 = pilhaMenor.pop();
            System.out.print(num3+ " | ");
        }
        System.out.println("\nTamanho da pilha a cima: "+ tamMenor);
    }
}
