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
}

