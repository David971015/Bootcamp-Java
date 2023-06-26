package Clase_5_operadoresArimeticosLogicos.Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner datosDeUsuario = new Scanner(System.in);

    // Calculadora de edad de perros
    System.out.println("Escriba la edad de su perro: ");
    int edadPerro = datosDeUsuario.nextInt();
    int edadHumanaDePerro = edadPerro * 7;
    System.out.println("Su perro tiene una edad equivalente a " + edadHumanaDePerro + " human age.");


    //Conversor de millas a kilometros
    System.out.println("\n" + "Ingrese una distancia en milla: ");
    float millas = datosDeUsuario.nextFloat();
    float kilometros = millas * 1.60934f;
    System.out.println(millas + " millas es equivalente a " + kilometros + "km \n");

    //Calculadora de descuento
    System.out.println("Ingrese el precio original de su producto: ");
    double precioOriginal = datosDeUsuario.nextDouble();
    System.out.println("Ingrese su porcentaje de descuento: ");
    double descuento = datosDeUsuario.nextDouble();
    double precioFinal = precioOriginal - (precioOriginal * descuento / 100);
    System.out.println("El monto a pagar es: " + precioFinal + " con un descuento del " + descuento + "\n");

    //Calculadora de propinas
    System.out.println("Total a pagar: ");
    double totalDeCuenta = datosDeUsuario.nextDouble();
    System.out.println("Que porcentaje de propina desea dejar?: ");
    double porcentajePropina = datosDeUsuario.nextDouble();
    double propina = totalDeCuenta * (porcentajePropina / 100);
    System.out.println("El total de propina a dejar es: " + propina + "\n" );


    //Juego de adivinar el numero.


    /*
    https://javiergarciaescobedo.es/programacion-en-java/27-estructuras-basicas-de-datos/88-operadores-y-expresiones-relacionales-y-logicos
    Estos  operadores también tiene un criterio de prioridad como en el caso de los operadores aritméticos:
    !
    &&
    ||
    */

    /*Random aleatorio = new Random(System.currentTimeMillis());
    // Producir nuevo int aleatorio entre 0 y 99
    int intAletorio = aleatorio.nextInt(100);
    // Más código
    // Refrescar datos aleatorios
        aleatorio.setSeed(System.currentTimeMillis());
    // ... o mejor
    aleatorio.setSeed(aleatorio.getLong());*/

    Random aleatorio = new Random();
    System.out.println("Este es un juego de adivinar el numero, donde la computadora produce un numero ENTERO aleatorio: \n " );
    System.out.println("""
            Si quiere adivinar de 0-10 introduzca 1:
            Si quiere adivinar de 0-100 introduzca 2:\s
            """);
    int seleccion = datosDeUsuario.nextInt();
    int numeroAleatorio = aleatorio.nextInt(10);

    if (seleccion == 1){
        System.out.println("Usted ha seleccionado adivinar un numero del 0-10");
        System.out.println("Introduzca el numero adivinador: ");
        int numeroAdivinador = datosDeUsuario.nextInt();

        if (numeroAleatorio == numeroAdivinador){
            System.out.println("El numero producido es " + numeroAleatorio + " .Felicitaciones usted a adivinado el numero correctamente");
        }if (numeroAdivinador != numeroAleatorio && numeroAdivinador >= 0 && numeroAdivinador <= 10){
            System.out.println("El numero producido es " + numeroAleatorio + " .Usted no ha adivinado correctamente, intentelo de nuevo.");
        } else{
            System.out.println("El numero introducido no es correcto. El numero a adivinar esta comprendido entre 1-10.");
        }
    }else if (seleccion == 2){
        System.out.println("Usted ha seleccionado adivinar un numero del 0-100");
        System.out.println("Introduzca el numero adivinador: ");
        int numeroAdivinador = datosDeUsuario.nextInt();

        if (numeroAleatorio == numeroAdivinador){
            System.out.println("El numero producido es " + numeroAleatorio + " .Felicitaciones usted a adivinado el numero correctamente");
        }if (numeroAdivinador != numeroAleatorio && numeroAdivinador >= 0 && numeroAdivinador <= 100){
            System.out.println("El numero producido es " + numeroAleatorio + " .Usted no ha adivinado correctamente, intentelo de nuevo.");
        } else{
            System.out.println("El numero introducido no es correcto. El numero a adivinar esta comprendido entre 1-100.");
        }
    }else {
        System.out.println("La opcion seleccionada no es correcta.");
    }
    }
}
