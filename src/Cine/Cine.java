package Cine;

import Peliculas.Peliculas;
import Sala.Sala;

import java.util.Random;
import java.util.Scanner;

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

    public void mostrarSalas() {
        for (int i = 0; i < salas.length; i++) {
            System.out.println("Sala: " + salas[i].numSala + " - " + salas[i].pelicula + " - " + salas[i].duracion + " minutos.");
        }
    }

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



