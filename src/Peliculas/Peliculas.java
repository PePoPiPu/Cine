package Peliculas;
public class Peliculas {
    public String titulo;
    public int duracion;

    public Peliculas(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    // Creamos un array de películas.
    public static Peliculas[] crearPeliculas() {
        Peliculas[] peliculas = new Peliculas[14];
        peliculas[0] = new Peliculas("Pobres Criaturas", 142);
        peliculas[1] = new Peliculas("Argylle", 139);
        peliculas[2] = new Peliculas("El bastardo", 127);
        peliculas[3] = new Peliculas("Anyone but you", 93);
        peliculas[4] = new Peliculas("Ocho apellidos marroquís", 87);
        peliculas[5] = new Peliculas("Wonka", 116);
        peliculas[6] = new Peliculas("Patrick", 88);
        peliculas[7] = new Peliculas("Aquaman y el Reino Perdido", 124);
        peliculas[8] = new Peliculas("La sociedad de la nieve", 144);
        peliculas[9] = new Peliculas("The zone of interest", 166);
        peliculas[10] = new Peliculas("Misántropo", 179);
        peliculas[11] = new Peliculas("Perfect Days", 125);
        peliculas[12] = new Peliculas("Concrete Utopia", 130);
        peliculas[13] = new Peliculas("Miller's Girl", 94);
        return peliculas;
    }
}
