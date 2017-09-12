import java.util.Scanner;

public class MeuTroco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com o valor em centavos: ");
        int centavos = teclado.nextInt();
        int moeda50 = 0;
        int moeda25 = 0;
        int moeda10 = 0;
        int moeda5 = 0;
        int moeda1 = 0;
        while (centavos > 0){
        
        //99
        if (centavos - 50 > 0) {
               centavos = centavos - 50; //99-50 = 49
               moeda50 = moeda50 + 1;   //1
              
         } else {
            if (centavos - 25 > 0) {
               centavos = centavos - 25; //49-25 = 24
               moeda25 = moeda25 + 1;
               
            } else{
                if (centavos - 10 > 0) {
               centavos = centavos - 10;
               moeda10 = moeda10 + 1;
              
            } else {
                    if (centavos - 5 > 0) {
               centavos = centavos - 5;
               moeda5 = moeda5 + 1;
               
                } else {
                        if (centavos - 1 >= 0) {
               centavos = centavos - 1;
               moeda1 = moeda1 + 1;
             
                    }}
                
                }
            
            }
        }
        
    }
        System.out.println("Seu troco possui: " + moeda50 + " moedas de 50, "
                                                + moeda25 + " moedas de 25, "
                                                + moeda10 + " moedas de 10, "
                                                + moeda5 + " moedas de 5 e "
                                                + moeda1 + " moedas de 1 centavo.");
    
}}
