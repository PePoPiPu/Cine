package Sala;
public class Sala {
    public int numSala;
    public String pelicula;
    public String duracion;
    public String[][] butacas;

    /**
     * Se genera un constructor con todos los atributos de la clase.
     */
    public Sala(int numSala, String pelicula, String duracion, String[][] butacas) {
        this.numSala = numSala;
        this.pelicula = pelicula;
        this.duracion = duracion;
        this.butacas = butacas;
    }
}

