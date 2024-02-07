package Sala;
import Cine.Cine;
import Peliculas.Peliculas;

import java.util.Scanner;

public class Sala {
    public int numSala;
    public String pelicula;
    public static String[][] butacas = new String[10][12];

    public Sala(int numSala, String pelicula, String[][] butacas) {
        this.numSala = numSala;
        this.pelicula = pelicula;
        this.butacas = butacas;
    }
    public static Sala[] crearSalas() {
        Sala[] salas = new Sala[Cine.numSalas];
        for (int i = 0; i < salas.length; i++) {
            String[][] butacas = new String[10][12];
            salas[i] = new Sala(i + 1, "", butacas);
        }
        return salas;
    }
    public static Sala[] salas = Sala.crearSalas();
    public void asignarPelicula(Peliculas[] peliculas) {
        // Se elige una película aleatoria
        int indicePelicula = (int) (Math.random() * peliculas.length); // (int) convierte un decimal a un entero sin tener que usar Math.round()
        this.pelicula = peliculas[indicePelicula].titulo;
    }
    public static void mostrarSalas() {
        // Crea un array de películas
        Peliculas[] peliculas = Peliculas.crearPeliculas();
        // Crea un array de salas
        for (int i = 0; i < Sala.salas.length; i++) {
            String[][] butacas = new String[10][12];
            salas[i] = new Sala(i + 1, "", butacas);
            // Asigna una película a cada sala
            salas[i].asignarPelicula(peliculas);
        }
        for (Sala sala : salas) {
            System.out.println("Sala " + sala.numSala + ": " + sala.pelicula);
        }
    }
    public static void elegirHueco() {
        Scanner entrada = new Scanner(System.in);
        String email = "";
        int opcionButacas[] = {0, 0};
        int opcionSala;
        // Elegimos una sala
        System.out.print("Introduce el número de la sala a la que quieres ir >> ");
        opcionSala = entrada.nextInt();
        // Mostramos las butacas de esa sala, tanto las vacías como las llenas
        for (int i = 0; i < salas[opcionSala].butacas.length; i++) {
            for (int j = 0; j < salas[opcionSala].butacas.length; j++) {
                System.out.print((salas[opcionSala].butacas[i][j] = "vacio") + " ");
            }
            System.out.println();
        }
        // Elegimos una butaca de la sala
        System.out.println("Elige entre una de las butacas >> ");
        for (int i = 0; i < opcionButacas.length; i++) {
            opcionButacas[i] = entrada.nextInt();
        }
        // Le pedimos el e-mail al usuario
        System.out.println("Por favor, introduce tu email >> ");
        email = entrada.next();
        // Actualizamos el array con la nueva información
        for (int i = 0; i < salas[opcionSala].butacas.length; i++) {
            for (int j = 0; j < salas[opcionSala].butacas.length; j++) {
                if(i == opcionButacas[0] && j == opcionButacas[1]){
                    salas[opcionSala].butacas[i][j] = email;
                }
            }
        }
        // Imprimimos el array
        for (int i = 0; i < salas[opcionSala].butacas.length; i++) {
            for (int j = 0; j < salas[opcionSala].butacas.length; j++) {
                System.out.print((salas[opcionSala].butacas[i][j] = "vacio") + " ");
            }
            System.out.println();
        }
    }
    // Se declara el método como static porque si no da un error diciendo que no se puede llamar a un método no static desde un contexto static?????
    public static void mostrarButacas() {
        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas.length; j++) {
                System.out.print((butacas[i][j] = "vacio") + " ");
            }
            System.out.println();
        }
    }
}

