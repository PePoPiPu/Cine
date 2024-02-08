package Main;
import Cine.Cine;
import Sala.Sala;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Bienvenido a la plataforma de 'Tu Cine'");
            System.out.println("|--------------------------------|");
            System.out.println("| 1. Mostrar salas               |");
            System.out.println("| 2. Elegir sala y butaca        |");
            System.out.println("| 3. Ver butacas                 |");
            System.out.println("| 4. Salir                       |");
            System.out.println("|--------------------------------|");
            System.out.print("Por favor, seleccione una opción >> ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println();
                    Sala.mostrarSalas();
                    break;
                case 2:
                    Sala.elegirHueco();
                    break;
                case 3:
//                    Sala.mostrarButacas();
                    break;
                case 4:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("ERROR: Opción desconocida.");
            }
        } while (opcion != 4);
    }
}

