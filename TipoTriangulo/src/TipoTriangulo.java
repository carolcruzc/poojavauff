
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carol
 */
public class TipoTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com o valor de x1: ");
        double x1 = teclado.nextInt();
        System.out.print("Entre com o valor de y1: ");
        double y1 = teclado.nextInt();
        System.out.print("Entre com o valor de x2: ");
        double x2 = teclado.nextInt();
        System.out.print("Entre com o valor de y2: ");
        double y2 = teclado.nextInt();
        System.out.print("Entre com o valor de x3: ");
        double x3 = teclado.nextInt();
        System.out.print("Entre com o valor de y3: ");
        double y3 = teclado.nextInt();
        
        if (((x1 == x2) && (x2 == x3)) || ((y1 == y2) && (y2 == y3))){
            System.out.println("Não é um trinângulo");
            
        } else {
            
            double lado1 = Math.sqrt(Math.pow((y2 - y1),2) + Math.pow((x2 - x1),2));
            double lado2 = Math.sqrt(Math.pow((y3 - y2),2) + Math.pow((x3 - x2),2));
            double lado3 = Math.sqrt(Math.pow((y3 - y1),2) + Math.pow((x3 - x1),2));
            
            if ((lado1 == lado2) && (lado2 == lado3)){
                System.out.println("Triângulo é equilátero");
            } else if((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)){
                System.out.println("Triângulo é isósceles");
            } else {
                System.out.println("Trinângulo é escaleno");
            }
        }
    }

    
    
}
