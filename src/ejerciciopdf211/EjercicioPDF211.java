
package ejerciciopdf211;

import java.util.Scanner;


public class EjercicioPDF211 {

 
    public static void main(String[] args) {
        int meses;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el mes que desea consultar: ");
        meses = sc.nextInt();
        
        if (meses < 0 || meses > 12 ){
            System.out.println("El mes ingresado es incorrecto.");
        }
        else{
            
            switch(meses){
                case 1: System.out.println("El mes ingresado es enero y tiene 31 dias.");
                case 2: System.out.println("El mes ingresado es febrero y tiene 28 dias.");
                case 3: System.out.println("El mes ingresado es marzo y tiene 31 dias.");
                case 4: System.out.println("El mes ingresado es abril y tiene 30 dias.");
                case 5: System.out.println("El mes ingresado es mayo y tiene 31 dias.");
                case 6: System.out.println("El mes ingresado es junio y tiene 30 dias.");
                case 7: System.out.println("El mes ingresado es julio y tiene 30 dias.");
                case 8: System.out.println("El mes ingresado es agosto y tiene 31 dias.");
                case 9: System.out.println("El mes ingresado es septiembre y tiene 30 dias.");
                case 10: System.out.println("El mes ingresado es octubre y tiene 31 dias.");
                case 11: System.out.println("El mes ingresado es noviembre y tiene 30 dias.");
                case 12: System.out.println("El mes ingresado es diciembre y tiene 31 dias.");
                }
            }
            }
        }
