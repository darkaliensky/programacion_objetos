package ejemplocalculadora;

/**
 *
 * @author Alonso
 */
public class Calculadora {
    public int num1;
    public int num2;
    
    public Calculadora(int a, int b){
        num1 = a;
        num2 = b;
    }
    
    public int sumarNumeros(){
        int suma;
        suma = num1 + num2;
        return suma;
    }
    
    public int restarNumeros(){
        int resta;
        resta = num1 - num2;
        return resta;
    }
    
    public int multiplicarNumeros(){
        int multiplicar;
        multiplicar = num1 * num2;
        return multiplicar;
    }
    
    public double dividirNumeros(){
        int division;
        division = num1 / num2;
        return division;
    }
}
