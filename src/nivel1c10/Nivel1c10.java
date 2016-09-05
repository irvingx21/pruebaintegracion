/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nivel1c10;
import java.util.Scanner;

/**
 * programa: nivel1c10
 * descripcion:mayo menor y medio de tres numeros
 * fecha: 11 de junio  del 2014
 * autor: Irving Zambrano
 * @author IRvInG
 */
public class Nivel1c10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1=0;
        int valor2=0;
        int valor3=0;
        int mayor=0;
        int menor=0;
        int medio=0;
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingresar el primer valor ===> ");
        valor1=entrada.nextInt();
        System.out.println("ingresar el segundo valor ===> ");
        valor2=entrada.nextInt();
        System.out.println("ingrese le tercer valor ===> ");
        valor3=entrada.nextInt();
        
        mayor=valor1;
        if
                (valor2>mayor)
        {
            mayor=valor2;
        }
        if
                (valor3>mayor)
        {
            mayor=valor3;
        }
        menor=valor1;
        if
                (valor2<menor)
        {
            menor=valor2;
        }
        if
                (valor3<menor)
        {
            menor=valor3;
        }
        medio=valor1+valor2+valor3-mayor-menor;
        
        System.out.printf("el valor mayor es ==> %d \n",mayor);
        System.out.printf("el valor medio es ==> %d \n",medio);
        System.out.printf("el valor menor es ==> %d \n",menor);
                
        
    }
    
}
