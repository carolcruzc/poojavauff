/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisoresdeumnumero;

import java.util.Scanner;

/**
 *
 * @author Carol
 */
public class DivisoresDeUmNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);
         boolean pesquisaNumero = true;
         
         while(pesquisaNumero){
            System.out.print("Entre com o número que deseja saber os divisores: ");
            int x = teclado.nextInt();
            
            String resultado = "1";
            for (int i = 2; i < x/2; i++) {
		if (x % i == 0) {
                    resultado = resultado+" "+i;    
		}
            }
            if (resultado == "1"){
                System.out.println("Número primo");
            } else{
                resultado = resultado.trim();
                System.out.println("Os divisores são: "+resultado);
            }
                     
            
            
            System.out.print("Deseja pesquisar outro número? 0: Não | 1: Sim --> ");
            int p = teclado.nextInt();
            if (p == 0){
                pesquisaNumero = false;
            }
         }
    }
    
}
