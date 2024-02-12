package Cine;

import Peliculas.Peliculas;
import Sala.Sala;

import java.util.Random;
import java.util.Scanner;

/**
 * Esta clase es la que tiene la mayoría del código de nuestro programa.<br><br>
 * Se divide en 3 partes principales:<br>
 * 1. Declaración de variables.<br>
 * 2. Constructor vacío.<br>
 * 3. Definición de los métodos.<br><br>
 * @author alexsugimoto
 */
public class Cine {
    private int aforo = 320;
    public int numSalas = 14, numSala, fila, columna;
    private String email = "";
    private Random rand = new Random();
    private Sala[] salas = new Sala[numSalas];
    private Peliculas pelicula = new Peliculas();
    private Scanner entrada = new Scanner(System.in);
    public Cine() {
    }
    // Cada Cine tiene 14 salas:
    //   A cada sala le tenemos que asignar:
    //      - Un número de sala
    //      - El título de una película
    //      - La duración de una película
    //      - El array de butacas
    /**
     * Este método lo usamos para crear un cine después de instanciarlo en el main. Hace lo siguiente:<br><br>
     * 1. Dentro de un bucle for:<br><br>
     * 1.1 Crea un array de Strings con la información de una película. La película se elige pasando como parámetro un número del 0 al 6 al método de {@link Peliculas#crearPeliculas(int) crearPeliculas(i)}.<br>
     * 1.2 Asigna a una variable 'titulo' la posición 0 del array infoPelicula, es decir, el String correspondiente al título de la película.<br>
     * 1.3 Asigna a una variable 'duracion' la posición 1 del array infoPelicula, es decir, el String correspondiente a la duración de la película.<br>
     * 1.4 Asigna a una variable 'butacas' una matriz bidimensional que representa las butacas de una sala de cine.<br>
     * 1.5 A cada sala dentro del array de objetos les asigna el número de sala, el título y duración de la película y el array de butacas vacías.<br><br>
     * @author alexsugimoto
     */
    public void crearCine() {
        for (int i = 0; i < numSalas; i++) {
            String[] infoPelicula = pelicula.crearPeliculas(rand.nextInt(0, 7));
            String titulo = infoPelicula[0];
            String duracion = infoPelicula[1];
            String[][] butacas = {
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
            salas[i] = new Sala(i + 1, titulo, duracion, butacas);
        }

    }
    /**
     * Este método imprime en pantalla todas las salas con su información (número de sala y el título y la duración de la película emitida).<br><br>
     * @author alexsugimoto
     */
    public void mostrarSalas() {
        for (int i = 0; i < salas.length; i++) {
            System.out.println("Sala: " + salas[i].numSala + " - " + salas[i].pelicula + " - " + salas[i].duracion + " minutos.");
        }
    }
    /**
     * Este método hace lo siguiente:<br><br>
     * 1. Pide al usuario el número de la sala a la que quiere ir.<br>
     * 2. Con un bucle for se imprime el array de butacas correspondiente a la sala elegida.<br>
     * 3. Pide al usuario una fila y una columna donde se quiera sentar.<br>
     * 4. Pide al usuario su e-mail.<br>
     * 5. Se actualiza el array en la posición correspondiente a las coordenadas fila, columna introducida por el usuario.<br>
     * 6. Con un bucle for se imprime el array actualizado.<br><br>
     * @author alexsugimoto
     */
    public void elegirHueco() {
        // Pedir al usuario a qué sala quiere ir
        System.out.print("Introduce la sala a la que quieres ir >> ");
        numSala = entrada.nextInt();
        // Imprimimos el array de butacas de la sala
        for (int i = 0; i < salas[numSala].butacas[i].length; i++) {
            for (int j = 0; j < salas[numSala].butacas[i].length; j++) {
                System.out.print(salas[numSala].butacas[i][j]);
            }
            System.out.println();
        }
        // Pedimos al usuario la fila y la columna donde se quiere sentar
        System.out.print("Elige una fila >> ");
        fila = entrada.nextInt();
        System.out.print("Elige una columna >>");
        columna = entrada.nextInt();
        // Pedimos el email del usuario
        System.out.print("Introduce tu e-mail >> ");
        email = entrada.next() + " ";
        // Actualizamos el array con el email en la posición
        salas[numSala].butacas[fila][columna] = email;
        // Imprimimos el array actualizado
        for (int i = 0; i < salas[numSala].butacas[i].length; i++) {
            for (int j = 0; j < salas[numSala].butacas[i].length; j++) {
                System.out.print(salas[numSala].butacas[i][j]);
            }
            System.out.println();
        }
    }
    /**
     * Este método hace lo siguiente:<br><br>
     * 1. Pide al usuario la sala que se quiere examinar.<br>
     * 2. Con un bucle for se imprime el array de butacas correspondiente a la sala elegida.<br><br>
     * @author alexsugimoto
     */
    public void mostrarButacas() {
        System.out.print("Introduce la sala que quieres ver >> ");
        numSala = entrada.nextInt();
        for (int i = 0; i < salas[numSala].butacas[i].length; i++) {
            for (int j = 0; j < salas[numSala].butacas[i].length; j++) {
                System.out.print(salas[numSala].butacas[i][j]);
            }
            System.out.println();
        }
    }
}



