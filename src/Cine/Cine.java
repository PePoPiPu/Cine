package Cine;

import Peliculas.Peliculas;
import Sala.Sala;

import java.util.Random;

public class Cine {
    private int aforo = 320;
    public static int numSalas = 14;

    Sala[] salas = new Sala[numSalas];
    Peliculas pelicula = new Peliculas();
    // Cada Cine tiene 14 salas:
    //   A cada sala le tenemos que asignar:
    //      - Un número de sala
    //      - El título de una película
    //      - La duración de una película
    //      - El array de butacas
    public void crearCine() {
        Random rand = new Random();
        for (int i = 0; i < numSalas; i++) {
            String[] infoPelicula = pelicula.crearPeliculas(rand.nextInt(0, 7));
            String titulo = infoPelicula[0];
            String duracion = infoPelicula[1];
            salas[i] = new Sala(i + 1, titulo, duracion, Sala.butacas);
        }

    }

    public void mostrarSalas() {
        for (int i = 0; i < salas.length; i++) {
            System.out.println("Sala: " + salas[i].numSala + " - " + salas[i].pelicula + " - " + salas[i].duracion + " minutos.");
        }
    }
}



