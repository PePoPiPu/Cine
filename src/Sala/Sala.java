package Sala;
import Cine.Cine;
import Peliculas.Peliculas;

import java.util.Arrays;
import java.util.Scanner;

public class Sala {
    public int numSala;
    public String pelicula;
    private static String[][] butacas = {
            {"------1--", "---2--", "---3--", "---4--", "---5--", "---6--", "---7--", "---8--", "---9--", ""},
            {"|1| ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío "},
            {"|2| ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío "},
            {"|3| ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío "},
            {"|4| ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío "},
            {"|5| ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío "},
            {"|6| ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío "},
            {"|7| ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío "},
            {"|8| ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío "},
            {"|9| ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío "},
            {"|10| ","vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío ", "vacío "},
    };


    public Sala(int numSala, String pelicula, String[][] butacas) {
        this.numSala = numSala;
        this.pelicula = pelicula;
        this.butacas = butacas;
    }

    public static Sala[] crearSalas() {
        Sala[] salas = new Sala[Cine.numSalas];
        for (int i = 0; i < salas.length; i++) {
            salas[i] = new Sala(i + 1, "", butacas);
        }
        // Crea un array de películas
        Peliculas[] peliculas = Peliculas.crearPeliculas();
        // Crea un array de salas
        for (int i = 0; i < salas.length; i++) {
            // Asigna una película a cada sala
            salas[i].asignarPelicula(peliculas);
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
        for (Sala sala : salas) {
            System.out.println("Sala " + sala.numSala + ": " + sala.pelicula);
        }
    }
    public static void elegirHueco() {
        Scanner entrada = new Scanner(System.in);
        String email = "";
        int fila = 0, columna =0;
        int opcionSala;
        // Elegimos una sala
        System.out.print("Introduce el número de la sala a la que quieres ir >> ");
        opcionSala = entrada.nextInt();
        // Mostramos las butacas de esa sala, tanto las vacías como las llenas
        for (int i = 0; i < salas[opcionSala].butacas[i].length; i++) {
            for (int j = 0; j < salas[opcionSala].butacas[i].length; j++) {
                System.out.print((salas[opcionSala].butacas[i][j]));
            }
            System.out.println();
        }
        // Elegimos una butaca de la sala
        System.out.print("Elige una fila >> ");
        fila = entrada.nextInt();
        System.out.print("Elige una columna");
        columna = entrada.nextInt();
        // Le pedimos el e-mail al usuario
        System.out.println("Por favor, introduce tu email >> ");
        email = entrada.next() + " ";
        // Actualizamos el array con la nueva información
        salas[opcionSala].butacas[fila][columna] = email;

        // Imprimimos el array
        for (int i = 0; i < salas[opcionSala].butacas[i].length; i++) {
            for (int j = 0; j < salas[opcionSala].butacas[i].length; j++) {
                System.out.print((salas[opcionSala].butacas[i][j]) + " ");
            }
            System.out.println();
        }
    }
    // Se declara el método como static porque si no da un error diciendo que no se puede llamar a un método no static desde un contexto static?????
    public static void mostrarButacas() {
        Scanner entrada = new Scanner(System.in);
        int opcionSala;
        // Elegimos una sala
        System.out.print("Introduce el número de la sala que quieres ver >> ");
        opcionSala = entrada.nextInt();
        // Mostramos las butacas de esa sala, tanto las vacías como las llenas
        for (int i = 0; i < salas[opcionSala].butacas[i].length; i++) {
            for (int j = 0; j < salas[opcionSala].butacas[i].length; j++) {
                System.out.print((salas[opcionSala].butacas[i][j]));
            }
            System.out.println();
        }
    }
}

