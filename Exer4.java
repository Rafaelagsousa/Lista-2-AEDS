
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Exer4 {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        Queue<Integer> fila1 = new LinkedList<>();
        Queue<Integer> fila2 = new LinkedList<>();
        Queue<Integer> fila3 = new LinkedList<>();
        
        System.out.println("Informe os valores: ");
        for (int i = 0; i < 8; i++) {
            if(i<4){
                fila1.add(in.nextInt());
            }else{
                fila2.add(in.nextInt());
            }
        }
        
        System.out.println("Primeira fila: "+fila1);
        System.out.println("Segunda fila: "+fila2);        
        
        for (int i = 0; i < 4; i++) {                       
            fila3.add(fila1.element());
            fila3.add(fila2.element());
            
            fila1.remove();
            fila2.remove();
        }
        
        System.out.println("Terceira fila: "+fila3);                
    }
}
