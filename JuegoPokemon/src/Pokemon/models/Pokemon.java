/*
@version 1.0.0
@author Dilson Hincapie
*/
package Pokemon.models;


public abstract class Pokemon {
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String temporada;

    public Pokemon(int numPokedex, String nombre, double peso, String temporada) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.peso = peso;
        this.temporada = temporada;
    }

    public void atacarPlacaje() {
        System.out.println("Soy " + nombre + " y te estoy atacando con Placaje.");
    }

    public void atacarArañazo() {
        System.out.println("Soy " + nombre + " y te estoy atacando con Arañazo.");
    }

    public void atacarMordisco() {
        System.out.println("Soy " + nombre + " y te estoy atacando con Mordisco.");
    }
}


