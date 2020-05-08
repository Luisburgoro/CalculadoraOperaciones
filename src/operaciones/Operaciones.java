package operaciones;

import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {// { instancia de la clase
        double x,y;

        Scanner teclado = new Scanner(System.in);
        System.out.println("n°1");
        x=teclado.nextDouble();
        System.out.println("n°2");
        y=teclado.nextDouble();
        System.out.println("la suma es: ");
       suma(x,y);
        System.out.println("la resta es: ");
      resta(x,y);
        System.out.println("la multiplicacion es: ");
      multiplicacion(x,y);
        System.out.println("la division es: ");
      division(x,y);
      mayor(x,y);
        System.out.println("la potencia es: ");
      potencia(x,y);

    }//instancia de la clase };
     // no esta validada ya que no me corresponde esa parte


    // Método para mostrar el resultado
    public static void resultado(double num){
        System.out.println( num);
    }

    //Metodos de operaciones básicas, utilizarán las variables globales, son del tipo double.

    public static void suma(double x, double y){
        resultado(x+y);// se hace la operación suma dentro del metodo resultado
    }
    public static void resta(double x, double y){
        resultado(x-y);// se hace la operación resta dentro del método resultado
    }
    public static void multiplicacion(double x, double y){
        resultado(x*y);// se hace la operación multiplicación dentro del método resultado
    }
    public static void division(double x, double y){
        if(y==0){
            System.out.println("Error: No se puede dividir por 0"); // Caso indeterminado
        }
        else{
            resultado(x/y);//se realiza la operación división dentro del método resultado
        }
    }
    public static void mayor(double x, double y) {
        if (x >= y) {
            System.out.println("El número mayor es " + x);
        } else {
            System.out.println("El número mayor es " + y);
        }// se define con operadores lógicos cual es mayor
    }
    public static void potencia(double x, double y){
        if(x==0 && y==0){
            System.out.println("Error: 0 elevado a 0 está indeterminado"); // Caso indeterminado
        }
        else {
            resultado(Math.pow(x, y));//se realiza la operación potencia dentro del método resultado con la funcion Math.pow de la clase Math.
        }
    }
}
