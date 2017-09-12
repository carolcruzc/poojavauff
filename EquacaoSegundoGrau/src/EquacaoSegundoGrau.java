
import java.util.Scanner;


/**
 *	ax2 + bx + c = 0	 
 * (recordar	 que	 o  discriminante Δ =	b2 – 4ac,	
 * e que a raiz	r = (–b	± √Δ)/2a).
 * @author Carol
 */
public class EquacaoSegundoGrau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dada a equação ax2 + bx + c	= 0, entre com os valores: ");
        System.out.print("Entre com o valor de a: ");
        double a = teclado.nextDouble();
        System.out.print("Entre com o valor de b: ");
        double b = teclado.nextDouble();
        System.out.print("Entre com o valor de c: ");
        double c = teclado.nextDouble();
        
         
        double delta = (b*b)-(4*a*c);
        if (delta < 0){
            System.out.println("Não há raízes reais. Delta é igual a: "+delta);
        } else {
            double raiz1 = (-b + Math.sqrt(delta))/(2*a);
            double raiz2 = (-b - Math.sqrt(delta))/(2*a);

            System.out.println("Os valores das raízes são: "+raiz1+" e "+raiz2);
        }
        
    }
    
}
