package Sala;
import Cine.Cine;
import Peliculas.Peliculas;

import java.util.Scanner;
/**
 * La clase Sala es la clase principal que se usa en este proyecto.<br><br>
 * Se declara con 3 atributos: el número de la sala, el nombre de la película y una matriz que representa las butacas de la sala con su estado (vacío/ocupado).<br><br>
 * Los métodos se explican más abajo.<br><br>
 * @author alexsugimoto
 */

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

    /**
     * Se genera un constructor con todos los atributos de la clase.
     */
    public Sala(int numSala, String pelicula, String[][] butacas) {
        this.numSala = numSala;
        this.pelicula = pelicula;
        Sala.butacas = butacas;
    }
    /**
     * Este método hace lo siguiente:<br><br>
     *      1. Crea un array de objetos con el número de salas que hay definidas en la clase Cine. <br><br>
     *      2. Para cada sala asigna un número de salas, una cadena vacía en el parámetro película y el array de las butacas vacías.<br><br>
     *      3. Crea un array de objetos asignándole el array de películas. Esto lo hace llamando al método {@link Peliculas#crearPeliculas() crearPeliculas}.<br><br>
     *      4. Se asigna una película a cada sala a través de un bucle foreach y llamando al metodo {@link #asignarPelicula(Peliculas.Peliculas[]) asignarPelicula}.<br><br>
     * @return El array de salas
     * @author alexsugimoto
     */
    public static Sala[] crearSalas() {
        Sala[] salas = new Sala[Cine.numSalas];
        for (int i = 0; i < salas.length; i++) {
            salas[i] = new Sala(i + 1, "", butacas);
        }
        // Crea un array de películas
        Peliculas[] peliculas = Peliculas.crearPeliculas();
        // Crea un array de salas
        for (Sala sala : salas) {
            // Asigna una película a cada sala
            sala.asignarPelicula(peliculas);
        }
        return salas;
    }
    /**
     * Declara el array de objetos de manera global haciendo llamada a {@link #crearSalas()}.<br>
     * @author alexsugimoto
     */
    public static Sala[] salas = Sala.crearSalas();
    /**
     * Este método hace lo siguiente:<br><br>
     * @param peliculas el array de peliculas<br><br>
     * 1. Declara un entero y le asigna el resultado de multiplicar un float aleatorio por la longitud del array de peliculas.<br><br>
     * 2. El resultado se convierte en un entero.<br><br>
     * 3. El número resultante se pasa como índice al array de películas y el título se guarda en el atributo this.pelicula del objeto sala.<br><br>
     * @author alexsugimoto
     */
    public void asignarPelicula(Peliculas[] peliculas) {
        // Se elige una película aleatoria
        int indicePelicula = (int) (Math.random() * peliculas.length); // (int) convierte un decimal a un entero sin tener que usar Math.round()
        this.pelicula = peliculas[indicePelicula].titulo;
    }
    /**
     * Este método imprime en consola con un bucle foreach la sala con su número y la película que se emite en esta.
     * @author alexsugimoto
     */

    public static void mostrarSalas() {
        for (Sala sala : salas) {
            System.out.println("Sala " + sala.numSala + ": " + sala.pelicula);
        }
    }
    /**
     * Este método hace lo siguiente:<br><br>
     * 1. Pide al usuario el número de sala a través de la consola.<br><br>
     * 2. Imprime en pantalla la matriz de butacas correspondientes a la sala elegida a través de bucles for anidados.<br><br>
     * 3. Pide al usuario un número de fila y columna y un email.<br><br>
     * 4. Actualiza el array en la posición de la fila y columna elegida y mete la cadena del email.<br><br>
     * 5. Imprime en pantalla de nuevo la matriz de butacas actualizada.<br><br>
     * @author alexsugimoto
     */

    public static void elegirHueco() {
        Scanner entrada = new Scanner(System.in);
        String email;
        int fila, columna;
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
    /**
     * Este método imprime la matriz de butacas correspondiente a la sala elegida por el usuario a través de la consola.
     */
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

