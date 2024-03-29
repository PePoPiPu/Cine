package Peliculas;
/**
 * Esta clase contiene 2 atributos: título y duración de la película.<br>
 * Contiene el método {@link #crearPeliculas() crearPeliculas}.
 * @author alexsugimoto
 */
public class Peliculas {
    public String titulo;
    public int duracion;

    public Peliculas(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public Peliculas(){

    }

    /**
     * Este método hace lo siguiente:<br><br>
     * 1. Se le pasa como parámetro un número entero.
     * 2. Crear un array de 14 objetos 'Peliculas[]'.<br><br>
     * 3. Asigna a cada objeto un título de una película y una duración, ambos hardcodeados.<br>
     * 4. Crea un array de 2 Strings, en la posición 0 va el título de la película y en la posición 1 va la duración de la película, convirtiéndolo a un String.<br>
     * 5. El título y la duración se eligen con el parámetro i.
     *
     * @param i un número entero elegido de forma aleatoria.
     * @return el array de Strings.<br><br>
     * @author alexsugimoto
     */
    Peliculas[] peliculas = new Peliculas[7];
    public String[] crearPeliculas(int i) {
        peliculas[0] = new Peliculas("El Joker", 127);
        peliculas[1] = new Peliculas("Interstellar", 240);
        peliculas[2] = new Peliculas("Los intocables", 134);
        peliculas[3] = new Peliculas("Salvando al soldado Ryan", 150);
        peliculas[4] = new Peliculas("Idi i Smotri", 160);
        peliculas[5] = new Peliculas("Mulan", 134);
        peliculas[6] = new Peliculas("Sin novedad en el frente", 120);

        String[] peliculaInfo = new String[2];
        peliculaInfo[0] = peliculas[i].titulo;
        peliculaInfo[1] = Integer.toString(peliculas[i].duracion);

        return peliculaInfo;
    }

}
