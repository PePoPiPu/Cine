package Sala;
public class Sala {
    public int numSala;
    public String pelicula;
    public String duracion;
    public static String[][] butacas = {
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
    public Sala(int numSala, String pelicula, String duracion, String[][] butacas) {
        this.numSala = numSala;
        this.pelicula = pelicula;
        this.duracion = duracion;
        this.butacas = butacas;
    }
}

