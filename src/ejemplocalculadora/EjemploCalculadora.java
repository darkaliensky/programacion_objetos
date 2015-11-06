package ejemplocalculadora;
import java.util.Scanner;
/**
 *
 * @author Alonso
 */
public class EjemploCalculadora {

    public static void main(String[] args) {
        Calculadora cal = new Calculadora(10,5);
        Scanner leer = new Scanner(System.in);
        int eleccion = 0;
        double division;
        int resultado;
        
        while (eleccion != 5){  
            System.out.println("Menú");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija la función que desea usar");
            try{
                eleccion = leer.nextInt();   
            } catch (Exception e) {
                System.out.println("Debe elegir un número");
                leer.nextLine();
                System.out.println("Ingrese un número");
                eleccion = leer.nextInt();
            }
            
            if (eleccion == 1){
                resultado = cal.sumarNumeros();
                System.out.println("La suma de los números es " +resultado);
            } else if (eleccion == 2){
                resultado = cal.restarNumeros();
                System.out.println("La resta de los números es " +resultado);
            } else if (eleccion == 3){
                resultado = cal.multiplicarNumeros();
                System.out.println("La multiplicación de los números es " +resultado);
            } else if (eleccion == 4){
                division = cal.dividirNumeros();
                if (division == 0.0){
                    System.out.println("La división por 0 no existe");
                } else {
                    System.out.println("La división de los números es " +division);
                }
            }
        }
    }
    
}
