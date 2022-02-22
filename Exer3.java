
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Exer3 {

    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);
        Queue<Integer> fila = new LinkedList<>();
        
        String n;     
        String regex = "-?[0-9]+"; //Regex para int
        
        int soma=0;

        do {
            System.out.println("\nDigite X para finalizar:\nInforme o número:");
            n = in.next().toUpperCase().trim();

            if ((n.matches(regex) != true) && (n.equals("X") != true)) {
                System.out.println("Entrada invalida, informe novamente!!!");
            } else {
                if (n.equals("X") != true) {
                    fila.add(Integer.parseInt(n));
                    soma+= Integer.parseInt(n);
                }
            }
        } while (n.equals("X") != true);
        
        System.out.println("Imprimindo valores da fila: "+ fila);
        System.out.println("A soma dos valores armazenados é: "+soma);
        System.out.println("A media dos valores é: " + (double)soma/fila.size());
        
    }    
}
